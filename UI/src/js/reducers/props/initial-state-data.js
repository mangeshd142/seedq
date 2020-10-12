import HomeViewProp from "./model/HomeViewProp";
import UserViewProps from "./model/user-view-props";

const initialState = {
    appData: new HomeViewProp(),
    articles: [],
    users: new UserViewProps()
}

export default initialState;