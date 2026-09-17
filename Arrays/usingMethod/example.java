import java.util.*;
public class example{
    static int[] doublearray(int arr[]){
        int result[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=arr[i]*2;
        }
        return result;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] result = doublearray(arr);
        //System.out.println(result);
        System.out.println(Arrays.toString(result));
    }
}