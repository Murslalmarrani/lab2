public static int[] cloneArray(int[] arr) {
    int[] backupArr = new int[arr.length];
    System.arraycopy(arr, 0, backupArr, 0, arr.length);
    return backupArr;
}
