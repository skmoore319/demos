import * as movieDao from './dao/movie-dao';
import fs from 'fs';

// movieDao.saveMovie({
//   year: 2018,
//   title: 'Infinity War',
//   rating: 10,
//   description: 'Nobody dies'
// }).then(data => {
//     console.log(`Created item: \n ${JSON.stringify(data, undefined, 2)}`);
//   })
//   .catch(err => {
//         console.log(`Unable to creat item: \n ${JSON.stringify(err, undefined, 2)}`);
//   })

// fs.readFile(__dirname + '/dao/dummy-data/movies-data.json', 'utf8', (err, data) => {
//   const movies = JSON.parse(data); // create an array of movie objects from the string
//   recursiveSave(movies, 0);
// })

// function recursiveSave(arr, i) {
//   console.log(`saving ${arr[i].title}`)
//   movieDao.saveMovie(arr[i])
//     .then(() => {
//       if(i >= arr.length) {
//         console.log('done');
//         return;
//       }
//       i++;
//       recursiveSave(arr, i);
//     })
//     .catch(() => {
//       if(i >= arr.length) {
//         console.log('done');
//         return;
//       }
//       i++;
//       recursiveSave(arr, i);
//     })
// }

movieDao.findAllByYear(2015).then(data => {
  data.Items.forEach(movie => {
    console.log(movie);
  });
})
.catch(err => {
  console.log(err);
})

