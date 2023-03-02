import java.util.*;
import java.io.*;
public class baekjoon2468 {
	static int n;
	static int [][] arr;
	static boolean [][] check;
	static int [] dx = {0,0,1,-1};
	static int [] dy = {1,-1,0,0};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		int mh=0;
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<n;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
				mh=Math.max(mh, arr[i][j]);
			}
		}
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<=mh;i++) {
			check = new boolean [n][n];
			int cnt=0;
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					if(!check[j][k]&&arr[j][k]>i) {
						cnt+=search(i,j,k);
					}
				}
			}
			max = Math.max(cnt,max);
		}
		
		System.out.print(max);
	}
	public static int search(int a,int x, int y) {
		check[x][y]=true;
		for(int i=0;i<4;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx>=0 && nx<n && ny>=0 && ny<n) {
				if(arr[nx][ny]>a && !check[nx][ny]) {
					search(a, nx, ny);
				}
			}
		}
		return 1;
	}
}
