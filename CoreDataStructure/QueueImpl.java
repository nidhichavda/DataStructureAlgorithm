package CoreDataStructure;
import java.util.*;

public class QueueImpl {

    int size = 100;
    int arr[] = new int[size];
    int front , rear ;

    public QueueImpl() {
         front = -1;
         rear = -1;
    }

    boolean isFull(){
        if(front == 0 && rear == size-1)
        {
            return true;
        }
        return false;

    }
    boolean isEmpty(){
        if(front == -1)
        {
            return true;
        }
        return false; 
    }

    public void offer(int data) {
        if(isFull())
        {
            System.out.print("queue is full");
        }
        else
        {
            if(front== -1)
            {
                front = 0;
            }
            rear++;
            arr[rear]=data;
        }
    }

    public int poll() {
        int removeVal;
       if(isEmpty())
       {
        return -1;
       }
       else{
         removeVal = arr[front];
        //only one element
        if(front >= rear)
        {
            front=-1;
            rear=-1;
        }
        else{
            front++;
        }
        return removeVal;
       }
    }   

    public void print(){
        for(int i=front; i<=rear; i++)
        System.out.println(arr[i]);
    }
}
// class Main{
//     public static void main(String[] args)
//     {
//         QueueImpl qq =new QueueImpl();
//         qq.offer(2);
//         qq.print();
//         qq.offer(9);
//         System.out.print("after add 9");
//         qq.print();
//         qq.poll();
//         System.out.print("after poll");
//         qq.print();
//         System.out.print(qq.isEmpty());
//         qq.offer(5);
//         qq.print();

        
//     }
// }
