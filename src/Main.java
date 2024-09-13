import java.util.Arrays;
public class Main {
    public static void display(int[] arr) {
        for(int i = 0; i< arr.length;i++){
            System.out.print(" | " + arr[i] + " | ");
        }
    }

    public static int[] sort(int[] arr){

        int[] temp = arr;
        int size = arr.length-1;

        for (int j = 0; j < size; j++){
            boolean sorted = false;
            for(int i = 0; i< temp.length-1-j; i++){

                if(temp[i] > temp[i+1]){
                    sorted = true;
                    int x = temp[i];
                    int y = temp[i+1];

                    temp[i] = y;
                    temp[i+1] = x;
                }
            }

            if(sorted == false){
                break;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr[] = {10,8,15,20,40};

        display(sort(arr));
    }
}