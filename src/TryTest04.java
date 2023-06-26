
class Member04 {
	String id = "abc56789";
	String name = "홍길동";
	String addr = "서울시 종로구";
}

public class TryTest04 {
	public static void main(String[] args) {
		Member04 m = null;
		try {
			System.out.println("아이디: " + m.id + ", 회원이름: " + m.name + ", 주소: " + m.addr);
		} catch (Exception e) {
			System.out.println("예외 발생: " + e);
			m = new Member04();
			System.out.println("아이디: " + m.id + ", 회원이름: " + m.name + ", 주소: " + m.addr);
		}
	}
}
