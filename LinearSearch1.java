class LinearSearch1 {
    /** Metodë për gjetjen e çelësit në listë */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }
}
