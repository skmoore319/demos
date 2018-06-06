import { ticTacToeTypes } from '../actions/tic-tac-toe/tic-tac-toe.types'
import { ITicTacToeState } from '.';

const initialState: ITicTacToeState = {
  game: [
    ['','',''],
    ['','',''],
    ['','',''],
  ],
  message: '',
  playerTurn: true,
  winner: 0
}

export const ticTacToeReducer = (state = initialState, action: any) => {
  switch (action.type) {
    case ticTacToeTypes.MAKE_MOVE:
      return {
        ...state,
        game: action.payload.game,
        playerTurn: action.payload.playerTurn
      };
    case ticTacToeTypes.END_GAME:
      return {
        ...state,
        message: action.payload.message,
        winner: action.payload.winner
      };
    case ticTacToeTypes.RESET:
      return action.payload;
  }

  return state;
};
