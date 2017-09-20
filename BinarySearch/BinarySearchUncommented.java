class BinarySearch {
	int binarySearch(int arr[], int left, int right, int val) {
		if (right >= left) {
			int mid = left + (right - 1)/2;

			if (arr[mid] == val) {
				return mid;
			} else if (arr[mid] > val) {
				return binarySearch(arr, left, mid-1, val);
			} else {
				return binarySearch(arr, mid+1, right, val);
			}
		}

		return -1;
	}


	public static void main(String args[]) {}

}
