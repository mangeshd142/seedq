import { ADD_ARTICLE, REMOVE_ARTICLE, HANDLE_HOME_VIEW_SIGNUP_CLICKED, HANDLE_HOME_VIEW_SHOW_USERS_CLICKED } from "../constants/action-types";
import apiFetch from "../util/fetch";
import { cloneDeep } from "lodash";
import HomeActivity from "./activity/homescreen-activity"
import initialState from "./props/initial-state-data";
import { HANDLE_HOME_VIEW_SUCCESS_USER_FETCH } from "../constants/action-types";
import { HANDLE_HOME_VIEW_FAILURE_USER_FETCH } from "../constants/action-types";
import { HANDLE_HOME_VIEW_LOADING } from "../constants/action-types";
 
function rootReducer(state = initialState, action) {
    
    switch(action.type) {

        case HANDLE_HOME_VIEW_SIGNUP_CLICKED:
            return Object.assign({}, state, {
                appData: HomeActivity.showSignupScreen(state.appData)
            });
        break;
        
        case HANDLE_HOME_VIEW_SUCCESS_USER_FETCH:
            return Object.assign({}, state, {
                appData: HomeActivity.sucessFetchUsers(state.appData, action.payload)
            });
        break;

        case HANDLE_HOME_VIEW_FAILURE_USER_FETCH:
            return Object.assign({}, state, {
                appData: HomeActivity.failureFetchUsers(state.appData)
            });
        break;

        case HANDLE_HOME_VIEW_LOADING:
            return Object.assign({}, state, {
                appData: HomeActivity.loading(state.appData)
            });
        break;

    }

    return state;
};

export default rootReducer;