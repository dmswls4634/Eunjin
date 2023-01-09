import java.io.*;
import java.util.*;
public class baekjoon1743 {
	static int N,M,K;
	static int nx,ny=0;
	static int cnt=0;
	static int max=Integer.MIN_VALUE;
	static int [][] map;
	static int [] dx = {-1,1,0,0};
	static int [] dy = {0,0,-1,1};
	static boolean [][] visit;
	static ArrayList<Integer>arr = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		map = new int[N][M];
		visit = new boolean[N][M];
		
		for(int i=0;i<K;i++) {
			st=new StringTokenizer(br.readLine()," ");
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			map[x-1][y-1]=1;
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(map[i][j]==1 && !visit[i][j]) {
					cnt=1;
					DFS(i,j);
				}
			}
		}
		Collections.sort(arr,Collections.reverseOrder());
		System.out.println(arr.get(0));
	}
	
	public static void DFS(int x, int y) {
		visit[x][y]=true;
		arr.add(cnt);
		
		for(int i=0;i<4;i++) {
			nx = x+dx[i];
			ny = y+dy[i];
			 
			if(nx>=0 && nx<N && ny>=0 && ny<M) {
			    if(map[nx][ny]==1 && !visit[nx][ny]) {
			    	cnt++;
			       DFS(nx,ny);
			    }
			}
		}
	}
}
