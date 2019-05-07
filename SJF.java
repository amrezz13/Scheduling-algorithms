package test;

public class SJF {

	public int arr [];
	
	public void  Sort(int [] arr ) {
		int min;
	    for (int i = 0; i < arr.length; i++) {
	        min = i;
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[j] < arr[min]) {
	                min = j;
	            }
	        }
	        if (min != i) {
	            final int temp = arr[i];
	            arr[i] = arr[min];
	            arr[min] = temp;
	        }
	        System.out.println(arr[i]);// I print the in ascending order
	    }
	}

}
