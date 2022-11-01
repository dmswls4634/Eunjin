import java.math.BigInteger;
import java.util.Scanner;

public class baekjoon2824 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] res_n;
		int [] res_m;
		
		BigInteger muln = new BigInteger("1");
		BigInteger mulm = new BigInteger("1");
		
		int n = sc.nextInt();
		int [] arrn = new int[n];
		for(int i=0;i<n;i++) {
			arrn[i] = sc.nextInt();
			muln = muln.multiply(BigInteger.valueOf(arrn[i]));
		}
		
		int m = sc.nextInt();
		int [] arrm = new int[m];
		for(int i=0;i<m;i++) {
			arrm[i] = sc.nextInt();
			mulm = mulm.multiply(BigInteger.valueOf(arrm[i]));
		}
		
		BigInteger res = muln.gcd(mulm);
		String a = res.toString();
		
		if(a.length()>9) {
			System.out.print(a.substring(a.length()-9));
		}
		
		else{
			System.out.print(a);
		}
	}
}
