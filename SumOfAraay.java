import java.util.Scanner;

public class SumOfAraay {
    pgitublic static void main(String[] args) {
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
