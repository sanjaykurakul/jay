public class MinValue{
    public static void main(String[]args){
        int arr[]={3,4,44,1,-1};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);

        
    }
}