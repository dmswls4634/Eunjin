import java.io.*;
import java.util.*;
public class SWEA1493 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++) {
			String [] pq = br.readLine().split(" ");
			int p = Integer.parseInt(pq[0]);
			int q = Integer.parseInt(pq[1]);
			
			int [][] diagonal = new int[301][301];
			for(int a=0;a<150;a++) {
				Arrays.fill(diagonal[a], 0);
			}
			
			int length = 1;
			int data = 1;
			int cnt=0;
			while(true) {
				int a=1;
				for(int b=length;b>=1;b--) {
					diagonal[a][b]=data;
					data++;
					a++;
				}
				length++;
				cnt++;
				if(cnt==300) {
					break;
				}
			}
			
			cnt=0;
			length=299;
			while(true) {
				int a=2;
				for(int b=300;b>=cnt+2;b--) {
					diagonal[cnt+a][b]=data;
					data++;
					a++;
				}
				cnt++;
				if(cnt+2>300) {
					break;
				}
			}
			
			int [] coor1 = new int[2];
			int [] coor2 = new int[2];
			for(int a=1;a<=300;a++) {
				for(int b=1;b<=300;b++) {
					if(diagonal[a][b]==p) {
						coor1[0] = a;
						coor1[1] = b;
					}
					if(diagonal[a][b]==q) {
						coor2[0] = a;
						coor2[1] = b;
					}
				}
			}
			
			int [] coor = {coor1[0]+coor2[0],coor1[1]+coor2[1]};
			System.out.println("#"+(i+1)+" "+diagonal[coor[0]][coor[1]]);
		}
	}

}
