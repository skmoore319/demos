import { combineReducers } from "redux";
import { ticTacToeReducer } from "./tic-tac-toe.reducer";
import { clickerReducer } from "./clicker.reducer";
import { signInReducer } from "./sign-in.reducer";

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

export interface IState {
  clicker: {
    clicks: number
  },
  ticTacToe: ITicTacToeState,
  signIn: ISignIn
};

export const state = combineReducers<IState>({
  clicker: clickerReducer,
  signIn: signInReducer,
  ticTacToe: ticTacToeReducer,
});