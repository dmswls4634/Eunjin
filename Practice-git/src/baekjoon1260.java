import java.io.*;
import java.util.*;
public class baekjoon1260 {
	static int N,M,V;
	static boolean [] visit_D = new boolean[N];
	static boolean [] visit_B= new boolean[N];
	static ArrayList <Integer> node [];
	static Queue<Integer> q = new LinkedList<>();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		visit_D=new boolean[N+1];
		visit_B=new boolean[N+1];
		node = new ArrayList[N+1];
		for(int i=0;i<=N;i++) {
			node[i]=new ArrayList<>();
		}
		
		for(int i=0;i<M;i++) {
			st= new StringTokenizer(br.readLine()," ");
			int n1=Integer.parseInt(st.nextToken());
			int n2=Integer.parseInt(st.nextToken());
			node[n1].add(n2);
			node[n2].add(n1);
		}
		
		for(int i=0;i<node.length;i++) {
			Collections.sort(node[i]);
		}
		
		DFS(V);
		System.out.println();
		BFS(V);
	}
	
	public static void DFS(int start) {
		visit_D[start]=true;
		System.out.print(start+" ");
		
		if(!node[start].isEmpty()) {
			for(int i:node[start]) {
				if(!visit_D[i]) {
					DFS(i);
				}
			}
		}
	}
	
	public static void BFS(int start) {
		q.add(start);
		visit_B[start]=true;
		
		while(!q.isEmpty()) {
			for(int i:node[q.peek()]) {
				if(!visit_B[i]) {
					q.add(i);
					visit_B[i]=true;
				}
			}
			System.out.print(q.poll()+" ");
		}
	}
}
