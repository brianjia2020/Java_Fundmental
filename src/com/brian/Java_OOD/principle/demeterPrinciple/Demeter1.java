package com.brian.Java_OOD.principle.demeterPrinciple;

import java.util.ArrayList;
import java.util.List;

public class Demeter1 {
    public static void main(String[] args) {
        SchoolManager1 schoolManager = new SchoolManager1();

        //here it prints all the employee's info, both employee and collegeEmployee
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeEmployee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//a manager class
class CollegeManager{
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("college employee's id="+i);
            list.add(collegeEmployee);
        }
        return list;
    }

    /**
     * move the code to inside collegeManager class
     * Demeter: always do the things inside yourself then open it to others
     */
    void printAllEmployees(){
        List<CollegeEmployee> list1 = this.getAllEmployee();
        System.out.println("---------List of College Employees--------");
        for(CollegeEmployee collegeManager1: list1){
            System.out.println(collegeManager1.getId());
        }
    }
}

class SchoolManager{
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            Employee collegeEmployee = new Employee();
            collegeEmployee.setId("employee's id="+i);
            list.add(collegeEmployee);
        }
        return list;
    }

    /**
     * Here it is against the demeter principle,
     *      the CollegeEmployee is not a direct friend of the SchoolManager
     *      the CollegeEmployee has appeared inside the method as an indirect friend
     *      As the principle says, we should avoid this kind of coupling
     * Improvement: SchoolManager1 class
     * @param collegeManager input
     */
    void printAllEmployee(CollegeManager collegeManager){
        List<CollegeEmployee> list1 = collegeManager.getAllEmployee();
        System.out.println("---------List of College Employees--------");
        for(CollegeEmployee collegeManager1: list1){
            System.out.println(collegeManager1.getId());
        }

        List<Employee> list2 = this.getAllEmployee();
        System.out.println("---------List of Employees--------");
        for(Employee collegeManager1: list2){
            System.out.println(collegeManager1.getId());
        }

    }
}

/**
 * Improvement class
 */
class SchoolManager1{
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            Employee collegeEmployee = new Employee();
            collegeEmployee.setId("employee's id="+i);
            list.add(collegeEmployee);
        }
        return list;
    }

    /**
     * Here it is against the demeter principle,
     *      the CollegeEmployee is not a direct friend of the SchoolManager
     *      the CollegeEmployee has appeared inside the method as an indirect friend
     *      As the principle says, we should avoid this kind of coupling
     * Improvement: SchoolManager1 class
     * @param collegeManager input
     */
    void printAllEmployee(CollegeManager collegeManager){
        //change it to a method inside collegeManager
        collegeManager.printAllEmployees();
//        List<CollegeEmployee> list1 = collegeManager.getAllEmployee();
//        System.out.println("---------List of College Employees--------");
//        for(CollegeEmployee collegeManager1: list1){
//            System.out.println(collegeManager1.getId());
//        }

        List<Employee> list2 = this.getAllEmployee();
        System.out.println("---------List of Employees--------");
        for(Employee collegeManager1: list2){
            System.out.println(collegeManager1.getId());
        }

    }
}