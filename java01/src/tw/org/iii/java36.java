package tw.org.iii;

import java.awt.print.PrinterException;
import java.io.IOException;
import java.rmi.RemoteException;

public class java36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

} 
class Brad461{
	void m1() throws IOException{}	
}
class Brad462 extends Brad461{//拋出"例外" 必須比父類別更小或相同才行
	void m1() throws RemoteException{}//為IOException子類別
}
