package javalesson1;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 1;
int b = a++;
System.out.println(a);
System.out.println(b);

int c = 10;
int d = c++;
System.out.println(c);
System.out.println(d);


System.out.println(b+d);

System.out.println(b++);

int f = -99;
int g = f++;
System.out.println(f);
System.out.println(g);
  

double d1 = 1.1;
double d2 = d1++;

System.out.println(d1);
System.out.println(d2);

char c1 = 'a';
//char c2 = c1++;
char c3 = ++c1; 
System.out.println(c1);
//System.out.println(c2);
System.out.println(c3);

int p = 4;
int q = p--;
System.out.println(p);
System.out.println(q);


int v1 = -97;
int v2 = v1--;
System.out.println(v1);
System.out.println(v2);



int m1 = 2;
int m2 = --m1;
System.out.println(m1);
System.out.println(m2);


int n1 = -48;
int n2 = --n1;
System.out.println(n1);
System.out.println(n2);

int l1 = 2;
int l2 = l1++ - l1++ +l1--;
System.out.println(l1);
System.out.println(l2);

int s1 = 1;
int s2 = 2;
System.out.println(--s2 - ++s1 + ++s2 - --s1);
System.out.println(s1);
System.out.println(s2);



int i = 19, j = 29, k;		
k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;		

System.out.println("i=" + i);
System.out.println("j=" + j);
System.out.println("k=" + k);


int m = 3, n = 3;
int ppp = --m * --n * n-- * m--;
 
System.out.println(ppp);
System.out.println(m);
System.out.println(n);



	}

}
