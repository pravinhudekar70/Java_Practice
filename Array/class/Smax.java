
public class Smax {
    public static void main(String[] args) {
        int arr[] = { 45, 12, 19, 22, 17, 54, 32, 28, 49, 26, 54 };
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                smax = max;
                max = arr[i];
            } else if (smax < arr[i] && arr[i] != max)
                smax = arr[i];
        }
        System.out.println("smax =" + smax + " :: max = " + max);
    }
}