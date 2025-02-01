package hashmapandhashfunction.pairwithgivensumianarray;

import java.util.HashSet;

public class PairWithGivenSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;

            if (seen.contains(complement)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7, 3};
        int target = 171;
        boolean result = hasPairWithSum(arr, target);
        if (result) {
            System.out.println("A pair with the given sum exists.");
        } else {
            System.out.println("No pair with the given sum exists.");
        }
    }
}

