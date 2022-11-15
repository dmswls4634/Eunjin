import java.io.*;
import java.util.*;

public class SWEA1209 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] ans = new int [10];
		
		for(int a=0;a<10;a++) {
			int num = Integer.parseInt(br.readLine());
			String [][] data = new String [100][100];
			int [] sum = new int [202];
			int temp=0;
			
			for(int i=0;i<100;i++) {
				data[i]=br.readLine().split(" ");
			}
			
			for(int i=0;i<100;i++) {
				temp=0;
				for(int j=0;j<100;j++) {
					temp+=Integer.parseInt(data[i][j]);
				}
				sum[i]=temp;
			}
			
			
			for(int i=0;i<100;i++) {
				temp=0;
				for(int j=0;j<100;j++) {
					temp+=Integer.parseInt(data[j][i]);
				}
				sum[100+i]=temp;
			}
			
			temp=0;
			for(int i=0;i<100;i++) {
				temp+=Integer.parseInt(data[i][i]);
			}
			sum[200]=temp;
			
			temp=0;
			for(int i=0;i<100;i++) {
				temp+=Integer.parseInt(data[i][99-i]);
			}
			sum[201]=temp;
			
			Arrays.sort(sum);
			ans[a]=sum[sum.length-1];
		}
		
		for(int a=0;a<10;a++) {
			System.out.println("#"+(a+1)+" "+ans[a]);
		}
		
		
	}
}
