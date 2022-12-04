package practice.leetcodesolutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrencesSolution2 {

    //Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.


    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        Set<Integer> freqSet = new HashSet<>(freq.values());
        return freq.size() == freqSet.size();
    }
}