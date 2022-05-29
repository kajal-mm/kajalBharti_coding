import java.util.*;

public class LeaderNumber {

  public static void main(String[] args) {

    int[] arr = {7, 10, 4, 10, 6, 5, 2}; //given array
    lader_num(arr); //calling a function that print the leader number in an array
  }

  public static void lader_num(int[] array) {
        int max_num = array[array.length - 1];//select one number as max
        System.out.print(max_num+" ");
        for(int i = array.length - 1; i >= 0; i--) {
            if(array[i] > max_num) {
                System.out.print(array[i]+" ");
                max_num = array[i];
            }
        }
    }

}
