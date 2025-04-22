public class maxmain{
  public static void main(String[] args) {
        int[] array = {10, 25, 5, 17, 40, 2};
        int min = array[0];
        int max = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Smallest element in the array: " + min);
        System.out.println("Largest element in the array: " + max);
    }
}
