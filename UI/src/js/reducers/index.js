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

    }

    return state;
};

export default rootReducer;