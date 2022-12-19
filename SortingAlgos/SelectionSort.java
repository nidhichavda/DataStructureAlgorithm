package SortingAlgos;

public class SelectionSort {
    public void selection(int arr[])
    {
        int n= arr.length;
        for(int i=0; i<n-1; i++)
        {
            int min_idx =i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[j]<arr[min_idx])
                min_idx = j;
            }
                int temp = arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;

            
        }
    }
    public void print(int arr[]){
    
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}

class Main{
    public static void main(String[] args)
    {
    int arr[]={16 , 95 , 58 , 88 ,32, 81};
    // int arr[]={64,25,12,22,11};
        SelectionSort is = new SelectionSort();
    is.selection(arr);
    is.print(arr);
   
    }
  
    
}

