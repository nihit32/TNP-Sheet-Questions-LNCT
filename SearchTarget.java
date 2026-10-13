public class SearchTarget {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int target = 25;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("Index: " + i);
                break;
            }
            else{
                System.out.println(-1);
                break;
            }
        }
    }
}
