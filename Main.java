import java.util.*;

import CoreDataStructure.*;
import SearchingAlgos.*;
import SortingAlgos.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StackImpl stackImplObj = new StackImpl();
        QueueImpl queueImplObj = new QueueImpl();
        LinkedListImpl linkedListImplObj = new LinkedListImpl();
        DoublyLinkedList doublyLinkedListObj = new DoublyLinkedList();
        CircularLinkedList circularLinkedListObj = new CircularLinkedList();

        BinarySearch binarySearchObj = new BinarySearch();
        LinearSearch linearSearchObj = new LinearSearch();

        BubbleSort bubbleObj = new BubbleSort();
        InsertionSort insertionObj = new InsertionSort();
        SelectionSort selectionObj = new SelectionSort();

        while (true) {
            System.out.println();
            System.out.println("--------------------------------------------------------");
            System.out.println("Select any option from below menu : ");
            System.out.println("1. Stack");
            System.out.println("2. Queue");
            System.out.println("3. LinkedList");
            System.out.println("4. DoublyLinkedList");
            System.out.println("5. CircularLinkedList");
            System.out.println("6. BubbleSort");
            System.out.println("7. InsertionSort ");
            System.out.println("8. SelectionSort");
            System.out.println("9. LinearSearch");
            System.out.println("10. BinarySearch");
            System.out.println("0. Exit");

            int userValue = sc.nextInt();

            boolean exitFlag = false;

            switch (userValue) {

                case 0:
                    System.out.println("Exiting the application...");
                    return;

                case 1:
                    
                    while (exitFlag == false) {
                        System.out.println("Selected Stack (Below are the operations of stack) :");
                        System.out.println("1. push");
                        System.out.println("2. pop");
                        System.out.println("3. print");
                        System.out.println("0. Exit");
                        int stackoption = sc.nextInt();

                        switch (stackoption) {

                            case 0:
                                exitFlag = true;
                                break;

                            case 1:
                                System.out.println("Please enter the value you want to push");
                                int val = sc.nextInt();
                                stackImplObj.push(val);
                                System.out.println("Pushed successfully");
                                break;

                            case 2:
                                stackImplObj.pop();
                                System.out.println("poped Successfully");
                                break;

                            case 3:
                            System.out.println("Stack values are:");
                                stackImplObj.print();
                                break;

                        }
                    }
                    break;

                case 2:
                    exitFlag = false;

                    while(exitFlag == false)
                    {
                        System.out.println("Selected queue (Below are the operations of queue) :");
                        System.out.println("1. offer");
                        System.out.println("2. poll");
                        System.out.println("3. print");
                        System.out.println("0. Exit");
                        int queueOption = sc.nextInt();

                        switch(queueOption)
                        {
                            case 0:
                            exitFlag = true;
                            break;

                            case 1:
                            System.out.println("Please enter the value you want to offer");
                            int val = sc.nextInt();
                            queueImplObj.offer(val);
                            System.out.println("offered successfully");
                            break;

                            case 2:
                            queueImplObj.poll();
                            System.out.println("polled Successfully");
                            break;
                            
                            case 3: 
                            System.out.println("queue values are:");
                            queueImplObj.print();
                            break;
                        }
                    }
                    break;

                case 3:

                exitFlag =false;
                while(exitFlag == false)
                {
                    System.out.println("Selected LinkedList (Below are the operations of LinkedList) :");
                         System.out.println("1. InsertAtEnd");
                        System.out.println("2. InsertAtHead");
                        System.out.println("3. InsertAtKthPosition");
                        System.out.println("4. DeleteValue");
                        System.out.println("5. Print");
                        System.out.println("0. Exit");

                        int LinkedListOption = sc.nextInt();

                        
                        switch(LinkedListOption)
                        {
                            case 0:
                            exitFlag = true;
                            break;

                            case 1:
                            System.out.println("Please enter the value you want to add in LinkedList at End");
                            int valEnd = sc.nextInt();
                            linkedListImplObj.insertAtEnd(valEnd);
                            System.out.println("Inserted successfully");

                            break;

                            

                            case 2:
                            System.out.println("Please enter the value you want to add in LinkedList at Head");
                            int valHead= sc.nextInt();
                            linkedListImplObj.insertAtHead(valHead);
                            System.out.println("Inserted successfully");

                            break;

            
                            case 3:
                           
                            System.out.println("Please enter the value you want to add in LinkedList at kth Position");
                            int valAtK = sc.nextInt();

                            System.out.println("Please enter the position you want to insert at");
                            int valPosition = sc.nextInt();
                            
                            linkedListImplObj.insertAtKthPosition(valAtK, valPosition);
                            System.out.println("Inserted successfully");

                            break;


                            case 4:
                           
                            System.out.println("Please enter the value you want to delete in LinkedList");
                            int DeleteValAtK = sc.nextInt();
                            linkedListImplObj.deleteValue(DeleteValAtK);
                            System.out.println("deleted successfully");

                            
                            break;


                            case 5:
                            System.out.println("LinkedList values are:");
                            linkedListImplObj.printLinkedList();
                            break;
                        }
                       
                }

                    break;

                case 4:

                exitFlag =false;
                while(exitFlag == false)
                {
                    System.out.println("Selected DoublyLinkedList (Below are the operations of DoublyLinkedList) :");
                         System.out.println("1. InsertAtEnd");
                        System.out.println("2. InsertAtHead");
                        System.out.println("3. InsertAtKthPosition");
                        System.out.println("4. DeleteValue");
                        System.out.println("5. Print");
                        System.out.println("0. Exit");

                        int DoublyLinkedListOption = sc.nextInt();

                        
                        switch(DoublyLinkedListOption)
                        {
                            case 0:
                            exitFlag = true;
                            break;

                            case 1:
                            System.out.println("Please enter the value you want to add in DoublyLinkedList at End");
                            int valEnd = sc.nextInt();
                            doublyLinkedListObj.insertAtEnd(valEnd);
                            System.out.println("Inserted successfully");

                            break;

                            

                            case 2:
                            System.out.println("Please enter the value you want to add in DoublyLinkedList at Head");
                            int valHead= sc.nextInt();
                            doublyLinkedListObj.insertAtHead(valHead);
                            System.out.println("Inserted successfully");

                            break;

            
                            case 3:
                           
                            System.out.println("Please enter the value you want to add in DoublyLinkedList at kth Position");
                            int valAtK = sc.nextInt();

                            System.out.println("Please enter the position you want to insert at");
                            int valPosition = sc.nextInt();
                            
                            doublyLinkedListObj.insertAtKthPosition(valAtK, valPosition);
                            System.out.println("Inserted successfully");

                            break;


                            case 4:
                           
                            System.out.println("Please enter the value you want to delete in DoublyLinkedList");
                            int DeleteValAtK = sc.nextInt();
                            doublyLinkedListObj.delete(DeleteValAtK);
                            System.out.println("deleted successfully");

                            
                            break;


                            case 5:
                            System.out.println("DoublyLinkedList values are:");
                            doublyLinkedListObj.printLinkedList();
                            break;
                        }
                       
                }
                    break;

                case 5:

                exitFlag =false;
                while(exitFlag == false)
                {
                    System.out.println("Selected CircularLinkedList (Below are the operations of CircularLinkedList) :");
                         System.out.println("1. Insert");
                        System.out.println("2. Delete");
                        System.out.println("3. Print");
                        System.out.println("0. Exit");

                        int CircularLinkedListOption = sc.nextInt();

                        
                        switch(CircularLinkedListOption)
                        {
                            case 0:
                            exitFlag = true;
                            break;

                            case 1:
                            System.out.println("Please enter the value you want to add in CircularLinkedList at End");
                            int valEnd = sc.nextInt();
                            circularLinkedListObj.insert(valEnd);
                            System.out.println("Inserted successfully");

                            break;

                            case 2:
                           
                            System.out.println("Please enter the value you want to delete in CircularLinkedList");
                            int DeleteValAtK = sc.nextInt();
                            circularLinkedListObj.delete(DeleteValAtK);
                            System.out.println("deleted successfully");

                            break;


                            case 3:
                            System.out.println("CircularLinkedList values are:");
                            circularLinkedListObj.print();
                            break;
                        }
                }
                    break;

                case 6:
                exitFlag=false;
                while(exitFlag == false)
                {
                    System.out.println("Selected BubbleSort (Below are the operations of BubbleSort) :");
                    System.out.println("1. Perform BubbleSort");
                    System.out.println("0. Exit");
                    int bubbleSortOption = sc.nextInt();

                    
                   switch(bubbleSortOption){
                    case 0: 
                    exitFlag =true;
                    break;

                    case 1: 

                    System.out.println("Enter the size of the Array");
                    int size = sc.nextInt();

                    int arr[]=new int[size];
                    System.out.println("Enter the elements of the Array");
                    for(int i=0; i<size; i++)
                    {
                        arr[i]=sc.nextInt();
                    }

                    bubbleObj.bubble(arr);
                    System.out.println("Values after BubbleSort");
                    bubbleObj.print(arr);
                    break;
                }

                }
                    break;

                case 7:
                exitFlag=false;
                while(exitFlag == false)
                {
                    System.out.println("Selected InsertionSort (Below are the operations of InsertionSort) :");
                    System.out.println("1. Perform InsertionSort");
                    System.out.println("0. Exit");
                    int InsertionSortOption = sc.nextInt();

                    
                   switch(InsertionSortOption){

                    case 0: 
                    exitFlag =true;
                    break;

                    case 1: 

                    System.out.println("Enter the size of the Array");
                    int size = sc.nextInt();

                    int arr[]=new int[size];
                    System.out.println("Enter the elements of the Array");
                    for(int i=0; i<size; i++)
                    {
                        arr[i]=sc.nextInt();
                    }

                    insertionObj.insertion(arr);
                    System.out.println("Values after InsertionSort");
                    insertionObj.print(arr);
                    break;
                }

                }
                    break;

                case 8:
                exitFlag=false;
                while(exitFlag == false)
                {
                    System.out.println("Selected SelectionSort (Below are the operations of SelectionSort) :");
                    System.out.println("1. Perform SelectionSort");
                    System.out.println("0. Exit");
                    int SelectionSortOption = sc.nextInt();

                    
                   switch(SelectionSortOption){
                    case 0: 
                    exitFlag =true;
                    break;

                    case 1: 

                    System.out.println("Enter the size of the Array");
                    int size = sc.nextInt();

                    int arr[]=new int[size];
                    System.out.println("Enter the elements of the Array");
                    for(int i=0; i<size; i++)
                    {
                        arr[i]=sc.nextInt();
                    }

                    selectionObj.selection(arr);
                    System.out.println("Values after SelectionSort");
                    selectionObj.print(arr);
                    break;
                }

                }
                    break;

                    case 9:

                    exitFlag=false;
                    while(exitFlag == false)
                    {
                        System.out.println("Selected LinearSearch (Below are the operations of LinearSearch) :");
                        System.out.println("1. Perform LinearSearch");
                        System.out.println("0. Exit");
                        int LinearSearchOption = sc.nextInt();

                        switch(LinearSearchOption){
                            case 0: 
                            exitFlag =true;
                            break;
        
                            case 1: 
        
                            System.out.println("Enter the size of the Array");
                            int size = sc.nextInt();
        
                            int arr[]=new int[size];
                            System.out.println("Enter the elements of the Array");
                            for(int i=0; i<size; i++)
                            {
                                arr[i]=sc.nextInt();
                            }
                            System.out.println("Enter the Search value");
                            int searchVal=sc.nextInt();
                            
                            System.out.println("Value at Index");
                            linearSearchObj.linear(arr, searchVal);
                            
                            break;
                        }
                    }

                    break;
                    case 10:

                    exitFlag=false;
                    while(exitFlag == false)
                    {
                        System.out.println("Selected binarySearch (Below are the operations of binarySearch) :");
                        System.out.println("1. Perform binarySearch");
                        System.out.println("0. Exit");
                        int binarySearchOption = sc.nextInt();

                        switch(binarySearchOption){
                            case 0: 
                            exitFlag =true;
                            break;
        
                            case 1: 
        
                            System.out.println("Enter the size of the Array");
                            int size = sc.nextInt();
        
                            int arr[]=new int[size];
                            System.out.println("Enter the elements of the Array in sorted manner");
                            for(int i=0; i<size; i++)
                            {
                                arr[i]=sc.nextInt();
                            }
                            System.out.println("Enter the Search value");
                            int searchVal=sc.nextInt();
                            
                            System.out.println("Value at Index");
                            binarySearchObj.binary(arr, searchVal);
                            
                            break;
                        }
                    }

                    break;

                default:
                    System.out.println("please enter valid option");
                    break;
            }
        }
    }
}