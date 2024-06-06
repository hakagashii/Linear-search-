
public class LinearSearchTest1 {
    public static void main(String[] args) {
        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};

        int i = LinearSearch1.linearSearch(list, 4); // Kthen 1
        int j = LinearSearch1.linearSearch(list, -4); // Kthen -1
        int k = LinearSearch1.linearSearch(list, -3); // Kthen 5

        System.out.println("Index of 4: " + i); // Printo: Index of 4: 1
        System.out.println("Index of -4: " + j); // Printo: Index of -4: -1
        System.out.println("Index of -3: " + k); // Printo: Index of -3: 5
    }
}


