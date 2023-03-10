public static int[] reverseArray(int[] arr) {
    int[] reversedArr = new int[arr.length];
    int j = 0;
    for (int i = arr.length - 1; i >= 0; i--) {
        reversedArr[j] = arr[i];
        j++;
    }
    return reversedArr;
}
