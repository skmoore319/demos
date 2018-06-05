import * as React from 'react';
import { ClickerDisplayComponent } from './click-display.component';
import { ClickerButtonComponent } from './click-button.component';


export class ClickerComponent extends React.Component<any, any> {

  constructor(props: any) {
    super(props);
    this.state = {
      clicks: 20
    };
  }
  
  public increment(amount: number) {
    this.setState({clicks: this.state.clicks + amount});
  }


  public render() {
    return (
      <div>
        <ClickerDisplayComponent clicks={this.state.clicks} />
        <ClickerButtonComponent clicks={this.state.clicks} increment={this.increment.bind(this)}/>
      </div>
    );
  }
}