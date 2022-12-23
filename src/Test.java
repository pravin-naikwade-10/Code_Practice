import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static void main(String[] args) {
		/*
		 * String s=new String("test"); String s2=new String("test");
		 * //s.concat("output"); //System.out.println(s); System.out.println(s==s2);
		 * 
		 * StringBuffer sb= new StringBuffer(""); sb.append(true);
		 * System.out.println(sb);
		 */
		
		/*
		 * int a[]=new int[5]; a[0]=10; a[1]=20; a[3]=30; a[4]=40;
		 * System.out.println(a[0]/a[2]);
		 */
		/*
		 * System.out.println(10+30+"Hello"); System.out.println("Hello"+10+30);
		 */
		
		/*
		 * HashMap<Integer,String> hm=new HashMap<Integer,String>(); hm.put(1,"Mango");
		 * hm.put(2,"apple"); hm.put(3,"grape");//hm.put(3,null); hm.putIfAbsent(3,
		 * "orange"); for(Map.Entry entry:hm.entrySet()) {
		 * System.out.println(entry.getKey()+" "+entry.getValue()); }
		 */
		
		/*
		 * Double a=10.5; Double b=10.5; System.out.println(a==b);
		 */
		/*
		 * String str="abc"; int i=Integer.parseInt(str); System.out.println(i);
		 */
		
		/*
		 * for(int i=0;i<1;System.out.println("Welcome")) {
		 * System.out.println("Helo 2"); }
		 */
		/*
		 * int $_=5; System.out.println($_);
		 */
		
		//new Test().foo(null);
	}
	public void foo(String s) {
		System.out.println("String");
	}
	public void foo(StringBuffer s) {
		System.out.println("StringBuffer");
	}

}
