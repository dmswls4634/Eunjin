import java.io.*;
import java.util.*;
public class baekjoon2606 {
	static int N,M;
	static int cnt=0;
	static boolean [] visit;
	static ArrayList <Integer> node[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		
		visit = new boolean[N+1];
		node = new ArrayList[N+1];
		for(int i=0;i<=N;i++) {
			node[i] = new ArrayList<>();
		}
		
		for(int i=0;i<M;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			
			node[n1].add(n2);
			node[n2].add(n1);
		}
		
		DFS(1);
		System.out.print(cnt);
	}
	
	public static void DFS(int n) {
		visit[n]=true;
		
		for(int i:node[n]) {
			if(!visit[i]) {
				cnt++;
				DFS(i);
			}
		}	
	}
}
