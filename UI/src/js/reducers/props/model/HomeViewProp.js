import users from "./user-view-props";
class HomeViewProp {
    
    #isLogin = false;
    #isSignup = false;
    #isUsers = false;
    #error = null;
    #isLoading = false;

    users = new users();

    setIsLogin=(bISLogin)=>{
        this.#isLogin = bISLogin;
    }

    getIsLogin=()=>{
        return this.#isLogin;
    }

    setIsSignUp=(bIsSignup)=>{
        this.#isSignup = bIsSignup;
    }

    getIsSignUp=()=>{
        return this.#isSignup;
    }
    
    setIsUsers=(isUsers)=>{
        this.#isUsers = isUsers;
    }

    getIsUsers=()=>{
        return this.#isUsers;
    }

    getUsers() {
        return this.users;
    }

    setIsLoading=(isLoading)=>{
        this.#isLoading = isLoading;
    }

    getIsLoading=()=>{
        return this.#isLoading;
    }

    setError=(error)=>{
        this.#error = error;
    }

    getError=()=>{
        return this.#error;
    }

}

export default HomeViewProp;