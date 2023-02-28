import java.util.*;
import java.io.*;
public class baekjoon2470 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int [] arr= new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int i=0;
		int j=n-1;
		int min=Integer.MAX_VALUE;
		int i_val=0;
		int j_val=0;
		
		while(i<j) {
			int a =arr[i];
			int b=arr[j];
			int dif=Math.abs(arr[i]+arr[j]);
			if(arr[i]+arr[j]<0) {
				min=Math.min(dif, min);
				i++;
			}
			else if(arr[i]+arr[j]>0) {
				min=Math.min(dif, min);
				j--;
			}
			else {
				i_val=arr[i];
				j_val=arr[j];
				break;
			}
			
			if(min==dif) {
				i_val=a;
				j_val=b;
			}
		}
		
		System.out.print(i_val+" "+j_val);
	}
}
