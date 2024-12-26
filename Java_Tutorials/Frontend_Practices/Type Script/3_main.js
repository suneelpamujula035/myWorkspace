"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var message = "Hello World!";
console.log(message);
var x = 10;
x = 13; // let declarations can be done without initializations
var y = 89; // const declarations are always initialized with value and const declarations once assigned can never be reassigned
var sum;
var title = "CodeEvolution";
var isBeginner = true;
var total = 0;
var name = 'Suneel';
var sentence = "My name is " + name + "  Im a beginner in TypeScript";
console.log(sentence);
var n = null; // we can assign to boolean, number, string type variables
var u = undefined;
var isNew = null;
var myName = null;
var list1 = [1, 2, 3];
var list2 = [1, 2, 3];
var person = ['suneel', 87];
var color;
(function (color) {
    color[color["Red"] = 5] = "Red";
    color[color["Green"] = 6] = "Green";
    color[color["Blue"] = 7] = "Blue";
})(color || (color = {}));
;
var c = color.Green;
console.log(c);
var randomNumber = 10;
randomNumber = 'suneel';
randomNumber = true;
var myVariable = 10;
function hasName(obj) {
    return !!obj &&
        typeof obj === "object" &&
        "name" in obj;
}
if (hasName(myName)) {
    console.log(myVariable.name);
}
myVariable.toUpperCase();
var a;
a = 10;
a = true;
var b = 20;
//b=true;
var multitype;
multitype = 10;
multitype = true;
var description;
description = true;
description = 20;
description = 'suneel'; // Intellisence not working for anytype
function add(num1, num2) {
    if (num2 === void 0) { num2 = 10; }
    if (num2) {
        return num1 + num2;
    }
    else {
        return num1;
    }
}
console.log(add(5, 44));
console.log(add(5));
function fullname(person) {
    console.log(person.firstname + " " + person.lastname);
}
var p = {
    firstname: "suneel",
    lastname: "kumar"
};
fullname(p);
//-----------------------------------------------------------
var Employee = /** @class */ (function () {
    function Employee(name) {
        this.employeename = name;
    }
    Employee.prototype.great = function () {
        console.log("Good Morning " + this.employeename);
    };
    return Employee;
}());
var emp1 = new Employee('Tiru');
console.log(emp1.employeename);
emp1.great();
var Manager = /** @class */ (function (_super) {
    __extends(Manager, _super);
    function Manager(managerName) {
        return _super.call(this, managerName) || this;
    }
    Manager.prototype.delegateWork = function () {
        console.log("Manager delegating tasks");
    };
    return Manager;
}(Employee));
var m1 = new Manager('Bruce');
m1.delegateWork();
m1.great();
console.log(m1.employeename);
