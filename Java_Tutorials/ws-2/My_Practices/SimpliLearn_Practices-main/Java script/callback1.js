//Callback functions

function func1(x,callback){
    console.log("I'm Function1");
    console.log(x);
    callback();
}

function func2(){
    console.log("I'm Function2");
}

// func1();
// func2();

//func1("Hello ",func2);

setTimeout(func2,5000);//It will execute after 5 seconds