package com.brian.JavaDS_Algorithm.hashTable;

import java.util.Scanner;

public class HashTableDemo {
    public static void main(String[] args) {
        //create a HashTable
        HashTable hashTable = new HashTable(7);
        String key = "";
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("add: add an employee");
            System.out.println("list: list the hashtable");
            System.out.println("find: find by id");
            System.out.println("exit the system");

            key = scanner.nextLine();
            if(key.equals("add")){
                System.out.print("please enter the id: ");
                int id = scanner.nextInt();
                System.out.print("please enter the name: ");
                String name = scanner.next();
                Emp emp = new Emp(id,name);
                hashTable.addEmployee(emp);
            } else if (key.equals("list")){
                hashTable.list();
            } else if(key.equals("find")){
                System.out.print("please enter the id: ");
                int id = scanner.nextInt();
                Emp employeeById = hashTable.findEmployeeById(id);
                System.out.println(employeeById);
            }
            else if(key.equals("exit")){
                break;
            }
        }

    }
}

//create a hashtable to manage multiple EmployeeLinkedList
class HashTable{
    private EmployeeLinkedList[] employeeLinkedListArray;
    private int size;
    //initialization of the array
    public HashTable(int n){
        employeeLinkedListArray = new EmployeeLinkedList[n];
        //do not forget to initialize every list
        for(int i=0;i<n;i++){
            employeeLinkedListArray[i] = new EmployeeLinkedList();
        }
        this.size = n;
    }
    //add an employee
    public void addEmployee(Emp emp){
        //based on the emp id, get the pos of employee linked list to be inserted
        int pos = hashFunc(emp.id);

        employeeLinkedListArray[pos].add(emp);
    }

    //loop over all lists
    public void list(){
        for(int i=0;i<size;i++){
            employeeLinkedListArray[i].list();
        }
    }

    //get a sparse function, using mod
    public int hashFunc(int id){
        return id%size;
    }

    //if not found, return null
    public Emp findEmployeeById(int id){
        int pos = hashFunc(id);
        return employeeLinkedListArray[pos].search(id);

    }
}


class Emp{
    public int id;
    public String name;
    public Emp next;

    public Emp(int id, String name){
        super();
        this.id = id;
        this.name =  name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", next=" + next +
                '}';
    }
}

class EmployeeLinkedList{
    //head pointer
    private Emp head;

    //add employee
    //assumption: id is incremental and always add to the end of the linked list
    public void add(Emp emp){
        //if he is the first emp
        if(head==null){
            head = emp;
        } else {
            Emp temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = emp;
        }
    }

    //loop over the the list
    public void list(){
        if(head==null) {
//            System.out.println("the current list is empty");
            return;
        }
//        System.out.println("the current list information is: ");
        Emp cur = head;
        while(cur!=null){
            System.out.printf("id=%d,name=%s =>",cur.id,cur.name);
            cur = cur.next;
        }
        System.out.println();
    }

    //search
    public Emp search(int id){
        if(head==null){
            System.out.println("the current list is null");
            return null;
        }
        Emp cur = head;
        while(cur!=null){
            if(cur.id == id){
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
}
