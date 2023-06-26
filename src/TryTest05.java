
public class TryTest05 {
	public static void main(String[] args) {
		int arr[] = {10, 20, 30};
		
		try {
			System.out.println("Test - 01");
			arr[3] = 40;
			System.out.println("Test - 02");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
