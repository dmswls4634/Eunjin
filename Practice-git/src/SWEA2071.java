import java.util.*;
import java.io.*;

public class SWEA2071 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int sum=0;
		int [] ans = new int [num];
		for(int i=0;i<num;i++) {
			String [] str =br.readLine().split(" ");
			for(int j=0;j<str.length;j++) {
				sum+=Integer.parseInt(str[j]);
			}
			double avg = sum/10d;
			
			//ans[i] = (int)Math.round(avg);
			double temp = avg*10;
			if(temp%10<5) {
				avg = (temp-(temp%10))/10;
			}
			else {
				avg = (temp+10-(temp%10))/10;
			}
			ans[i] =(int)avg;
			sum=0;
		}
		for(int i=0;i<num;i++) {
			System.out.println("#"+(i+1)+" "+ans[i]);
		}
	}
}
