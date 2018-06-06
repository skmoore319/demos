import { connect } from 'react-redux';
import { IState } from '../../reducers';
import { increment } from '../../actions/clicker/clicker.actions';
import { ClickerComponent } from './clicker.component';

const mapStateToProps = (state: IState) => (state.clicker);

export const mapDispatchToProps = {
  increment
};

export const ClickerContainer = connect(
  mapStateToProps,
  mapDispatchToProps,
)(ClickerComponent);
