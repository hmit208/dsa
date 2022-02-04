package udemy.stacks.implementation;

import common.Employee;

public class Main {
    public static void main(String[] args) {
//        ArrayStack stack = new ArrayStack(10);
//
//        stack.push(new Employee("Jane", "John", 213));
//        stack.push(new Employee("Tom", "Hanks", 214));
//        stack.push(new Employee("Bill", "Gates", 215));
//        stack.push(new Employee("Elon", "Musk", 216));
//        stack.printStack();
//
//
//        System.out.println("Popped: " + stack.pop());
//        System.out.println("Peek: " + stack.peek());

        LinkedStack linkedStack = new LinkedStack();
        linkedStack.push(new Employee("Jane", "John", 213));
        linkedStack.push(new Employee("Tom", "Hanks", 214));
        linkedStack.push(new Employee("Bill", "Gates", 215));
        linkedStack.push(new Employee("Elon", "Musk", 216));
        linkedStack.printStack();

        System.out.println("Popped: " + linkedStack.pop());
        System.out.println("Peek: " + linkedStack.peek());
    }
}
