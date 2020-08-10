/**
 * Created by CS99 on 07/03/2017.
 */
import React from 'react';
import BriksData from '../tack/mock-data-for-briks1';
import BriksData2 from '../tack/mock-data-for-briks2';
import _ from 'lodash';
let iAnglePosition = -5;
let iUpDownPosition = -5;
let iBallSpeed = 50;
let strong = '#484140';
let middle = '#BB3927';
let low = '#CC944D';
class BricksBox extends React.Component {

 
  getInitialState: function () {
    let initialState = {
      briks: new BriksData,
      slider: {
        marginLeft: 220
      },
      huntingBall: {
        marginLeft: 249,
        marginTop: 468
      },
      score: 0
    };
    return initialState;
  },

  componentDidMount: function () {
    let intervalId = setInterval(this.timer, iBallSpeed);
    // store intervalId in the state so it can be accessed later:
    this.setState({intervalId: intervalId});
  },

  componentWillUnmount: function () {
    // use intervalId from the state to clear the interval
    clearInterval(this.state.intervalId);
  },

  keyPress: function (oEvent) {
    let oState = this.state;
    let iMarginLeft = oState.slider.marginLeft;
    this.setState(oState);
    if (oEvent.keyCode == 74 || oEvent.keyCode == 37) {
      if (iMarginLeft >= 10) {
        oState.slider.marginLeft = iMarginLeft - 10;
      }
    }
    else if (oEvent.keyCode == 75 || oEvent.keyCode == 39) {
      if (iMarginLeft <= 420) {
        oState.slider.marginLeft = iMarginLeft + 10;
      }
    }
    this.setState(oState);
  },

  timer: function () {
    let oState = this.state;
    let iMarginTop = oState.huntingBall.marginTop;
    let iMarginLeft = oState.huntingBall.marginLeft;


    if (iMarginLeft <= 3) {
      iAnglePosition = 5;
    }
    else if (iMarginTop <= 3) {
      iUpDownPosition = 5;
    }
    else if (iMarginLeft >= 490) {
      iAnglePosition = -5;
    }
    else if (iMarginTop >= 470 && ((oState.slider.marginLeft - 10) < iMarginLeft && (oState.slider.marginLeft + 60) > iMarginLeft)) {
      iUpDownPosition = -5;
    }
    else if (iMarginTop >= 490) {
      alert("Game Over, Your score is " +this.state.score);
      iUpDownPosition = -5;
      iAnglePosition = -5;
      oState.slider.marginLeft = 220;
      iMarginLeft = 249;
      iMarginTop = 468;
      this.state.score = 0;
      this.state.briks = new BriksData
    } else {
      let _this = this;
      _.remove(this.state.briks, function (obrik) {
        if ((oState.huntingBall.marginTop > obrik.marginTop-8) && (oState.huntingBall.marginTop < obrik.marginTop + 10) && (oState.huntingBall.marginLeft > obrik.marginLeft - 15)
            && (oState.huntingBall.marginLeft < obrik.marginLeft + 45)) {
          _this.iUpDownPosition = iUpDownPosition;
          _this.state.score++;
          if(obrik.strength != 1){
              obrik.strength--;
          }else{
              return obrik;
          }

        }
      });
      if(_.isEmpty(this.state.briks)){
          _this.state.score = _this.state.score+50;
          alert("1st Level complete and 1st Level Score is: " +_this.state.score);

          this.state.briks = BriksData2;
          iBallSpeed = iBallSpeed-10;
          oState.slider.marginLeft = 220;
          iMarginLeft = 249;
          iMarginTop = 468;
          let intervalId = setInterval(this.timer, iBallSpeed);
          this.state.intervalId= intervalId;
      }
    }
    oState.huntingBall.marginTop = iMarginTop + iUpDownPosition;
    oState.huntingBall.marginLeft = iMarginLeft + iAnglePosition;
    this.setState(oState);
  },
  getBricks: function (oStyle) {
    return (<div className="breakingBricks" style={oStyle}></div>);
  },

  render: function () {
    let aBricks = [];
    let _this = this;
    _.forEach(this.state.briks, function (oBrick) {
      let sColor = '';
      if(oBrick.strength == 3){
          sColor = strong;
      } else if(oBrick.strength == 2){
          sColor = middle;
      } else if(oBrick.strength == 1){
          sColor = low;
      }
      let oStyle = {
        marginLeft: oBrick.marginLeft,
        marginTop: oBrick.marginTop,
        backgroundColor: sColor
      };
      aBricks.push(_this.getBricks(oStyle));
    });

    return (
        <div className="mainDiv" onKeyDown={this.keyPress} tabIndex="0">
          <div className="brickBox">
            {aBricks}
            <div className="huntingBall" style={this.state.huntingBall}></div>
            <div className="slider" style={this.state.slider}></div>
          </div>
        </div>
    );
  }
};
module.exports = BricksBox;