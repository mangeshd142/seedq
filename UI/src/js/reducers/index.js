import { ADD_ARTICLE, REMOVE_ARTICLE, HANDLE_HOME_VIEW_SIGNUP_CLICKED } from "../constants/action-types";
import apiFetch from "../util/fetch";
import { cloneDeep } from "lodash";
import HomeActivity from "./activity/homescreen-activity"
import initialState from "./props/initial-state-data";
 
function rootReducer(state = initialState, action) {
    
    switch(action.type) {

        case HANDLE_HOME_VIEW_SIGNUP_CLICKED:
            return Object.assign({}, state, {
                appData: HomeActivity.showSignupScreen(state.appData)
            });
        break;
        
        case ADD_ARTICLE:
            /*apiFetch("http://localhost:8080/addUser", "POST", "","", 
            {

                firstName:"angad",
                lastName: "Darekar",
                email: "angad@gmail.com",
                password:"1234",
                role: "user"
            });*/
            // state.appData.setIsSignUp(true);
            //console.log(state.appData.getIsSignUp());
            return Object.assign({}, state, {
                articles: state.articles.concat(action.payload)
            });
        break;

        case REMOVE_ARTICLE:
            var arr = [];
            state.articles.forEach(function(a){
                if(a.title != action.payload)
                arr.push(a)
                //apiFetch("http://localhost:8080/profile", "GET", "","", {});
            });
            
            return Object.assign({}, state, {
                articles: arr
            });
        break;

    }

    return state;
};

export default rootReducer;