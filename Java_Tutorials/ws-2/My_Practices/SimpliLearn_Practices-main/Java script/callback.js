//const axios = require ('axios');

/*
1.Passing 10 as the initial value to the Step
2.If there is no error, then passing the result to step2
3.If there is no error again, then passing the result to step3
4.Finally printing the result
*/


step1(10, function(result1,error){
    if(!error){
        step2(result1,function(result2,error){
            if(!error){
                step3(result2, function(result3,error){
                    if(!error){
                        console.log("Result is : "+result3);
                    }
                })
            }
        })
    }
})
function step1(value,callback){// insted of callback we can write any name (We write callback name for naming convention)
    callback(value+10,false);
}
function step2(value,callback){
    callback(value+10,false)
}
function step3(value,callback){
    callback(value+10,false)
}