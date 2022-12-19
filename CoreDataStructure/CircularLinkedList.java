package CoreDataStructure;

class Node {
    int data;
    Node next;
    Node prev;
    Node(){}
    Node(int data) {
        this.data = data;
    }
}

public class CircularLinkedList {
    Node head;
    Node tail;
    

    public void insert(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            tail = n;
            n.next = head;
            return;
        }
        // n.next=tail.next;
        tail.next = n;
        tail = n;
        tail.next = head;

    }
    public void delete(int data){

        if(head == null)
        return;

        Node temp=head;
        Node prev=head;
        while(temp.data != data)
        {
            prev = temp;
            temp=temp.next;
        }
        if(temp.next == head)
        {
            prev.next=head;
        }
        else
        prev.next = temp.next;

    }

    public void print() {
        Node temp = head;

        do {
            System.out.print(temp.data);
            temp = temp.next;

        } while (temp.next != head);

        System.out.println(temp.data);
    }
}

// class Main {
//     public static void main(String[] args) {
//         CircularLinkedList cl = new CircularLinkedList();
//         cl.insert(6);
//         cl.insert(7);
//         cl.insert(8);
//         cl.insert(9);
//         cl.print();
//         cl.delete(8);
//         cl.print();
//     }
// }
