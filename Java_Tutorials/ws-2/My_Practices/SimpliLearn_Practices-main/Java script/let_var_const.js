var a = 10;
a = 20;//re-initialization
var a = 40;//re-declaration

let b = 10;
b = 20;//re-initialization
let b = 40;//re-declaration not possible

for(var i=1; i<1000;i++){

}
document.write("<br> value of i is "+i);//local scope - we can also use var variable out side of the scope

for(let j=1; j<1000;j++){

}
document.write("<br> value of i is "+j);//local scope - we can not access let variable out side of the scope

const k = 2000;//We can't change const variable value
//k = 5000;
