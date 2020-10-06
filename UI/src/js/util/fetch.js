
function apiFetch(url, method, sucessFunc, errorFunc,body){
    var body = JSON.stringify(body);
        
      if(method == "GET"){
        fetch(url)
        .then(response => response.json())
        .then(data => console.log(data))
        .catch(function (error) {
          console.log('Request failed', error);
        });;
      } else{
        fetch(url, {
          method: method,
          headers: {
            "Content-type": "application/json; charset=UTF-8"
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