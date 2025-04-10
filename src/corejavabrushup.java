
public class corejavabrushup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,4,6,100,45,75,68,8};
	//System.out.println(arr[0]);
		/*for (int s:arr) {
			System.out.println(s);
		}*/
		
		for (int i=0;i<arr.length;i++) {
			if (arr[i]%2 ==0) {
				System.out.println(arr[i]);
				break;
			}
		}
		
		String name="Brocolli - 1 Kg";
		String[] frmname = name.split("-");
		String formattedName = frmname[0].trim();
		System.out.println(formattedName);
		
		
	}

}
