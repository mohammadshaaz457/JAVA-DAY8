public class minimum {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
