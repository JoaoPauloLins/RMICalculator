import java.rmi.Naming;

public class CalculatorClient {
	
	public static void main(String args[]) {
		
		try {
			Calculator calculator =  (Calculator) Naming.lookup("Hello");
			System.out.println("Addition: "+calculator.add(20, 15));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
