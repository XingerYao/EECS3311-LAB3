package shape;

public abstract class MyAbstractSort<T> implements MySort<T> {
	private int compare_count = 0;//the compare times of elements
	private int exchange_count = 0;//Switch times of elements
	private int probe_count = 0;  //  time of check

	//compare the value of elements
	public final boolean compare(T x, T y) {
		compare_count++;
		return (Integer) x > (Integer) y; //Generic numbers can not do operations, change them to int.
	}

	//switch values of each two elements
	public final void exchange(int x, int y, T nums[]) {
		T temp = nums[x]; 	
		nums[x] = nums[y];
		nums[y] = temp;
		exchange_count++;
	}

	//Check if the current array is finished the sorting or not, if true then the sorting is over
	public final boolean probe(T nums[]) {                           
		probe_count++;
		boolean flag = true;
		for (int i = 0; i < nums.length - 1; i++) {
			if ((Integer)nums[i] > (Integer)nums[i + 1]) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public int getCompare_count() {
		return compare_count;
	}

	public int getExchange_count() {
		return exchange_count;
	}

	public int getProbe_count() {
		return probe_count;
	}
	
	public String tostring() {
		return "Compare times: " + compare_count + "\nSwitch times£º" + exchange_count 
				+ "\nCheck times£º" + probe_count;
	}
}
