import java.util.Scanner;
public class ArraysCC{
        public static void main(String[] args){
            int marks[]={98,95,92};
            update(marks);
            for(int i=0;i<marks.length;i++){
                System.out.println(marks[i]);
            }
        }
        public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
}