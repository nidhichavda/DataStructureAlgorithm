package CoreDataStructure;

import java.util.*;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data)
    {
        this.data=data;
      //  this.next=null;
        //this.prev=null;
    }
}

public class DoublyLinkedList {

    Node head;
    Node tail;

    public void insertAtEnd(int data)
    {
        Node n=new Node(data);
        if(head == null)
        {
            head =n;
            head.prev = null;
            tail=n;
            tail.next=null;
            return;
        }
        
        tail.next = n;
        n.prev = tail;
        tail=n;
    }
    public void insertAtHead( int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            return;
        }
        head.prev=n;
        n.next=head;
        head=n;

    }
    public void insertAtKthPosition( int data,  int pos){
        Node n=new Node(data);
        if(head == null)
        {
            head=n;
            return;
        }
        Node temp=head;
        for(int i=0; i<pos-1; i++)
        {
            temp=temp.next;
        }
        n.next=temp.next;
        temp.next=n;
        n.prev=temp;
        
    }

    public void delete(int data)
    {
        if(head==null)
        return;

        Node temp=head;
        while(temp.data !=data)
        {
            temp=temp.next;
        }
        if(temp.prev !=null)
         temp.prev.next=temp.next;
         if(temp.next!=null)
       temp.next.prev=temp.prev;


    }
    public void printLinkedList(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
   



    
}
// class Main{
//     public static void main(String[] args)
//     {
//         DoublyLinkedList dll = new DoublyLinkedList();
//         dll.insertAtEnd(20);
//         dll.insertAtEnd(30);
//         dll.insertAtEnd(40);
//         dll.insertAtHead(1);
//         dll.insertAtHead(2);
//         dll.delete(40);
//         dll.insertAtKthPosition(50, 2);
//         dll.print();
//     }
// }
