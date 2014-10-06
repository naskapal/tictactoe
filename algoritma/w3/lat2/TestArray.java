package lat2;

public class TestArray {

	public static void main (String[] args){
		int[] array1 = {2,3,5,7,11,13,17,19};
		int[] array2;
		TestArray ta  = new TestArray();
		array2 = array1;
		ta.printArray(array1);
		ta.printArray(array2);
		for (int i = 0; i < array2.length; i++){
			if((i % 2) == 0)
				array2[i] = i;
		}
		ta.printArray(array1);
		ta.printArray(array2);
	}
	public void printArray(int [] arr){
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
