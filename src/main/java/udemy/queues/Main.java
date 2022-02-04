package udemy.queues;

import common.Employee;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Bill", "Gates", 121);
        Employee e2 = new Employee("Bill2", "Gates2", 122);
        Employee e3 = new Employee("Bill3", "Gates3", 123);
        Employee e4 = new Employee("Bill4", "Gates4", 124);
        Employee e5 = new Employee("Bill5", "Gates5", 125);


//        ArrayQueue arrayQ = new ArrayQueue(10);
//        arrayQ.add(e1);
//        arrayQ.add(e2);
//        arrayQ.add(e3);
//        arrayQ.add(e4);
//
//        arrayQ.printQueue();
//        System.out.println("Peek: " + arrayQ.peek());
//        arrayQ.add(e5);
//        System.out.println("Added: ");
//        arrayQ.printQueue();
//        System.out.println("Removed: " + arrayQ.remove());
        CircularQueue circularQueue = new CircularQueue(4);
        circularQueue.add(e1);
        circularQueue.add(e2);
        circularQueue.add(e3);
        circularQueue.remove();
        circularQueue.add(e4);
        circularQueue.add(e1);

        circularQueue.printQueue();
        System.out.println("Peek: " + circularQueue.peek());
        circularQueue.add(e5);
        System.out.println("Added: ");
        circularQueue.printQueue();
        System.out.println("Removed: " + circularQueue.remove());
    }
}
