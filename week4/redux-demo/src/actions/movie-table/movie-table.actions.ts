import { movieTableTypes } from "./movie-table.types";


export const updateYear = (year: number) => {
  return {
    payload: {
      year
    },
    type: movieTableTypes.UPDATE_YEAR,
  }
}

export const updateMovies = (year: number) => (dispatch: any) => {
  fetch('http://localhost:3001/movies/year/' + year, {credentials: 'include'})
    .then(resp => {
      console.log(resp.status)
      if(resp.status === 401 || resp.status === 403) {
        throw new Error('Invalid permissions');
      }
      return resp.json();
    })
    .then((movies) => {
      dispatch({
        payload: {
          movies
        },
        type: movieTableTypes.UPDATE_MOVIES,
      })
    })
    .catch(err => {
      console.log(err);
    });

}