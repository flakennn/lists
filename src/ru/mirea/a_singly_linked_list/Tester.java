package ru.mirea.lists;

public class Tester {
    public static void main(String[] args)
    {
        List a = new List();
        a.add(18,"otbitiy");
        a.add(20,"golberg");
        a.add(90,"alialiev");
        a.add(30,"kesha");
        a.add(31,"cherkes");
        a.add(17,"rantick");
        a.print();
        System.out.println();
        a.deleteNodeAt(18,"otbitiy");
        a.deleteNode();
        a.print();
        System.out.println();
        a.ClearList();
        a.print();
        System.out.println("Is list empty? " + a.IsEmpty());
    }
}