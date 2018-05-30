import express, { Response } from 'express';
import * as movieService from '../services/movie-service';

export const movieRouter = express.Router();

movieRouter.get('/title/:title/year/:year', (req, resp) => {
  movieService.findByYearAndTitle(parseInt(req.params.year), req.params.title)
    .then(data => {
      resp.json(data.Item);
    })
    .catch(err => {
      resp.sendStatus(500);
    });
});

movieRouter.get('/year/:year', [
  (req, resp, next) => {
    console.log('first');
    next();
  },
  (req, resp: Response, next) => {
    movieService.findAllByYear(parseInt(req.params.year))
      .then(data => {
        resp.json(data.Items);
      })
      .catch(err => {
        console.log(err);
        resp.sendStatus(500);
      });
  }
]);

movieRouter.put('', (req, resp) => {
  movieService.update(req.body)
    .then(data => {
      resp.json(data);
    })
    .catch(err => {
      console.log(err);
      resp.sendStatus(500);
    })
})

