package CoreDataStructure;

import java.util.*;

public class StackImpl {

    int arr[] = new int[100];
    int top = -1;

    public boolean isEmpty() {
        if(top == -1)
        {
            return true;
        }
        else{
            return false;
        }
        
    }
   public  boolean isFull() {
        if(top == arr.length)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public void push(int value) {
        if(top != arr.length)
        {
            top++;
            arr[top]=value;
        }

    }

     public int pop() {

        int  removeVal = -1;
        if(top != -1)
        {
            removeVal = arr[top];
            top--;
        }
        return removeVal;
    }

   public void print(){

        for(int i=0; i<=top; i++)
        System.out.println(arr[i]);

    }
}
// class Main{
//     public static void main(String[] args)
//     {
//         StackImpl ss = new StackImpl();
//        ss.push(3);
//        ss.print();
//        ss.push(6);
//        ss.print();
//          ss.pop();
//         ss.print();
//        System.out.print(ss.isEmpty());
//        System.out.print(ss.isFull());
//        ss.pop();
//        System.out.print(ss.isEmpty());
//     }
// }