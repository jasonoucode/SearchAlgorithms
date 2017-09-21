// Binary Search class and implementation
class BinarySearch {
	/**
	 * @desc search a sorted array repeatedly dividing the search interval
	 * 		 in half. Begin with an interval covering the whole array.
	 * 		 If the value of the search key is less than the item in the middle
	 * 		 of the interval, narrow the interval to the lower half. Otherwise
	 * 		 narrow it to the upper half. Repeatedly check until the value is
	 * 		 found or the interval is empty.
	 *
	 * @param int arr[] - the sorted array we are searching in
	 * @param int left - left index we are searching
	 * @param int right - right index we are searching
	 * @param int val - value we are looking for
	 *
	 * @return int - failure indicated with -1, success returns index of array
	 * that the value was found in
	 */
	int binarySearch(int arr[], int left, int right, int val) {
		// As long as the right index is larger than or equal to the left
		// 		index, that means we can keep searching for the val
		if (right >= left) {
			// Calculate the midpoint of the left and right index
			int mid = (left + right)/2;

			// If the mid val is what we are looking for,
			//		return the mid index
			if (arr[mid] == val) {
				return mid;
			} else if (arr[mid] > val) {
				// If the value is less than the mid index val
				//		we search everything to the left of
				//		the mid val
				return binarySearch(arr, left, mid-1, val);
			} else {
				// Else we search everything to the right of the
				//		mid val
				return binarySearch(arr, mid+1, right, val);
			}
		}

		// If val not found after going through the entire array,
		//		return -1 to indicate not found
		return -1;
	}


	/**
	 * @desc main function
	 */
	public static void main(String args[]) {}

}
