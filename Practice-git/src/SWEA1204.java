import java.util.*;
import java.io.*;

public class SWEA1204 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int [] ans = new int[num];
		
		for(int i=0;i<num;i++) {
			int cnt=1;
			int [] arr=new int[10];
			arr[1]=0;
			
			String idx = br.readLine();
			String [] score = br.readLine().split(" ");
			Arrays.sort(score,Comparator.reverseOrder());
			
			for(int j=0;j<score.length-1;j++) {
				if(score[j].equals(score[j+1])) {
					cnt++;
				}
				else{
					if(cnt>arr[1]) {
						arr[0]=Integer.parseInt(score[j]);
						arr[1]=cnt;
					}
					cnt=1;
				}
			}
			ans[i]=arr[0];
		}
		for(int i=0;i<num;i++) {
			System.out.println("#"+(i+1)+" "+ans[i]);
		}
	}
}
