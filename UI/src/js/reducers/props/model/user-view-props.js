class UserViewProps {
    
    #users = [];
    setUsers=(users)=>{
        this.#users = users;
    }

    getUsers=()=>{
        return this.#users;
    }

}

export default UserViewProps;