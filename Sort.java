package shape;

public class Sort<T> extends MyAbstractSort<T> {
	// straight selecting sorting
	@Override
	public T[] selectSort(T[] nums) {
		T minNum;
		int indexMin;
		for (int i = 0; i < nums.length; i++) {
			if (probe(nums)) {     //If true, then the sorting is over and break out the loop
				break;
			}
			minNum = nums[i];
			indexMin = i;
			for (int j = i; j < nums.length; j++) {
				if (compare(minNum, nums[j])) {    // compare elements
					minNum = nums[j];
					indexMin = j;
				}
			}
			nums[indexMin] = nums[i];
			nums[i] = minNum;
		}
		return nums;
	}

	// bubble sorting
	@Override
	public   T[]  bubbleSort(T[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (probe(nums)) {          // If true, then the sorting is over and break out the loop
				break;
			}
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (compare(nums[j], nums[j + 1])) {// compare elements
					exchange(j, j + 1, nums);// switch elements
				}
			}
		}
		return nums;
	}
	

}
