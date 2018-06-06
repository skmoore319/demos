import * as React from 'react';

export class ClickerButtonComponent extends React.Component<any, any> {

  constructor(props: any) {
    super(props);
  }


  public render() {
    return (
      <div>
        <button className="btn btn-primary" onClick={() => this.props.increment(1)}>Click!</button>
        {
          this.props.clicks >= 15 &&
            <button className="btn btn-primary" onClick={() => this.props.increment(5)}>Big Click!</button>
        }

        {
          this.props.clicks >= 50 &&
            <button className="btn btn-primary" onClick={() => this.props.buyAuto(1)}>Buy 1 Auto Click</button>
        }
      </div>
    );
  }
}