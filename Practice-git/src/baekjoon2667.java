import java.io.*;
import java.util.*;
public class baekjoon2667 {
	static int [] dx= {0,0,1,-1}; //x축 방향벡터
	static int [] dy= {1,-1,0,0}; //y축 방향벡터
	static int N; //정사각형 크기
	static int cnt=0; //단지 개수
	static ArrayList<Integer>ans = new ArrayList<>(); //각 단지 내 집 개수
	static int [][] sqr; //정사각형 값
	static boolean[][]visit; //집 여부 체크
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		String[][]temp=new String[N][N];
		sqr=new int[N][N];
		visit=new boolean[N][N];
		
		for(int i=0;i<N;i++) {
			temp[i]=br.readLine().split("");
			for(int j=0;j<N;j++) {
				sqr[i][j]=Integer.parseInt(temp[i][j]);
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(sqr[i][j]==1 && !visit[i][j]) {
					cnt=1;
					DFS(i,j);
					ans.add(cnt);
				}
			}
		}
		
		Collections.sort(ans);
		System.out.println(ans.size());
		for(int i:ans) System.out.println(i);
	}
	
	public static int DFS(int x, int y) {
		visit[x][y] = true;
		
		for(int i=0;i<4;i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(nx>=0 && ny>=0 && nx<N && ny<N) {
				if(sqr[nx][ny]==1 && !visit[nx][ny]) {
					DFS(nx,ny);
					cnt++;
				}
			}
		}
		return cnt;
		
	}
}
