import java.io.*;
import java.util.*;

public class baekjoon1303 {
	
	static int N,M;
	static int nx,ny;
	static int cnt=0;
	
	static int W,B=0;
	static char [][] s;
	static boolean [][] visit;
	
	static int [] dx= {0,0,-1,1};
	static int [] dy= {-1,1,0,0};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		s = new char[M][N];
		visit = new boolean[M][N];
		
		for(int i=0;i<M;i++) {
			String str = br.readLine();
			for(int j=0; j<N; j++) {
				char ch = str.charAt(j);
				s[i][j] = ch; 
			}
		}
		
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(!visit[i][j]) {
					char color=s[i][j];
					cnt=0;
					DFS(j,i,color);
					
					if(color=='W') {
						W += cnt * cnt;
					}
					else {
						B += cnt * cnt;
					}
				}
			}
		}
		
		System.out.println(W+" "+B);
		
	}
	
	public static void DFS(int x, int y, char c) {
		visit[y][x]=true;
		cnt++;
		
		for(int i=0;i<4;i++) {
			nx = x + dx[i];
			ny = y + dy[i];
			
			if(check()==true&&!visit[ny][nx] && s[ny][nx]==c) {
				DFS(nx,ny,s[ny][nx]);
			}
		}
	}
	
	public static boolean check() {
		return (0 <= ny && ny < M && 0 <= nx && nx < N);
	}
}
