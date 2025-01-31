package hashmapandhashfunction.subarrayswithzerosum;

import java.util.*;

public class SubarrayswithZeroSum {
    public static List<List<Integer>> findZeroSumSubarrays(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum == 0) {
                result.add(getSubarray(arr, 0, i));
            }
            if (map.containsKey(currentSum)) {
                List<Integer> indices = map.get(currentSum);
                for (int index : indices) {
                    result.add(getSubarray(arr, index + 1, i));
                }
            }

            map.putIfAbsent(currentSum, new ArrayList<>());
            map.get(currentSum).add(i);
        }

        return result;
    }
    private static List<Integer> getSubarray(int[] arr, int start, int end) {
        List<Integer> subarray = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            subarray.add(arr[i]);
        }
        return subarray;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 2, -2, 3, 1, -4, 4};

        List<List<Integer>> result = findZeroSumSubarrays(arr);

        System.out.println("Subarrays with zero sum:");
        for (List<Integer> subarray : result) {
            System.out.println(subarray);
        }
    }
}

