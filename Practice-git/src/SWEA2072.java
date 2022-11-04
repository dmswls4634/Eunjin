import java.util.*;
import java.io.*;

public class SWEA2072 {
	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));		
		
		String str1 = br1.readLine();
		int num = Integer.parseInt(str1);
		int [][] str2 = new int[num][10];
		int  sum=0;
		int[]a=new int[num];
		for(int i=0;i<num;i++) {
			String[] d = br1.readLine().split(" ");
			for(int j=0;j<10;j++) {
				if(Integer.parseInt(d[j])%2!=0) {
					sum+=Integer.parseInt(d[j]);
				}
			}
			a[i]=sum;
			sum=0;
		}
		for(int i=0;i<num;i++) {
			System.out.println("#"+(i+1)+" "+ a[i]);
		}
	}
}
