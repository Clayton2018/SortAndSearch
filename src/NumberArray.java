import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberArray {

       private static int[] numbers = new int[50];

       public static Random random = new Random();

       static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {


        fillArray();
        System.out.println("Unordered list\n" + Arrays.toString(numbers) + numbers.length);

        bubbleSort(numbers);
        System.out.println("Ordered list\n" + Arrays.toString(numbers) + numbers.length);


        System.out.println("Please enter a value you would like to search for:");
        int value =  input.nextInt();

        sequentialSearch(numbers, value);

        int found =  sequentialSearch(numbers, value);

        if (found != -1){

            System.out.println("Value found at position " + found);

        }

        else {
            System.out.println(value + " not found");
        }





    }//end of main


    public static int sequentialSearch(int[] numbers, int value){

        for(int i = 0; i < numbers.length; i++){

            if(numbers[i] == value){

                return i;

            }//end if

        }//end for

        return -1;

    }//end sequentialSearch

    public static void bubbleSort(int[] numbers) {

        for (int j = 0; j<numbers.length; j++ ){

            for (int i = 0; i< numbers.length - 1; i++){

                //Statement if numbers are not in order
                if (numbers[i] > numbers[i+1]){

                    //swaps the numbers
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;

                }//end if

            }//end inner for loop

        }//end outer for loop

    }//end bubbleSort method

    public static void fillArray() {

        //adding random values to the array
        for (int i = 0; i < numbers.length; i++){

            numbers[i] = random.nextInt(100);

        }

    }

}
