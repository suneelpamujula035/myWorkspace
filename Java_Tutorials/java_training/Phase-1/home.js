function display(){
  var button = document.getElementById('StartQuiz')
  button.style.display = 'none'
  fetch('questions.json')
  .then(function (response) {
    return response.json();
  })
  .then(function (data) {
    appendData(data);
  })
  .catch(function (err) {
    console.log(err);
  });
}
 

  function appendData(data) {
    var mainContainer = document.getElementById("myData");
    var div =''
    for (var i = 0; i < data.length; i++) {
     
      div += 
      `
      
      <label>${data[i].id}. ${data[i].question}</label>
      <p><input type="radio" name="${data[i].id}"  value = "${data[i].a}"> a. ${data[i].a}</p>
      <p><input type="radio" name="${data[i].id}"  value = "${data[i].b}"> b. ${data[i].b}</p>
      <p><input type="radio" name="${data[i].id}"  value = "${data[i].c}"> c. ${data[i].c}</p>
      <p><input type="radio" name="${data[i].id}"  value = "${data[i].d}"> d. ${data[i].d}</p>
    
      `
    }    

    div += `<div>
    <input type="submit" value="Finish" id="fin" class="btn btn-light" onclick="validate()">
</div>

`
mainContainer.innerHTML = div;
  }
  

  
  function validate(){
    var mainContainer = document.getElementById("myData");
    var score = 0;
    fetch('answers.json')
  .then(function (response) {
    return response.json();
  })
  .then(function (ans) {

    for(let i=0; i < ans.length; i++){
      var selected = document.getElementsByName(ans[i].id)
      for(let j = 0; j < selected.length; j++) {
        if(selected[j].checked){
          if(selected[j].value === ans[i].answer){
            score++;
        }
      }
    }
  }

    mainContainer.innerHTML = `<h1 id="score">Your result : ${score}</h1>`

  })

  }

  

  