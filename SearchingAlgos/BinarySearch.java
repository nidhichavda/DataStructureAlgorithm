package SearchingAlgos;

public class BinarySearch {
    public void binary(int arr[], int findVal)
    {
        Boolean flag=false;
        int l=0; 
        int r= arr.length-1;
        
        while(l<=r)
        {
            int mid = (l+r)/2;

            if(findVal == arr[mid])
            {
                System.out.println(mid);
                flag=true;
                break;
            }
            else if(findVal>arr[mid])
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        if(flag == false)
        System.out.println("not found");
    }
}


// class Main{
//     public static void main(String[] args)
//     {
//      int arr[]={1,2,3,4,5,6};
//      BinarySearch bs = new BinarySearch();
//         bs.binary(arr,5);
//     }
// }
