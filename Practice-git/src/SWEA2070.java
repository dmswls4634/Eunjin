import java.io.*;
import java.util.*;

public class SWEA2070 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String [] ans = new String[num];
		
		for(int i=0;i<num;i++) {
			String [] arr = br.readLine().split(" ");
			if(Integer.parseInt(arr[0])>Integer.parseInt(arr[1])){
				ans[i]=">";
			}
			else if(Integer.parseInt(arr[0])<Integer.parseInt(arr[1])) {
				ans[i]="<";
			}
			else {
				ans[i]="=";
			}
		}
		
		for(int i=0;i<num;i++) {
			System.out.println("#"+(i+1)+" "+ans[i]);
		}
	}
}
