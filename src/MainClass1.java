public class MainClass1

	{

	static void overloadedMethod(A a)

	{

	System.out.println("ONE");

	}

	static void overloadedMethod(B b)

	{

	System.out.println("TWO");

	}

	static void overloadedMethod(Object o)

	{

	System.out.println("THREE");

	}

	public static void main(String[] args)

	{

	C c = new C();
	B o=new B();
   Object e=new Object();
	overloadedMethod(e);

	}

	}

