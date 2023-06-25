package week1.myworkout1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int  range = 8, firstNum = 0 , secNum = 1;
		
		System.out.println(firstNum);
		
		for (int i = 1; firstNum<=range; i++) {
			//System.out.println(firstNum +" , ");
			
			int sum = firstNum+secNum;
		    firstNum = secNum;
			secNum = sum;
		    
			System.out.println(sum);
			
		}

	}

}
