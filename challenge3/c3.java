import java.util.*;

class c3{
	public static void main(String[] args){
		int[] array = {47,84,75,21,14,14,79};
		int maxIndex;
		
		sort(array);
		median(array);
		maxIndex = highest(array);
		System.out.println("Maximum number in array: "+array[maxIndex]);
		mode(array);
		displayPrime(array);
	}

	public static void sort(int[] A){//selection sort method
		for(int n = 0; n <= (A.length-1); n++){
			int minInd = n;
			for(int j = n+1; j <= (A.length-1); j++){
				if(A[j] < A[minInd]){
					minInd = j;
				}
			}
			int temp = A[minInd];
			A[minInd] = A[n];
			A[n] = temp;
		}
	}

	public static void median(int[] array){//method to print median
		int median = array.length/2;
		System.out.println("Median value in array: "+array[median]);
	}

	public static int highest(int[] array){
		int currMax = array[0];
		int currMaxIndex = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] > currMax){
				currMax = array[i];
				currMaxIndex = i;
			}
		}
		return currMaxIndex;
	}

	public static void mode(int[] array){//method to print mode
		int modeIndex;
		int[] mode = new int[array.length];
		for(int j = 0; j < array.length; j++){
			int count = 0;
			for(int i = 0; i < array.length; i++){
				if(array[j] == array[i]){
					count+=1;
				}
			}
			mode[j] = count;
		}
		modeIndex = highest(mode);
		System.out.println("Mode value in array: "+array[modeIndex]);
	}

	public static void displayPrime(int[] array){//method to store prime numbers in a list and display
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0; i < array.length; i++){
			if(isPrime(array[i])){
				q.add(array[i]);
			}
		}
		while(!q.isEmpty()){
			System.out.println(q.remove());
		}
	}

	public static boolean isPrime(int value){//method to check if number is prime
		boolean state = true;
		if(value <= 1){
			state = false;
		}
		for(int i = 2; i <= value / 2; i++){
			if((value % i) == 0){
				state= false;
			}
		}
		return state;
	}
}
