package SortingAlgos;

public class BubbleSort {
   
    public void bubble(int arr[]){
    for( int i = 0; i<arr.length-1; i++)
    {
        for (int j = 0; j < arr.length - i - 1; j++) {

            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
public void print(int arr[]){

    for(int i=0; i<arr.length; i++)
    {
        System.out.println(arr[i]);
    }
}
}

// class Main{
//     public static void main(String[] args)
//     {
//         int arr[]={6 , 5 , 8 , 8 ,2, 1};
//     BubbleSort bb = new BubbleSort();
//     bb.bubble(arr);
//     bb.print(arr);
//     }
// }