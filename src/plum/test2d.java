package plum;

public class test2d {

	public static void main(String[] args) {
		String filename ="Sheet name: Borrower Stats";
		int startIndex = filename.indexOf(":") + 2; 
		String fileNames = filename.substring(startIndex);
		System.out.println(fileNames);
	}

}
