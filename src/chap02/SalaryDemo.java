package chap02;

public class SalaryDemo {
    static void main(String[] args) {
        Employee employee = new Employee(5000, 10000);
        int salary = employee.calculateSalary('C');
        System.out.println(salary);

    }

}
