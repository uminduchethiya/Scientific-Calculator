/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author uminduchethiya
 */
public class Stack {

    private String arr[];
    private int top;
    private int capacity;

    Stack(int size) {
        arr = new String[size];
        capacity = size;
        top = -1;
    }

    public void push(String x) {
        arr[++top] = x;
    }

    public void pop() {
        top = top - 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public String printStack() {

        return arr[top];

    }

    public String[] getData() {

        return arr;

    }

}
