
public class Tester1 {

	public static void main(String[] args) {
		String inWord = "mile";
		Class1 words = new Class1(100);
		words.load();
		if (words.search(inWord)) {
			System.out.println("The word is found in the array");//add word to output
		}
		else {
			System.out.println("The word could not be found");
		}

		System.out.println("Your largest word is " + words.findLongest());
		System.out.println("Your smallest word is " + words.findShortest());
		System.out.println("The location of the largest word is " + words.findLongestPosition());
		System.out.println("The location of the smallest word is " + words.findShortestPosition());

	}

}
