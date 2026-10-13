import java.util.Scanner;

public class CountposNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        int pos = 0;
        int neg = 0;
        int zero = 0;

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > 0 ){
                pos++;
            }
            else if(arr[i] < 0){
                neg++;
            }
            else{
                zero++;
            }
        }

        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);
        System.out.println("Zero: " + zero);

    }
}
