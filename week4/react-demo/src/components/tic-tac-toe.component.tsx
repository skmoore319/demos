import * as React from 'react';


export class TicTacToeComponent extends React.Component<any, any> {

  constructor(props: any) {
    super(props);

    this.state = {
      game: [
        ['', '', ''],
        ['', '', ''],
        ['', '', ''],
      ],
      message: '',
      playerTurn: true, // true p1, false p2
      winner: 0
    }
  }

  public makeMove(rowNumber: number, colNumber: number) {
    if (this.state.winner || this.state.game[rowNumber][colNumber]) {
      return;
    }
    const newGameState = this.state.game;
    newGameState[rowNumber][colNumber] = this.state.playerTurn ? 'x': 'o';
    this.setState({...this.state, game: newGameState, playerTurn: !this.state.playerTurn})
    const winner = this.isGameOver();
    if (winner > 0) {
      this.setState({...this.state, winner, message: `Game over: Player ${this.state.playerTurn ? 'x' : 'o'} wins`})
    } else if (winner === -1) {
      this.setState({...this.state, winner, message: 'Draw'});
    } 
  }

  public reset() {
    this.setState({
      game: [
        ['', '', ''],
        ['', '', ''],
        ['', '', ''],
      ],
      message: '',
      playerTurn: true, // true p1, false p2
      winner: 0
    });
  }

  public render() {
    return (
      <div className="centered-content-container">
        <h4>
          {
            this.state.winner 
              ? this.state.message
              : `Player ${this.state.playerTurn ? 'x' : 'o'}'s turn`
          }
        </h4>
        <div className="container" id="tic-tac-board">
          {
            this.state.game.map((row: any, rowNumber: any) => 
              <div key={'row-' + rowNumber} id={'row-' + rowNumber} className="row">
                {
                  row.map((col: any, colNumber: any) => 
                    <div key={`row-${rowNumber}-col-${colNumber}`} 
                        className={'col-4 tic-tac-col ' + (col ? 'not-allowed-cursor' : 'pointer')}
                        onClick={() => this.makeMove(rowNumber, colNumber)}>
                      {col}
                    </div>
                  )
                }
              </div>
            )
          }
        </div>
        {this.state.winner !== 0 && 
          <button className="btn btn-primary" onClick={this.reset.bind(this)}> Reset </button>
        }
      </div>
    );
  }

  /**
   * This is not currently best practices, 
   * it should return 0 for not over 1 for player 1 wins, 2 for player 2 wins, and -1 for draw
   * or something along those lines
   */

  private isGameOver() {
    let winner = 0;
    // check rows kinda alright solution
    const isOver = this.state.game.some((row: any) => {
      const joined = row.join('');
      if (joined === 'xxx') {
        winner = 1;
        return true;
      }
      if (joined === 'ooo') {
        winner = 2
        return true;
      }
      return false;
    });
    
    if (isOver) {
      return winner;
    }


    if (this.state.winner) {
      return this.state.winner;
    }

    // col check
    for (let i = 0; i < 3; i++) {
      const col = this.state.game[0][i] + this.state.game[1][i] + this.state.game[2][i];
      if (col === 'ooo') {
        return 2;
      }
      if(col === 'xxx') {
        return 1;
      }
    }

    // diagonal checks
    const diag1 = this.state.game[0][0] + this.state.game[1][1] + this.state.game[2][2];
    if (diag1 === 'ooo') {
      return 2;
    } 
    if(diag1 === 'xxx') {
      return 1;
    }
    const diag2 = this.state.game[0][2] + this.state.game[1][1] + this.state.game[2][0];
    if (diag2 === 'ooo') {
      return 2;
    }
    if (diag2 === 'xxx') {
      return 1;
    }

    const draw = !this.state.game.some((row: any) => row.filter((tile: any) => tile === '').length > 0);
    if (draw) {
      return -1
    }
  }

}