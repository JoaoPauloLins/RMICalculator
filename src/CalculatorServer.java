import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorServer {

	
	public static void main(String args[]) {
		
		int port = 1099;
		
		try {
			Calculator calculator = new CalculatorImpl();
			
			System.out.println("Creating register");
			LocateRegistry.createRegistry(port);
			
			System.out.println("Getting register");
			Registry registry = LocateRegistry.getRegistry();
			System.out.println("Server created");
			
			registry.bind("Hello", calculator);
			System.out.println("Calculator server ready");
			System.out.println("Press <ENTER> to finish");
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			bufferedReader.read();
		} catch (Exception e) {
			System.out.println("Calculator Server Main " + e.getMessage());
		}
	}
}
