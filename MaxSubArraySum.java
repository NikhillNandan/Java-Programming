import java.util.*;
public class MaxSubArraySum{
    public static void ArraySum(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    currsum+=arr[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("Max Sum is "+maxsum);
    }
    


    public static void main(String[] args){
        int arr[]={2,4,6,8,10};
        ArraySum(arr);
    }
}