package CoreDataStructure;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListImpl {

    Node head;
    
    public void insertAtEnd( int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next = n;
        temp=n;
     
    }

    public void insertAtHead(int data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
            return;
        }
        n.next = head;
        head = n;
    }

    public void insertAtKthPosition( int data, int k) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
        }
        Node temp = head;

        for (int i = 0; i < k - 1; i++) {
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;

    }

    public void deleteValue(int data) {

        Node temp = head;
        Node curr=head;
        if(head.data == data)
        {
            head = head.next;
        }
        else{

        
        while(temp.data!= data)
        {
            curr =temp;
            temp = temp.next;
        }
        curr.next=temp.next;
    }
        // temp.next = temp.next.next;
        

    }

    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}

// class Main {
//     public static void main(String[] args) {
//         LinkedListImpl ll = new LinkedListImpl();
//         ll.insertAtHead( 1);
        
//         ll.insertAtHead( 2);
       
//         ll.insertAtHead( 3);
      
//         ll.insertAtHead( 4);

//         ll.printLinkedList();

//         ll.insertAtEnd( 40);
       
//         ll.insertAtEnd( 50);
       
//         ll.insertAtEnd( 60);

//         ll.printLinkedList();

//         ll.deleteValue( 60);
//         System.out.println("delete");
//         ll.printLinkedList();

//         ll.insertAtKthPosition( 80, 2);
//         ll.printLinkedList();

//     }
// }
