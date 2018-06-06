import { combineReducers } from "redux";
import { ticTacToeReducer } from "./tic-tac-toe.reducer";
import { clickerReducer } from "./clicker.reducer";
import { signInReducer } from "./sign-in.reducer";
import { Movie } from "../model/Movie";
import { movieTableReducer } from "./movie-table.reducer";

export interface ISignIn {
  username: string,
  password: string,
  errorMessage: string
}

export interface ITicTacToeState {
  game: string[][],
  message: string,
  playerTurn: boolean, // true p1, false p2
  winner: number
}

export interface IMovieTable {
  movies: Movie[],
  year: number
}

export interface IState {
  clicker: {
    clicks: number
  },
  ticTacToe: ITicTacToeState,
  signIn: ISignIn,
  movieTable: IMovieTable
};

export const state = combineReducers<IState>({
  clicker: clickerReducer,
  movieTable: movieTableReducer,
  signIn: signInReducer,
  ticTacToe: ticTacToeReducer,
});