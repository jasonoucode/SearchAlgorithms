public class BinarySearchTest {

	// Keeps track of the number of tests and passed tests.
	private static int numTests = 0;
	private static int passedTests = 0;


	// Test left
	private static boolean testLeft() {
		++numTests;
		BinarySearch bs = new BinarySearch();

		int arr[] = {1, 2};
		int result = bs.binarySearch(arr, 0, arr.length-1, 1);

		return result == 0;
	}


	// Test right
	private static boolean testRight() {
		++numTests;
		BinarySearch bs = new BinarySearch();

		int arr[] = {1, 2};
		int result = bs.binarySearch(arr, 0, arr.length-1, 2);

		return result == 1;
	}


	// Tests empty array
	private static boolean testEmpty() {
		++numTests;
		BinarySearch bs = new BinarySearch();

		int arr[] = {};
		int result = bs.binarySearch(arr, 0, arr.length-1, 5);

		return result == -1;
	}


	// Tests middle result
	private static boolean testMid() {
		++numTests;

		BinarySearch bs = new BinarySearch();

		int arr[] = {1, 2, 3};
		int result = bs.binarySearch(arr, 0, arr.length-1, 2);

		return result == 1;
	}


	// Tests for case when not found
	private static boolean testNotFound() {
		++numTests;

		BinarySearch bs = new BinarySearch();

		int arr[] = {1, 2, 3, 4, 5};
		int result = bs.binarySearch(arr, 0, arr.length-1, 40);

		return result == -1;
	}


	// Main, runs all of the tests and prints out the results.
	public static void main(String[] args) {
		if (testEmpty())
			++passedTests;
		else
			System.out.println("Test Empty: Failed.");

		if (testMid())
			++passedTests;
		else
			System.out.println("Test Mid: Failed.");

		if (testNotFound())
			++passedTests;
		else
			System.out.println("Test Not Found: Failed.");

		if (testLeft())
			++passedTests;
		else
			System.out.println("Test Left: Failed.");

		if (testRight())
			++passedTests;
		else
			System.out.println("Test Right: Failed.");

		System.out.println("Tests Passed: " + passedTests + " / " + numTests);
	}

}