let arr1=[10,20,30,40,50,60];
document.write("<br>display using call back");
arr1.forEach(display);

function display(n){
    document.write("<br>value is "+n);
}
arr1.forEach(function(n){
    document.write("<br>value is "+n); 
})

arr1.forEach(n=>document.write("<br>value is "+n));