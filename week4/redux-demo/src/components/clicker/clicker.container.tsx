import { connect } from 'react-redux';
import { IState } from '../../reducers';
import { increment, buyAuto } from '../../actions/clicker/clicker.actions';
import { ClickerComponent } from './clicker.component';

const mapStateToProps = (state: IState) => (state.clicker);

export const mapDispatchToProps = {
  buyAuto,
  increment,
};

export const ClickerContainer = connect(
  mapStateToProps,
  mapDispatchToProps,
)(ClickerComponent);
