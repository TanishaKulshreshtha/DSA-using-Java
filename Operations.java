import java.util.Arrays;
class Methods{

    public int[] insertAtEnd(int[] arr, int element){
        int n=arr.length;
        int arr1[]=new int[n+1];
        for(int i=0;i<n;i++){
            arr1[i]=arr[i];
        }
        arr1[n]=element;
        return arr1;
    }

    public int[] insertRandom(int[] arr, int element,int position){
        int n=arr.length;
        int arr1[]=new int[n+1];
        for(int i=0;i<position;i++){
            arr1[i]=arr[i];
        }
        arr1[position]=element;
        for(int i=position+1;i<n+1;i++){
            arr1[i]=arr[i-1];
        }
        return arr1;
    }

    public int[] deleteRandom(int[] arr,int element){
        int position=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                position=i;
            }
        }
        if (position==-1){
            return arr;
        }
        int n=arr.length;
        int arr1[]=new int[n-1];
        for(int i=0;i<n;i++){
            arr1[i]=arr[i];
            if(i==position){
                break;
            }
        }
        for(int i=position;i<n-1;i++){
            arr1[i]=arr[i+1];
        }
        return arr1;

    }
}
public class Operations {
    public static void main(String[] args) {
        int arr[]={12,23,34,25,62,75,90};
        System.out.println(Arrays.toString(arr));
        Methods m=new Methods();
        int[] result=m.deleteRandom(arr,25);
        System.out.println(Arrays.toString(result));
    }
    
}
