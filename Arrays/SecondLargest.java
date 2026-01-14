// Problem: Second Largest Element in an Array
// Pattern: Linear Search
// Time Complexity: O(n)
// Space Complexity: O(1)

class SecondLargest {

    public static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int ele : arr) {
            if (ele > largest) {
                secondLargest = largest;
                largest = ele;
            } else if (ele < largest && ele > secondLargest) {
                secondLargest = ele;
            }
        }

        return secondLargest;
    }
}
