import java.util.Scanner;

public class SumOfAraay {
    public static void main(String[] args) {
        /*
        A teacher wants to analyze the marks obtained by students in a programming test. The marks of all
        students are stored in a one-dimensional array.
        Given the marks of N students, calculate the total marks and average marks.
        */
       Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] marks = new int[n];

        int sum =0;
        for(int i=0;i<marks.length; i++){
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
        double Average = sum/n;
        System.out.println("Total : " + sum);
        System.out.println("Average : " + Average);
        sc.close();
    }
}
