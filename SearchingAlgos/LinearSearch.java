package SearchingAlgos;

public class LinearSearch {
    public void linear(int arr[], int findVal){
        Boolean flag =false;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==findVal)
            {
                System.out.println(i); 
                flag=true;
                break;
            }
           
        }

        if(flag == false)
           System.out.println("not found");

    }
    
}

// class Main{
//         public static void main(String[] args)
//         {
//          int arr[]={6 , 5 , 8 , 8 ,2, 1};
//          LinearSearch ls = new LinearSearch();
//             ls.linear(arr,15);
//         }
//     }