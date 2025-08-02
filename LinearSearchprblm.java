import java.util.*;
public class LinearSearchprblm{
    public static int Search(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            } 
        }
        return -1;
    }
    public static void main(String[] args){
        int numbers[]={2,4,6,8,10,12,14,16};
        int key=10;
        int position=Search(numbers,key);
        if(position == -1){
            System.out.println("not found");
        } else {
            System.out.println("the key value is at "+position);
        }
    }
}