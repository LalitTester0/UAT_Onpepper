import java.util.ArrayList;

public class Arraylist_backup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("abc");
		a.add(1, "test");
		a.add(2,"test2");
		//a.remove(1);
		boolean test=a.contains("ac");
		/*for(String s:a) {
			System.out.println(s);
		}*/
		System.out.println(test);
	}

}
