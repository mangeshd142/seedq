function apiFetch(url, method, sucessFunc, errorFunc,body){

    /**/

      if(method == "GET"){
        fetch(url)
        .then(response => response)
        .then(data => console.log(data))
        .catch(function (error) {
          console.log('Request failed', error);
        });;
      } else{
        fetch(url, {
          method: method,
          headers: {
            "Content-type": "application/x-www-form-urlencoded; charset=UTF-8"
          },
          body: body
        })
        .then(function(response){return response.json()} )
        .then(function (data) {
          console.log('Request succeeded with JSON response', data);
        })
        .catch(function (error) {
          console.log('Request failed', error);
        });
      }
      
}

export default apiFetch;