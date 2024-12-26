//function with number of parameters must be match
function abc(a,b){
    console.log(a+" "+b);
}
abc("suneel","pawan");
abc(10,33);
abc(25,"nithish");
abc('A','B');

//number of parameters with data type must be match
function addNumber(a:number,b:number){
    console.log("Result is : "+a+b);
}
addNumber(15,67);
addNumber(7.5,14.64);
//addNumber("suneel",10);//we should only pass parameters of declared data types

//function with no return type
function info():void{
    console.log("Inside function with no return type");
    //return "Welcome";//Here we can't return anything because this method return type is void
}

//function with return type
function sayhello():string{
    return "Hello friends";
}

function addNumbers(a:number,b:number):number{
    return a+b;
}

function anyType():any{
    // return "Hiiii";//Here we can return any data type
    // return 16;
    // return true;
}

//function with optional parameter ? optional
//right to left
function empInfo(id?:number, name?:string, age?:number){

}
empInfo(101,"vaasu",23);
empInfo(102,"sathish");
empInfo(103);
empInfo();

//function with default initialization
function stuInfo(id:number=0,name:string="unknown",age:number=6){

}
stuInfo(1,"vikram",43);
stuInfo(2,"srinu");
stuInfo(3);
stuInfo();