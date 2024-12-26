function validate(){
    var score = 0;
    var q1 = document.quiz.question1.value;
    var q2 = document.quiz.question2.value;
    var q3 = document.quiz.question3.value;

    var result = document.getElementById("res");
    var quiz = document.getElementById("quiz");

    if(q1=="Delhi"){score++}
    if(q2=="1947"){score++}
    if(q3=="Telugu"){score++}
    document.write(score);

    quiz.style.display="none";
    result.textContent=`${result}`;
}

var a;
function startQuiz(){
    if(a==1)
    {
        document.getElementById.style.display="inline";
        return a=0;
    }
    else
    {
        document.getElementById.style.display="none";
        return a=1;
    }
}