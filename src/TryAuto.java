import java.io.PrintWriter;
import java.util.ArrayList;

public class TryAuto {
	public static void main(String[] args) throws Exception{
		ArrayList<String> nameList = new ArrayList<>();
		nameList.add("lee");
		nameList.add("park");
		nameList.add("hong");
		
		try (PrintWriter output = new PrintWriter("./src/out.txt")){
			for(String name:nameList) {
				output.println(name.toUpperCase());
			}
		}catch (Exception e) {
			
		}
	}
}
