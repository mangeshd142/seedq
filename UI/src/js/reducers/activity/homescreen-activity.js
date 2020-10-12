import { cloneDeep } from "lodash";
import fetchAPI from "../../util/fetch";
import {forEach} from "lodash";

class HomeScreenActivity {

    static showSignupScreen(appData){
        appData.setIsSignUp(true);
        appData.setIsLogin(false);

        return cloneDeep(appData);
    }
    
    static loading(appData){
        appData.setIsLoading(true);
        return cloneDeep(appData);
    }

    static sucessFetchUsers(appData, response){
        appData.setIsLoading(false);
        let users = appData.getUsers();
        appData.setIsUsers(true);
        users.setUsers(response.success);
        return cloneDeep(appData);
    }

    static failureFetchUsers(appData, massage){
        appData.setIsLoading(false);
        appData.setError(massage);
        return cloneDeep(appData);
    }

}

export default HomeScreenActivity;