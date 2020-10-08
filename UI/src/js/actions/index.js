import { ADD_ARTICLE } from "../constants/action-types";
import { REMOVE_ARTICLE } from "../constants/action-types";
import { HANDLE_HOME_VIEW_SIGNUP_CLICKED } from "../constants/action-types";

export function addArticle(payload) {
    return { type: ADD_ARTICLE, payload }
};

export function removeArticle(payload) {
    return { type: REMOVE_ARTICLE, payload }
};

export function showSignUp() {
    return { type: HANDLE_HOME_VIEW_SIGNUP_CLICKED}
};