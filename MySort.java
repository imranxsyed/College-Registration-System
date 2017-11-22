package project;

public class MySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {9,8,7,6,5,4,3,2,1,0};
		for (int i=0; i<numbers.length-1; i++){
			for (int j=i+1; j<numbers.length; j++){
				if (numbers[i]> numbers[j]){
					int temp = numbers[j];
					numbers[j]= numbers[i];
					numbers[i]= temp;
				}
			}
		}
		
		for(Integer i : numbers){
			System.out.print(i+",");
		}

	}

}
