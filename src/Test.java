
public class Test {

	public static void main(String[] args) {
		
		String s1="mock";
		String s2="Interview";
		String s3=new String("mock");
		String s4="mock";
		System.out.println(s1==s2);//f
		System.out.println(s1==s3);//f
		System.out.println(s1==s4);//T
	}
}
