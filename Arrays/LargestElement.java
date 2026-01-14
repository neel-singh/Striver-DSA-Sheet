// Problem: Largest Element in an Array
// Pattern: Linear Search
// Time Complexity: O(n)
// Space Complexity: O(1)

class LargestElement {

    public static int largest(int[] arr) {
        int largest = Integer.MIN_VALUE;

        for (int ele : arr) {
            if (ele > largest) {
                largest = ele;
            }
        }

        return largest;
    }
}
