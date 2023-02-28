import java.util.*;
import java.io.*;
public class baekjoon1931 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [][] meet = new int[n][2];
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			meet[i][0]=Integer.parseInt(st.nextToken());
			meet[i][1]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(meet,new Comparator<int[]>() {
			public int compare(int [] o1, int [] o2) {
				return o1[1]!=o2[1] ? o1[1]-o2[1] : o1[0]-o2[0];
			}
		});
		
		int end = meet[0][1];
		int cnt=1;
		
		for(int i=1;i<n;i++) {
			if(meet[i][0]>=end) {
				end = meet[i][1];
				cnt++;
			}
		}
		
		System.out.print(cnt);

	}

}
