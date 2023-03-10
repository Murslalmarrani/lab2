
public static void emptyArray(int[] arr) {
    Random rand = new Random();
    while (arr.length > 0) {
        int index = rand.nextInt(arr.length);
        System.out.print(arr[index] + " ");
        arr[index] = arr[arr.length - 1];
        arr = Arrays.copyOf(arr, arr.length - 1);
    }
}
