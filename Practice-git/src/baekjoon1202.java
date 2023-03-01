import java.util.*;
import java.io.*;
public class baekjoon1202 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); //보석 개수
		int k = Integer.parseInt(st.nextToken()); //가방 개수
		int [][] ruby = new int[n][2]; //보석 무게&가치
		int [] c = new int[k]; //가방 최대 무게
		long answer=0;
		
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine());
			ruby[i][0] = Integer.parseInt(st.nextToken());
			ruby[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(ruby, new Comparator<int []>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]!=o2[0]? o1[0]-o2[0]:o2[1]-o1[1];
			}
		});
		
		for(int i=0;i<k;i++) {
			c[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(c);
		
		PriorityQueue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		for(int i=0,j=0;i<k;i++) {
			while(j<n&&ruby[j][0]<=c[i]) {
				pq.offer(ruby[j][1]);
				j++;
			}
			if(!pq.isEmpty()) {
				answer+=pq.poll();
			}
		}
		
		System.out.print(answer);
	}
}
