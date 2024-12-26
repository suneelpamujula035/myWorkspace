//Normal function syntax
function display()
{
    document.write("This is normal function<br>");
}
display();

//expression style with function name
//variable name is a function name
var dis2 = function display2()
{
    document.write("This is expression style function<br>")
}
//display2();
dis2();//we should call with variable name for expression style function

//expression style function with anonymous function
var dis3 = function(){
    document.write("This is expression style function without name<br>")
}
dis3();

//arrow function
var dis4 = ()=>document.write("This is arrow function<br>");
dis4();

//passing parameters with expression style
var addNumber1= function(a,b){
    var sum=a+b;
    return sum;
}
document.write("sum of two numbers using expression style is "+addNumber1(100,200));

//passing parameters with arrow style
//arrow function by default return without return keyword
var addNumber2 = (a,b)=>a+b;
document.write("<br>sum of two numbers using arrow style is "+addNumber2(500,700));

var findLargest = (a,b)=>{
    if(a>b)
    {
        return "a is largest";
    }
    else
    {
        return "b is largest";
    }
}
document.write("<br>Find largest number is "+findLargest(8,9));

//callback function
function greeting(fname,callback){//we can use any instead of callback
    return "Welcome "+callback(fname);
}
function maleInfo(fname){
    return "Mr "+fname;
}
function femaleInfo(fname){
    return "Miss "+fname
}
document.write("<br>"+greeting("Ramu",maleInfo));
document.write("<br>"+greeting("Sita",femaleInfo));

document.write("<br>"+greeting("Vaasu",function(fname){
    return "Mr "+fname;
}));
document.write(greeting("Rita",(fname)=>"Miss "+fname));