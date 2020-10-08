class HomeViewProp {
    
    #isLogin = false;
    #isSignup = false;
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

}

export default HomeViewProp;