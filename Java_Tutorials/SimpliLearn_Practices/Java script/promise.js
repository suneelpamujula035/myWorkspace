//using ES5 style
// var result=false;
// var obj1=new Promise(function(resolve,reject){
//     if(result){
//         resolve("Done the task");
//     }
//     else{
//         reject("Error generated");
//     }
// })

// obj1.then(result=>console.log("In Then "+result))
// .catch(error=>console.log("In Error "+error));

// fetch("https://jsonplaceholder.typicode.com/todos").then(res=>res.json())
// .then(result=>console.log(result)).catch(error=>console.log(error));
// console.log("1st statement");
// console.log("2nd statement");
// console.log("3rd statement");

async function loadData(){
    try{
        var obj=await fetch("https://jsonplaceholder.typicode.com/todos")
    var res=await obj.json();
    console.log(res);
    }catch(Ex){
        console.log(Ex);
    }
    console.log("Normal statement");
}
loadData();