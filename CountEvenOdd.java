import java.util.Scanner;

public class CountEvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int[] arr = new int[number];
        int odd = 0;
        int even = 0;
        for(int i=0; i<arr.length ; i++){
             arr[i] = sc.nextInt();

             if(arr[i]%2 == 0){
                even++;
             }else{
                odd++;
             }
        }
        sc.close();
        System.out.println("Even:" + even);
        System.out.println("Odd:" + odd);

    }
}