import java.io.*;
import java.util.*;
public class baekjoon2178 {
	static int N,M;
	static int nx,ny=0;
	static int [][] map;
	static int [] dx = {-1,1,0,0};
	static int [] dy = {0,0,-1,1};
	static boolean [][] visit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			for(int j=0;j<M;j++) {
				map[i][j] = str.charAt(j)-'0';
			}
		}
		
		visit = new boolean[N][M];
		visit[0][0]=true;
		BFS(0,0);
		
		System.out.println(map[N-1][M-1]);
	}
	
	public static void BFS(int x, int y) {
		Queue <int[]> q = new LinkedList<>();
		q.add(new int[] {x,y});
		
		while(!q.isEmpty()) {
			int [] p=q.poll();
			int px=p[0];
			int py=p[1];
			
			for(int i=0;i<4;i++) {
				int nx = px+dx[i];
				int ny = py+dy[i];
				
				if(nx>=0 && nx<N && ny>=0 && ny<M) {
					if(map[nx][ny]==1 && !visit[nx][ny]) {
						
						q.add(new int[] {nx,ny});
						map[nx][ny]=map[px][py]+1;
						visit[nx][ny]=true;
					}
				}
			}
		}
	}
}
