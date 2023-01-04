import java.util.*;
import java.io.*;
public class baekjoon2294 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int [] coin = new int[N];
		for(int i=0;i<N;i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(coin);
		
		int [] DP = new int[K+1];
		Arrays.fill(DP, 100001);
		DP[0]=0;
		
		/*int sum=0;
		for(int i=0;i<N;i++) {
			sum+=coin[i];
			if(sum==K) {
				DP[K]=i+1;
			}
		}*/
		
		
		for(int i=0;i<N;i++) {
			for(int j=1;j<=K;j++) {
				if(j>=coin[i]) {
					if(j%coin[i]==0) {
						DP[j]=j/coin[i];
					}
					else {
						for(int k=j/coin[i];k>=1;k--) {
							if(DP[j-(coin[i]*k)]>0) {
								int temp=DP[coin[i]*k]+DP[j-(coin[i]*k)];
								DP[j]=Math.min(temp, DP[j]);
							}
						}
					}	
				}
			}
		}
		if(DP[K]==100001) {
			System.out.println(-1);
		}
		else {
			System.out.println(DP[K]);
		}
		
	}
}
