import java.io.*;
import java.util.*;
import java.math.*;
public class baekjoon14888 {
	public static int N;
	public static int maxVal=Integer.MIN_VALUE;
	public static int minVal=Integer.MAX_VALUE;
	public static int [] data;
	public static int [] op = new int[4]; //연산자
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine()); //숫자 개수
		String [] temp1 = br.readLine().split(" ");
		String [] temp2 = br.readLine().split(" ");
		data = new int[N]; //숫자
		
		for(int i=0;i<N;i++) {
			data[i]=Integer.parseInt(temp1[i]);
		}
		
		for(int i=0;i<4;i++) {
			op[i]=Integer.parseInt(temp2[i]);
		}
		
		DFS(data[0],1);
		
		System.out.print(maxVal+"\n"+minVal);
	}
	
	public static void DFS(int num, int cnt) {
		if(cnt==N) {
			maxVal = Math.max(maxVal,num);
			minVal = Math.min(minVal,num);
			return;
		}

		for(int i=0;i<4;i++) {
			if(op[i]>0) {
				op[i]--;
				
				switch(i) {
				case 0: DFS(num + data[cnt],cnt+1); break;
				case 1: DFS(num - data[cnt],cnt+1); break;
				case 2: DFS(num * data[cnt],cnt+1); break;
				case 3: DFS(num / data[cnt],cnt+1); break;
				}
				op[i]++;
			}
		}
	}
}
