//ES5 style object creation using function style
// function Employee{
//     this.id=100;
//     this.name="Suneel";//instance property
//     this.display=function(){//behaviour
//         document.write("This is my id "+this.id);
//         document.write("This is my name "+this.name);
//     }
// }
// //Employee()//normal function
// var emp1 = new Employee();
// emp1.display();//memory creation
// alert(emp1.id+" "+emp1.name);
// var emp2 = new Employee();
// emp2.display();

//parameterized object creation
// function Employee(id,name){
//     this.id=id;
//     this.name=name;//instance property
//     this.display=function(){//behaviour
//         document.write("This is my id "+this.id);
//         document.write("This is my name "+this.name);
//     }
// }
//Employee()//normal function
// var emp1 = new Employee(101,"Suneel");
// emp1.display();//memory creation
//alert(emp1.id+" "+emp1.name);
// var emp2 = new Employee(102,"Santhosh");
// emp2.display();


//ES5 style object creation using literal style
// var emp1={id:101,name:"Suneel",age:24};
// var emp1={id:102,name:"Gopi",age:35};
// document.write("<br"+emp1.id+" - "+emp1.name+" - "+emp1.age);

//ES6 class style
// class Employee{
//     id=100;
//     name="Ravi";
//     age=21;
//     dis(){
//         document.write("Employee details are <br>");
//         document.write("id is "+this.id);
//         document.write("name is "+this.name);
//         document.write("age is "+this.age);
//     }
// }
// let emp1 = new Employee();
// emp1.dis();

//parameterize constructor
//ES6 class style
class Employee{
    // id=100;
    // name="Ravi";
    // age=21;
    constructor(id,name,age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    dis(){
        document.write("Employee details are <br>");
        document.write("id is "+this.id);
        document.write(" name is "+this.name);
        document.write(" age is "+this.age);
    }
}
let emp1 = new Employee(101,"Harsha",23);
emp1.dis();
let emp2 = new Employee(102,"Giri",34);
emp2.dis();