package firstP;

public class difference_highest_lowest {

	static int[] array = {12,23,45,67,89,13};
	
	public static int minimum(String[] args) {
		int min = array[0];
		
		for (int i = 1; i< array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		
		return min; 
	}
	
	
	public static int maximum(String[] args) {
		int max = array[0];
		for (int i = 1; i< array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
	
		int difference = maximum(args) - minimum(args);
		
		System.out.println("The difference is " + difference);
		
	}
}
