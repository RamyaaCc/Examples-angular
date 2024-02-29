package oops;
import java.io.*;
import java.util.*;
class Bank {
    private String name;
    private Set<Employee> employees;
    // Constructor of this class
    Bank(String name)
    {
        this.name = name;
    }
    public String getBankName()
    {
        return this.name;
    }
    public void setEmployees(Set<Employee> employees)
    {
        this.employees = employees;
    }
    public Set<Employee>
    getEmployees(Set<Employee> employees)
    {
        return this.employees;
    }
}
class Employee {
    private String name;
    Employee(String name)
    {
        // This keyword refers to current instance itself
        this.name = name;
    }
    public String getEmployeeName()
    {
        return this.name;
    }
}
class assosiation {
    public static void main(String[] args)
    {
        Bank bank = new Bank("ICICI");
        Employee emp = new Employee("Ridhi");
        Set<Employee> employees = new HashSet<>();
        employees.add(emp);
        bank.setEmployees(employees);
        System.out.println(emp.getEmployeeName()
                + " belongs to bank "
                + bank.getBankName());
    }

}