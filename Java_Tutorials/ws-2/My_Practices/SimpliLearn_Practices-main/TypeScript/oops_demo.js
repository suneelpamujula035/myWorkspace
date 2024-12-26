var Employee = /** @class */ (function () {
    function Employee() {
        this.id = 10;
        this.name = "naveen";
    }
    Employee.prototype.dis = function () {
        console.log("Employee class function");
        console.log("id is : " + this.id);
        console.log("name is : " + this.name);
    };
    return Employee;
}());
var emp1 = new Employee();
emp1.dis();
