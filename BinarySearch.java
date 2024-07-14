public class BinarySearch{

    public static int search(int[] arr,int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
         }
         return -1;
    }
    
    public static void main(String[] args) {
        int arr[]={12,23,34,45,56,67,78,89,90};
        int val=12;
        int result=search(arr,val);
        if(result==-1){
            System.out.println("no. not found");
        }
        else{
            System.out.println("no found at index no." +result);
        }
    }

}

 
