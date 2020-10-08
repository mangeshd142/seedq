import { cloneDeep } from "lodash";

class HomeScreenActivity {

    static showSignupScreen(appData){
        appData.setIsSignUp(true);
        appData.setIsLogin(false);

        return cloneDeep(appData);
    }

}

export default HomeScreenActivity;