
function fetchAPI(url, method, sucessFunc, errorFunc, _body){
    let body = JSON.stringify(_body);
    let requestInfo = {
      method: method,
      headers: {
        "Content-type": "application/json; charset=UTF-8"
      },
      body: body
    }
    
    return fetch(url, requestInfo)
    .then(response => response.json() )
    .then(function (data) {
      console.log('Request succeeded with JSON response', data);
      return sucessFunc(data);
    })
    .catch(function (error) {
      console.log('Request failed', error);
    });
      
}

export default fetchAPI;