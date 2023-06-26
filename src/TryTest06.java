
public class TryTest06 {
	public static void exp(int ptr) throws NullPointerException {
		if (ptr == 0) {
			throw new NullPointerException();
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println("예외 발생전");
			exp(0);
			System.out.println("예외 발생후: 이 문장 실행 안함.");
		} catch (NullPointerException ne) {
			System.out.println("예외오류: " + ne);
		}
	}
}
