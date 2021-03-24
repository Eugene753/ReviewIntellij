package reviewclass5;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee evaObj=new Employee();
        evaObj.id="123";
        evaObj.name="Eva";
        evaObj.department="IT";
        evaObj.salary=150000;
        Employee saleemObj=new Employee();
        saleemObj.id="123456";
        saleemObj.name="Saleem";
        saleemObj.department="IT";
        saleemObj.salary=200000;

        Employee[] employees=new Employee[2];
        employees[0]=evaObj;
        employees[1]=saleemObj;
        /*
        write a for loop and print the values of Employees Objects and call the methods

        */
        for(Employee employee:employees){
            System.out.println(employee.id);
            System.out.println(employee.name);
            System.out.println(employee.department);
            System.out.println(employee.salary);
        }

        for(Employee employee:employees){
            employee.work();
            employee.drink();
        }

    }
}
