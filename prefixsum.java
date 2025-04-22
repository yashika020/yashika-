public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] prefixSum = new int[array.length];
        prefixSum[0] = array[0]; 
        for (int i = 1; i < array.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + array[i];
        }
        System.out.print("Prefix Sum Array: ");
        for (int sum : prefixSum) {
            System.out.print(sum + " ");
        }
    }
}
