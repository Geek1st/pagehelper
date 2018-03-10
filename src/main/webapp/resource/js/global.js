domain = <%=request.getScheme()%> + "" + <%=request.getScheme()%>;
console.log(domain + "/sw.js")
if ('serviceWorker' in navigator) {
  navigator.serviceWorker.register(domain + '/sw.js').then(function(registration) {
    // Registration was successful
    console.log('ServiceWorker registration successful with scope: ',    registration.scope);
  }).catch(function(err) {
    // registration failed :(
    console.log('ServiceWorker registration failed: ', err);
  });
}

