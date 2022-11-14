import java.io.*;
import java.util.*;

public class SWEA1979 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int [] ans = new int[num];
		
		for(int i=0;i<num;i++) {
			String [] input = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int k = Integer.parseInt(input[1]);
			String [][] data = new String[n][n];
			
			int check=0;
			
			for(int j=0;j<n;j++) {
				data[j]=br.readLine().split(" ");
			}
			
			
			for(int a=0;a<n;a++) {
				Stack <Integer> s = new Stack<Integer>();
				int cnt=0;
				
				for(int b=0;b<n;b++) {
					s.push(Integer.parseInt(data[a][b]));
				}
				
				while(!s.empty()) {
					if(s.peek()==1) {
						cnt++;
						s.pop();
						if(!s.empty()&&cnt==k&&s.peek()!=1) {
							check++;
							cnt=0;
						}
						else if(s.empty()&&cnt==k) {
							check++;
							cnt=0;
						}
					}
					else {
						cnt=0;
						s.pop();
					}
				}
				s.clear();
			}
			
			ans[i]=check;
			check=0;
			
			for(int a=0;a<n;a++) {
				Stack <Integer> s = new Stack<Integer>();
				int cnt=0;
				for(int b=0;b<n;b++) {
					s.push(Integer.parseInt(data[b][a]));
				}
				while(!s.empty()) {
					if(s.peek()==1) {
						cnt++;
						s.pop();
						if(!s.empty()&&cnt==k&&s.peek()!=1) {
							check++;
							cnt=0;
						}
						else if(s.empty()&&cnt==k) {
							check++;
							cnt=0;
						}
					}
					else {
						cnt=0;
						s.pop();
					}
				}
				s.clear();
			}
			ans[i]+=check;
		}
		
		for(int i=0;i<num;i++) {
			System.out.println("#"+(i+1)+" "+ans[i]);
		}
	}
}
