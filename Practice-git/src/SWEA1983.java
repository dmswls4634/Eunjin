import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class SWEA1983 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());//¹Ýº¹È½¼ö
		String [] ans = new String[num];
		
		for(int i=0;i<num;i++) {
			String [] input = br.readLine().split(" ");
			int std = Integer.parseInt(input[0]);
			int rank = Integer.parseInt(input[1]);
			Double [] score = new Double [std];
			String [] grade = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
			
			for(int j=0;j<std;j++) {
				double sum=0;
				String [] data=br.readLine().split(" ");
				sum=Integer.parseInt(data[0])*0.35+Integer.parseInt(data[1])*0.45+Integer.parseInt(data[2])*0.2;
				score[j]=sum;
			}
			
			double that = score[rank-1];
			
			Arrays.sort(score,Collections.reverseOrder());
			
			for(int j=0;j<std;j++) {
				if(score[j]==that) {
					ans[i] = grade[j/(std/10)];
				}
			}
		}
		
		for(int i=0;i<num;i++) {
			System.out.println("#"+(i+1)+" "+ans[i]);
		}
	}
}
