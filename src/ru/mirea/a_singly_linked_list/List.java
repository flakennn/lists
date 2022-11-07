package ru.mirea.lists;

public class List
{
    private Node head;
    public List()
    {
        head = null;
    }
    public void ClearList()
    {
        this.head = null;
    }
    public boolean IsEmpty()
    {
        return head == null;
    }
    public void add(int age,String name)
    {
        Node temp = new Node(age,name,head);
        head = temp;
    }
    public void deleteNode()
    {
        head = head.next;
    }
    public void deleteNodeAt(int age,String name)
    {
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
