import { ADD_ARTICLE, REMOVE_ARTICLE } from "../constants/action-types";
import apiFetch from "../util/fetch";
 
const initialState = {
    articles: []
};
function rootReducer(state = initialState, action) {
    if (action.type === ADD_ARTICLE) {
        apiFetch("http://localhost:8080/addUser", "POST", "","", 
        {

            firstName:"angad",
            lastName: "Darekar",
            email: "angad@gmail.com",
            password:"1234",
            role: "user"
        });
        return Object.assign({}, state, {
            articles: state.articles.concat(action.payload)
          });
    }
    if (action.type === REMOVE_ARTICLE) {
        var arr = [];
        state.articles.forEach(function(a){
            if(a.title != action.payload)
            arr.push(a)
            //apiFetch("http://localhost:8080/profile", "GET", "","", {});
        });
        
        return Object.assign({}, state, {
            articles: arr
        });
    }
    return state;
};

export default rootReducer;