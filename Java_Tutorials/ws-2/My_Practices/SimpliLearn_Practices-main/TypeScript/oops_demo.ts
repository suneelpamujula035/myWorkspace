class Employee{
   private id:number=10;
    private name:string="naveen";
    dis():void{
        console.log("Employee class function");
        console.log("id is : "+this.id);
        console.log("name is : "+this.name);
    }
}
let emp1 = new Employee();
emp1.dis();
//console.log(emp1.id);//wecan't access because its private variable
//console.log(emp1.name);

//parameterized constructor
// class Student{
//     id;
//     name;
//     constructor(id:number,name:string){
//         this.id=id;
//         this.name=name;
//     }
//     display():void{
//         console.log("id is : "+this.id);
//         console.log("name is : "+this.name);
//     }
// }
// let student1 = new Student(201,"gaurav");
// student1.display();
// let student2 = new Student(202,"vaibhav");
// student2.display();

//short cut constructor initialization
class Student{
    // id;
    // name;
    constructor(public id?:number,public name:string="unknown"){
        // this.id=id;
        // this.name=name;
    }
    display():void{
        console.log("id is : "+this.id);
        console.log("name is : "+this.name);
    }
}
let student1 = new Student(201,"gaurav");
student1.display();
let student2 = new Student(202,"vaibhav");
student2.display();
let student3 = new Student(203);
student3.display();
let student4 = new Student();
student4.display();
