
class UserException extends Exception{
	public UserException() {
		
	}
	
	public UserException(String message) {
		super(message);
	}
}

public class TryTest07 {
	public static void main(String[] args) {
		try {
			int a = -11;
			if(a<=0) {
				throw new UserException("양수가 아닙니다!");
			}
		}catch (UserException ue) {
			System.out.println(ue.getMessage());
		}
	}
}
