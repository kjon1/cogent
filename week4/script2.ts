class Employee
{
    firstName:string=" "
    lastName:string=""
    constructor(firstName:string,lastName:string)
    {
        this.firstName=firstName;
        this.lastName=lastName;

    }
    getName( ):string{
        return this.firstName+""+this.lastName
    }
}
let employee = new Employee("Smart", "Man  ");
console.log(employee.getName( ));