import { clickerTypes } from './clicker.types';

export const increment = (amount: number) => (dispatch: any) => {
  dispatch({
    payload: {
      amount
    },
    type: clickerTypes.INCREMENT,
  })
}

