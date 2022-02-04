package udemy.hashtable.implementation.linearprobing;

import common.Employee;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jane", "Jones", 121);
        Employee e2 = new Employee("John", "Doe", 122);
        Employee e3 = new Employee("Mary", "Smith", 123);
        Employee e4 = new Employee("Mike", "Wilson", 124);
        Employee e5 = new Employee("Bill", "End", 125);

        SimpleHashTable ht = new SimpleHashTable();

        ht.put("Jones", e1);
        ht.put("Doe", e2);
        ht.put("Smith", e3);
        ht.put("Wilson", e4);

//        ht.put("End", e5);

        ht.printHashTable();

        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
        System.out.println("Retrieve key Smith: " + ht.get("Smith"));

        ht.remove("Wilson");
        ht.remove("Jones");
        ht.printHashTable();

        System.out.println("Retrieve key Smith: " + ht.get("Smith"));
    }
}
