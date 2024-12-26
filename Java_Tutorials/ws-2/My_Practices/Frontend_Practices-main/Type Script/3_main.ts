// export{}
// let message = "Hello World!";
// console.log(message);

// let x =10;
// x = 13;// let declarations can be done without initializations

// const y = 89;// const declarations are always initialized with value and const declarations once assigned can never be reassigned
// //const sum = "su";

// let sum;
// const title="CodeEvolution";

// let isBeginner : boolean = true;
// let total : number = 0;
// let name : string = 'Suneel';
// let sentence : string =`My name is ${name}  Im a beginner in TypeScript`;
// console.log(sentence);

// let n:null = null;// we can assign to boolean, number, string type variables
// let u:undefined = undefined;

// let isNew:boolean = null;
// let myName:string = null;

// let list1:number[] = [1,2,3];
// let list2:Array<number>=[1,2,3];

// let person:[string, number] = ['suneel',87];

// enum color {Red=5, Green, Blue};
// let c: color = color.Green;
// console.log(c);

// let randomNumber : any = 10;
// randomNumber = 'suneel';
// randomNumber = true;

// let myVariable : unknown = 10;

// function hasName(obj:any):obj is {name : string}
// {
//     return !!obj &&
//     typeof obj === "object" &&
//     "name" in obj;
// }
// if(hasName(myName))
// {
//     console.log(myVariable.name);
// }
// (myVariable as string).toUpperCase();

// let a;
// a=10;
// a=true;

// let b=20;
// //b=true;

// let multitype : number | boolean;
// multitype = 10;
// multitype = true;

// let description : any;
// description = true;
// description = 20;
// description = 'suneel';// Intellisence not working for anytype

// function add(num1:number, num2:number=10):number
// {
//     if(num2)
//     {
//         return num1 + num2;
//     }
//     else
//     {
//         return num1;
//     }
// }
// console.log(add(5,44));
// console.log(add(5));
// //-----------------------------------------------

// interface Person
// {
//     firstname : string;
//     lastname : string
// }
// function fullname(person : Person)
// {
//     console.log(`${person.firstname} ${person.lastname}`);
// }
// let p={
//     firstname : "suneel",
//     lastname : "kumar"
// }
// fullname(p);
// //-----------------------------------------------------------
// class Employee{
//     employeename : string;

//     constructor(name:string)
//     {
//         this.employeename=name;
//     }

//     great(){
//         console.log(`Good Morning ${this.employeename}`);
//     }
// }
// let emp1 = new Employee('Tiru');
// console.log(emp1.employeename);
// emp1.great();

// class Manager extends Employee{
//      constructor(managerName:string)
//      {
//          super(managerName);
//      }
//      delegateWork()
//      {
//          console.log(`Manager delegating tasks`)
//      }
// }
// let m1 = new Manager('Bruce');
// m1.delegateWork();
// m1.great();
// console.log(m1.employeename);

const i = 15;

var index = 2;

