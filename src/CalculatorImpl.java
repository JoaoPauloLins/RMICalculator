import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator{

	private static final long serialVersionUID = 6775505366585750033L;
	
	protected CalculatorImpl() throws RemoteException {
		super();
	}

	@Override
	public int add(int v1, int v2) throws RemoteException {
		return v1+v2;
	}

	@Override
	public int sub(int v1, int v2) throws RemoteException {
		return v1-v2;
	}

	@Override
	public int mul(int v1, int v2) throws RemoteException {
		return v1*v2;
	}

	@Override
	public int div(int v1, int v2) throws RemoteException {
		return v1/v2;
	}

}
