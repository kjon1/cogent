var Employee = /** @class */ (function () {
    function Employee(firstName, lastName) {
        this.firstName = " ";
        this.lastName = "";
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Employee.prototype.getName = function () {
        return this.firstName + "" + this.lastName;
    };
    return Employee;
}());
var employee = new Employee("Smart", "Man  ");
console.log(employee.getName());
