public class MaxMinimum {
    public static void main(String[] args) {
        int[] arr = {-5 ,-10, -2 ,-20 };

        int max = arr[0];
        int min = arr[0];
        for( int i=0; i<arr.length; i++){
            if(arr[i] > max ){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
