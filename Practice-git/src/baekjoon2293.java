import java.util.*;
import java.io.*;
public class baekjoon2293 {
	static Integer[]coin;
	static int N,K;
	static int cnt=0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		coin = new Integer[N];
		for(int i=0;i<N;i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}	
		int [] DP=new int[K+1];
		DP[0]=1;
		
		for(int i=0;i<N;i++) {
			for(int j=1;j<=K;j++) {
				if(j>=coin[i]) {
					DP[j]+=DP[j-coin[i]];			
				}
			}
		}
		System.out.println(DP[K]);
	}
}
