package intermediateJavaTut;

public class GenericMethods {
	
	public static void main(String[] args) {
		
		System.out.println(GreatestOfAll(1,2,3));
		System.out.println(GreatestOfAll("aakash","rashmi","sanjay"));
	}
	
	public static <T extends Comparable<T>> T GreatestOfAll(T a,T b,T c) {
		T m=a;
		if(b.compareTo(m)>0)
			m=b;
		if(c.compareTo(m)>0)
			m=c;
		return m;
	}
}
