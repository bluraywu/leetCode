import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<List<Integer>> freqency = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++)
            freqency.add(new ArrayList<>());

        Map<Integer, Integer> counts = new HashMap<>();

        // Create a HashMap that stores frequency
        for (int n : nums)
            counts.put(n, counts.getOrDefault(n, 0) + 1);

        for (int key : counts.keySet()) {
            // Get the frquency of that particular number. put in the index
            int freq = counts.get(key);
            freqency.get(freq).add(key);
        }

        List<Integer> result = new ArrayList<>();
        // From highest frequency to lowest
        for (int pos = freqency.size() - 1; pos >= 0 && result.size() < k; pos--) {
            if (freqency.get(pos).size() == 0)
                continue;

            for (int i = 0; i < freqency.get(pos).size(); i++)
                result.add(freqency.get(pos).get(i));
        }
        int[] arr = result.stream().mapToInt(i -> i).toArray();
        return arr;
    }
    /**
     * Time Complexity: O(nlog(k))
     * Space Complexity: O(n)
     */
    public int[] topKFrequent2(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums){
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getValue)
        );
        for (Map.Entry<Integer, Integer> it : frequency.entrySet()) {
            pq.add(it);
            if (pq.size() > k) pq.poll();
        }
        int i = k;
        while (!pq.isEmpty()) {
            arr[--i] = pq.poll().getKey();
        }
        return arr;
    }
}