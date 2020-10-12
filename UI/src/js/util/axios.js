import axios from "axios";

let requestServer = function(url, method, successFunc, failuerFunc, dispatch, data){

    if(method === "GET"){
        return axios
        .get(url)
        .then(response => {
            // response.data is the users
            const users = response.data
            
            dispatch(successFunc(users))
        })
        .catch(error => {
            // error.message is the error message
            dispatch(failuerFunc(error.message))
        })
    }
    else if(method === "POST"){
        let options =  {
            "Content-type": "application/json; charset=UTF-8"
          }
        return axios
        .post('/login', data, options)
        .then((response) => {
            console.log(response);
            const users = response.data
            dispatch(successFunc(users))
        })
        .catch(error => {
            // error.message is the error message
            dispatch(failuerFunc(error.message))
        })
    }
}

export default requestServer;