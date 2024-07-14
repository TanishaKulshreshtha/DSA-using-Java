// linear search 
public class LinearSearch{

    public static int search(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int val=90;
        int result=search(arr,val);
        if (result!=-1){
            System.out.println("number found at index no. "+ result);
        }
        else{
            System.out.println("number not found");
        }
        
    }
}