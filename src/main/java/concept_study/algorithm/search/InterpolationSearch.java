package concept_study.algorithm.search;

/**
 * Interpolation search is an concept.algorithm for searching for a given key in an indexed array that
 * has been ordered by numerical values assigned to the keys (key values). It parallels how humans search
 * through a telephone book for a particular name, the key value by which the book's entries are ordered.
 * <p>
 * Worst-case performance      O(n)<br>
 * Average performance         O(log(log(n)))<br>
 * <br>
 * https://en.wikipedia.org/wiki/Interpolation_search
 */
public class InterpolationSearch {
    //https://www.javatips.net/api/java-algorithms-implementation-master/src/com/jwetherell/algorithms/search
    // /InterpolationSearch.java

    private static int[] sorted = null;

    // Assuming the array is sorted
    public static final int find(int value, int[] array) {

        sorted = array;

        try {
            return recursiveFind(value, 0, sorted.length - 1);
        } finally {
            sorted = null;
        }
    }

    private static int recursiveFind(int value, int start, int end) {

        if (start == end) {
            int lastValue = sorted[start]; // start==end
            if (value == lastValue)
                return start; // start==end

            return Integer.MAX_VALUE;
        }

        final int mid = start + ((value - sorted[start]) * (end - start)) / (sorted[end] - sorted[start]);

        if (mid < 0 || mid > end)
            return Integer.MAX_VALUE;

        int midValue = sorted[mid];

        if (value == midValue)
            return mid;

        if (value > midValue)
            return recursiveFind(value, mid + 1, end);

        return recursiveFind(value, start, mid - 1);
    }
}






