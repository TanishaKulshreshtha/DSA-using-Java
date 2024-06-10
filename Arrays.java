import java.util.Scanner;

public class Arrays{
    public static void main(String[] args){
        
        //1st method
        int arr[]=new int[3];
        arr[0]=34;
        arr[1]=55;
        arr[2]=78;

        //2nd method
        int arr1[]={34,55,78};

        //user-input array
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt(); 
        int arr2[]=new int[size];
        for (int i=0;i<size;i++){
            System.out.println("enter"+i+"element");
            arr2[i]=sc.nextInt();
        }

        //to print the array
        for (int i=0;i<size;i++){
            System.out.println(arr2[i]);
        }
    }
}
