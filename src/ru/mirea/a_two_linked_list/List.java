package ru.mirea.a_two_linked_list;

public class List
{
    private Node head;
    private Node tail;

    public List()
    {
        head = null;
        tail = null;
    }

    public boolean IsEmpty()
    {
        return head == null;
    }

    public void addInHead(int age,String name)
    {
        Node temp = new Node(age,name);
        if(IsEmpty()){
            head = temp;
            tail = temp;
        }
        else {
            head.prev = temp;
            temp.next = head;
            head = temp;
        }
    }
    public void deleteNodeHead()
    {
        head = head.next;
    }

    public void deleteNodeTail() {
        tail.prev.next = null;
        tail.prev = null;
        //tail = tail.prev;
    }

    public void deleteNodeAt(int age,String name) {
        if(head.compareTo(age,name)) head = head.next;
        else {
            Node prev = head;
            Node cur = prev.next;
            while (cur != null) {
                if (cur.compareTo(age, name)) {
                    prev.next = cur.next;
                }
                if(cur.next == null) return;
                prev = prev.next;
                cur = prev.next;

            }
        }
    }
    public void addInTail(int age,String name)
    {
        Node temp = new Node(age,name);
        if(IsEmpty()){
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }

    }
    public void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.toString());
            temp = temp.next;
        }
    }
}
