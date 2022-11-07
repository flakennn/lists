package ru.mirea.lists;
import java.util.Comparator;
import java.util.Scanner;
public class Node
{
    public int age;
    public String name;
    public Node next;
    @Override
    public String toString() {
        return "Node{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean compareTo(int age,String name) {
        if((this.age == age)&&(this.name == name)) return true;
        else return false;
    }


    public Node(int age, String name, Node next) {
        this.age = age;
        this.name = name;
        this.next = next;
    }
    public Node(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an age");
        this.age = keyboard.nextInt();
        System.out.println("enter an name");
        this.name = keyboard.next();
    }
}
