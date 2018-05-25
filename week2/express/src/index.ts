import express from 'express';
import {Request, Response, NextFunction} from 'express';
import { pizzaRouter } from './routers/pizza-router';
import bodyParser from 'body-parser';

const app = express();

const port = 3000;
app.set('port', port);

/**
 * Log all requests url and method to the console
 */
app.use((req: Request, resp: Response, next: NextFunction) => {
  console.log(`request was made with url: ${req.path}
and method: ${req.method}`);
  next();
});

// Register the body parser to convert request json to an actual object
app.use(bodyParser.json());

/************************************************************
 * Register Routers
 ***********************************************************/
app.use('/pizzas', pizzaRouter);

app.listen(port, () => {
  console.log(`app is running at http://localhost:${app.get('port')}`);
});