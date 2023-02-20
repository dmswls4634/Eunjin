import java.io.*;
import java.util.*;
public class baekjoon16953 {
	static int A,B;
	static int cnt=1;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		
		while(B!=A) {
			if(B<A) {
				cnt=-1;
				break;
			}
			if(B%2==0) {
				B=B/2;
			}
			else if(B%10==1){
				B=B/10;
			}
			else {
				cnt=-1;
				break;
			}
			cnt++;
		}
		System.out.print(cnt);
	}
}
