import React from "react";
import { connect } from "react-redux";
import { removeArticle } from "../actions/index";
function mapDispatchToProps(dispatch) {
  return {
    removeArticle: article => dispatch(removeArticle(article))
  };
}

const mapStateToProps = state => {
  return { articles: state.articles };
};
class ConnectedList extends React.Component {
    constructor(props) {
      super(props);
      this.removeArticle = this.removeArticle.bind(this);
    }
    
    removeArticle(article){
        this.props.removeArticle(article);
    }

    render() {
        var {articles} = this.props;
        return(
            <ul >
                {articles.map(el => (
                <li key={el.id} onClick={this.removeArticle.bind(this, el.title)}>{el.title}</li>
                ))}
            </ul>
            );
    }
};
const List = connect(mapStateToProps, mapDispatchToProps)(ConnectedList);
export default List;