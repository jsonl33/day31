
public class TryTest11 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(10 / 0);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException) {
				System.out.println(true);
			}
		} finally {
			System.out.println(6);
		}
	}
}