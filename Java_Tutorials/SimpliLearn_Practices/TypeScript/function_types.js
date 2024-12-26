//function with number of parameters must be match
function abc(a, b) {
    console.log(a + " " + b);
}
abc("suneel", "pawan");
abc(10, 33);
abc(25, "nithish");
abc('A', 'B');
//number of parameters with data type must be match
function addNumber(a, b) {
    console.log("Result is : " + a + b);
}
addNumber(15, 67);
addNumber(7.5, 14.64);
//addNumber("suneel",10);//we should only pass parameters of declared data types
//function with no return type
function info() {
    console.log("Inside function with no return type");
    //return "Welcome";//Here we can't return anything because this method return type is void
}
//function with return type
function sayhello() {
    return "Hello friends";
}
function addNumbers(a, b) {
    return a + b;
}
function anyType() {
    // return "Hiiii";//Here we can return any data type
    // return 16;
    // return true;
}
//function with optional parameter ? optional
//right to left
function empInfo(id, name, age) {
}
empInfo(101, "vaasu", 23);
empInfo(102, "sathish");
empInfo(103);
empInfo();
//function with default initialization
function stuInfo(id, name, age) {
    if (id === void 0) { id = 0; }
    if (name === void 0) { name = "unknown"; }
    if (age === void 0) { age = 6; }
}
stuInfo(1, "vikram", 43);
stuInfo(2, "srinu");
stuInfo(3);
stuInfo();
