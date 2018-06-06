import { combineReducers } from "redux";
import { ticTacToeReducer } from "./tic-tac-toe.reducer";
import { clickerReducer } from "./clicker.reducer";

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
  ticTacToe: ITicTacToeState
};

export const state = combineReducers<IState>({
  clicker: clickerReducer,
  ticTacToe: ticTacToeReducer,
  
});