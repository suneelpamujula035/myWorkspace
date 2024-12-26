//function hosting
a=10;//variable hosting can use for var variable
b=20;//variable hosting can not use for let variable
display();//function hosting
function display(){
    document.write("This is normal function");
}

disp1();//function hosting does not applicable for Expression style function
var disp1 = function(){
    document.write("This is Expression style function");
}
var a;
let b;