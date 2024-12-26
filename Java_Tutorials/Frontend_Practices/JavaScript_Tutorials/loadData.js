// var json = $.getJSON("emp.json", function(json) {
//     console.log(json); // this will show the info it in firebug console
// });

fetch("emp.json")
  .then(response => response.json())
  .then(json => console.log(json));