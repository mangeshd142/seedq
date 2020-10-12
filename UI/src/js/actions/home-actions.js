import { ADD_ARTICLE } from "../constants/action-types";
import { REMOVE_ARTICLE } from "../constants/action-types";
import { HANDLE_HOME_VIEW_SIGNUP_CLICKED } from "../constants/action-types";
import { HANDLE_HOME_VIEW_SHOW_USERS_CLICKED } from "../constants/action-types";
import { HANDLE_HOME_VIEW_SUCCESS_USER_FETCH } from "../constants/action-types";
import { HANDLE_HOME_VIEW_FAILURE_USER_FETCH } from "../constants/action-types";
import { HANDLE_HOME_VIEW_LOADING } from "../constants/action-types";
import requestServer from "../util/axios";

export function addArticle(payload) {
    return { type: ADD_ARTICLE, payload }
};

export function removeArticle(payload) {
    return { type: REMOVE_ARTICLE, payload }
};

export function showSignUp() {
    return { type: HANDLE_HOME_VIEW_SIGNUP_CLICKED}
};

export function getUsers() {
    return { type: HANDLE_HOME_VIEW_SHOW_USERS_CLICKED}
}

export function fetchUsersSuccess(payload) {
    return { type: HANDLE_HOME_VIEW_SUCCESS_USER_FETCH, payload}
}

export function fetchUsersFailure(payload) {
    return { type: HANDLE_HOME_VIEW_FAILURE_USER_FETCH, payload} 
}

export function loding() {
    return { type: HANDLE_HOME_VIEW_LOADING}
}

export function fetchUsers() {
    return (dispatch)=> {
        dispatch(loding());
        requestServer("http://localhost:8080/fetchUsers", "GET", fetchUsersSuccess, fetchUsersFailure, dispatch)
    }
} 