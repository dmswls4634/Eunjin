import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SWEA3282 {
	static int N,K;
	static int [] w;
	static int [] v;
	static int [][] dp;
	
	public static void DP(int idx) {
		dp = new int[K+1][N+1];
		
		for(int i=1;i<=K;i++) {
			for(int j=1;j<=N;j++) {
				if(w[j]<=i) {
					dp[i][j]=Math.max(dp[i][j-1],dp[i-w[j]][j-1]+v[j]);
				}
				else {
					dp[i][j] = dp[i][j-1];
				}
			}
		}
		System.out.println("#"+idx+" "+dp[K][N]);
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());//반복횟수
		
		for(int i=1;i<=num;i++) {
			String[]NK=br.readLine().split(" ");
			N=Integer.parseInt(NK[0]); //물건 개수
			K=Integer.parseInt(NK[1]); //가방 부피
			w = new int[N+1];
			v = new int[N+1];
			
			for(int j=1;j<=N;j++) {
				String[]data=br.readLine().split(" ");
				w[j]=Integer.parseInt(data[0]);
				v[j]=Integer.parseInt(data[1]);
			}
			
			DP(i);

			/*for(int a=0;a<N;a++) {
				String[]data=br.readLine().split(" ");
				w[a]=Integer.parseInt(data[0]);
				v[a]=Integer.parseInt(data[1]);
			}
			
			int max=0;
			for(int a=0;a<N;a++) {
				int sum=w[a];
				ArrayList<Integer>temp=new ArrayList<>();
				ArrayList<Integer>value=new ArrayList<>();
				for(int b=a+1;b<N;b++) {
					if(sum+w[b]<=K) {
						int s = temp.size();
						if(!temp.isEmpty()) {
							for(int c=0;c<s;c++) {
								if(temp.get(c)+w[b]<=K) {
									temp.add(temp.get(c)+w[b]);
									value.add(temp.get(c)+v[b]);
									if(temp.get(c)+v[b]>max) {
										max=temp.get(c)+v[b];
									}
								}
							}
						}
						temp.add(sum+w[b]);
						value.add(v[a]+v[b]);
						if(v[a]+v[b]>max) {
							max=v[a]+v[b];
						}
					}
				}
			}
			
			System.out.println("#"+(i+1)+" "+max);*/
			
		}

	}

}
