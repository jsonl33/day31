
public class TryTest10 {
	public static void main(String[] args) {
		try {
			for (int i = 1; i <= 5; i++) {
				if (i == 5) {
					i /= 0;
				} else if (i == 4) {
					continue;
				} else {
					System.out.println(i);
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println(6);
		}
	}
}