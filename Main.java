import java.util.Arrays;import java.util.Scanner;
public class Main { public static void main(String[] args) {
    Scanner aah = new Scanner(System.in);
    System.out.println("Введите размер массива"); int size = aah.nextInt();
    System.out.println("Введите элементы");
    int [] array = new int[size]; for (int i = 0; i < size; i++)
    {
        array[i] = aah.nextInt();
    }
    System.out.println(); boolean isSorted = false;
    int buf; while(!isSorted) {
        isSorted = true; for (int i = 0; i < array.length -1; i++) {
            if(array[i] > array[i+1]){ isSorted = false;
                buf = array[i];
                array[i] = array[i+1]; array[i+1] = buf;
            } }
    } System.out.println(Arrays.toString(array));
}}