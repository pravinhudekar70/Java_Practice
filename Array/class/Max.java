public class Max {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int arr[] = {532,125,437,1247,327,88,29,8};
        for(int i= 0; i<arr.length; i++){
            if(max<arr[i])
            max = arr[i];
        }
        System.out.println(max);
    }
}