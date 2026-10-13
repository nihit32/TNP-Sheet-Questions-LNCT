
import java.util.Scanner;

public class SumOfAraay {
    public static void main(String[] args) {

        /*
        A teacher wants to analyze the marks obtained by students
        in a programming test. Calculate total and average marks.
        */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] marks = new int[n];

        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        double average = (double) sum / n;

        System.out.println("Total : " + sum);
        System.out.println("Average : " + average);

        sc.close();
    }
}
