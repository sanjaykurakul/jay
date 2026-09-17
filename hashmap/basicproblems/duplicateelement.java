import java.util.*;
public class duplicateelement{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
        if(map.containsKey(arr[i])){
            map.put(arr[i],map.get(arr[i])+1);
        }
        else{
            map.put(arr[i],1);
        }
        }
         boolean found = false;
        for (int num : map.keySet()) {
            if (map.get(num) > 1) {
                System.out.println(num);
                found=true;
            }
        }
        if (!found) {
            System.out.println("No duplicate element");
        }
    }
}