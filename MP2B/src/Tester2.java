
public class Tester2 {

	public static void main(String[] args) {
		int inNum = 7;
		Class2 numbers = new Class2(100);
		numbers.load();
		if (numbers.search(inNum)) {
			System.out.println("The number is found in the array");
		}
		else {
			System.out.println("We couldn't find your number.");
		}
		
		System.out.println("Your largest number is " + numbers.findMax());
		System.out.println("Your smallest number is " + numbers.findMin());
		System.out.println("The location of the largest value is " + numbers.findMaxPos());
		System.out.println("The location of the smallest value is " + numbers.findMinPos());
		
		// TODO Auto-generated method stub
		
	}

}
