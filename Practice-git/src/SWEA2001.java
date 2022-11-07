import java.util.*;
import java.io.*;

public class SWEA2001 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[]ans=new int[num];
		
		
		for(int i=0;i<num;i++) {
			String [] nm = br.readLine().split(" ");
			
			int n = Integer.parseInt(nm[0]);
			int m = Integer.parseInt(nm[1]);
			int [][] arr = new int[n][n];
			int sum=0;
			int max=0;
			
			for(int j=0;j<n;j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int k=0;k<n;k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}	
			}
			
			for(int a=0;a<=n-m;a++) {
				for(int b=0;b<=n-m;b++) {
					for(int c=0;c<m;c++) {
						for(int d=0;d<m;d++) {
							sum+=arr[a+c][b+d];
							
							
						}
					}
					if(sum>max) {
						max=sum;
					}
					sum=0;
				}
			}
			ans[i]=max;
		}
		for(int i=0;i<num;i++) {
			System.out.println("#"+(i+1)+" "+ans[i]);
		}
	}
}
