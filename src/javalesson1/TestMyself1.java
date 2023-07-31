package javalesson1;

public class TestMyself1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Incremental/Decremental Operators

		int i = 11;

		int i1 = i++ + ++i;
       
		System.out.println(i);
		System.out.println(i1);
	
	int a = 11;
	int b = 22;
	int c = a + b + a++ +b++ + ++a + ++b;
	
	System.out.println(c);
	System.out.println("a="+a);
	System.out.println("b="+b);
	System.out.println("c="+c);
	
	int m = 0;
	int m1 = m++ - --m + ++m - m--;
	
	System.out.println(m1);
	System.out.println(m);
	
	
	int j = 1; int k = 2; int l = 3;
	int n = j-- - k-- - l--;
	
	System.out.println("j="+j);
	System.out.println("k="+k);
	System.out.println("l="+l);
	System.out.println("n="+n);
	
	
	
	int d = 1; int e = 2; 
	int u = 1; int v = 2; int w =3;
	int z =u-- -v-- -w--;
	  
	
	System.out.println("u="+u);
	System.out.println("v="+v);
	System.out.println("w="+w);
	System.out.println("z="+z);
	
	System.out.println(--e - ++d + ++e - --d);
	
	
	int p = 19;  int q = 29;  
	int r = p-- - p++ + --q - ++q + --p - q-- + ++p - q++;
	
	
	System.out.println(p);
	System.out.println(q);
	System.out.println(r);
	
	
	
	int s = 0;
	 int t = 0;
	 int o = --s*--t*t--*s--;
	 
	System.out.println(o);
	System.out.println(s);
	System.out.println(t);
	
	
	int s1=1;
	int s2 = s1++ + ++s1 * --s1 - s1--;
	System.out.println(s2);
	
	
	
	int ch = 'A';
	System.out.println(++ch);
	
	
	double D = 1.5; double D1 = 2.5;
	System.out.println(D++ + ++D1);
	
	
	
	
	
	
	}

}
