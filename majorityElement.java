/*
    Given an array arr[]. Find the majority element in the array. If no majority element exists, return -1.
*/

class MajorityElement {
    
    public static int majorityElement(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 1; // count the current element

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return arr[i]; // found majority
            }
        }
        return -1; // no majority found
    }
    public static void main(String[] args) {
       int[] arr = {1, 1, 2, 1, 3, 5, 1};
       System.out.println(majorityElement(arr));
    }
}
