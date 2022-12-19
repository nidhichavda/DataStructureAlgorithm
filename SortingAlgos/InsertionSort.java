package SortingAlgos;

public class InsertionSort {

    public void insertion(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            int key =arr[i];
            int j = i-1;

            while(j>=0 && arr[j] >key)
            {
                arr[j+1] = arr[j];
                j = j -1;
            }
            arr[j+1] = key;
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
//     int arr[]={16 , 15 , 98 , 58 ,52, 41};
//     InsertionSort is = new InsertionSort();
//     is.insertion(arr);
//     is.print(arr);
   
//     }
  
    
// }
