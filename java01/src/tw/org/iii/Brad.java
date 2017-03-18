package tw.org.iii;

public class Brad {
	int a;
	static int b;
	{
		a=100;
		System.out.println("{}:a="+ a);

	}
	static{
		System.out.println("static{}");
		//b++;

	}
	Brad(){
		System.out.println("Brad()");
	}
}
