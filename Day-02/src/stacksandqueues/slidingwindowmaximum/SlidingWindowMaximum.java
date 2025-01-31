package stacksandqueues.slidingwindowmaximum;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindowMaximum {
    public static List<Integer> printMaximumSliding(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        // Process first 'k' elements
        for (int i = 0; i < k; i++) {
            int element = nums[i];
            while (!dq.isEmpty() && element > nums[dq.getLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }

        // Process the rest of the elements
        for (int j = k; j < nums.length; j++) {
            ans.add(nums[dq.getFirst()]); // Store the max of previous window

            // Remove elements that are out of this window
            while (!dq.isEmpty() && dq.getFirst() <= j - k) {
                dq.removeFirst();
            }

            // Remove smaller elements as they are useless
            while (!dq.isEmpty() && nums[j] > nums[dq.getLast()]) {
                dq.removeLast();
            }

            dq.addLast(j);
        }

        // Add max of the last window
        ans.add(nums[dq.getFirst()]);

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, -1, -3, 5, 3, 2, 1, 6};
        int k = 3;
        System.out.println(printMaximumSliding(arr, k));
    }
}
