import java.awt.Point;
import java.io.*;
import java.util.*;
public class baekjoon7576 {
	static int N,M;
	static int [] dx = {1,-1,0,0};
	static int [] dy = {0,0,1,-1};
	static int [][] tomato;	
	static Queue <Point> q = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		tomato = new int [N][M];
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				tomato[i][j]=Integer.parseInt(st.nextToken());
				if(tomato[i][j]==1) {
					q.add(new Point(i,j));
				}
			}
		}
		
		System.out.println(BFS());
	}
	
	public static int BFS() {
		while(!q.isEmpty()) {
			Point p = q.poll();
			int x = p.x;
			int y = p.y;
			
			for(int i=0;i<4;i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				if(nx>=0 && nx<N && ny>=0 && ny<M) {
					if(tomato[nx][ny]==0) {
						tomato[nx][ny]=tomato[x][y]+1;
						q.add(new Point(nx,ny));
					}
				}
			}
		}
		
		int max= Integer.MIN_VALUE;
		if(check()) {
			return -1;
		}
		else {
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					if(max<tomato[i][j]) {
						max=tomato[i][j];
					}
				}
			}
			return max-1;
		}
	}
	
	public static boolean check() {
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(tomato[i][j]==0) {
					return true;
				}
			}
		}
		return false;
	}
}
