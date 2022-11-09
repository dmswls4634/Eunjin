import java.util.*;
import java.io.*;

public class SWEA2007 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int [] ans = new int[num];
		
		for(int i=0;i<num;i++) {
			String [] arr = br.readLine().split("");
			int j=1;
			int cnt=0;
			while(j<arr.length) {
				String [] check = new String[30];
				if(arr[0].equals(arr[j])) {
					int idx=j;
					
					for(int k=1;j+k<arr.length;k++) {
						if(arr[k].equals(arr[j+k])) {
							check[k-1]="p";
						}
						else {
							check[k-1]="u";
						}
					}	
					if(!Arrays.asList(check).contains("u")) {
						ans[i]=j;	
						break;
					}
					else {
						j++;
					}
				}
				else {
					j++;
				}
			}
		}
		for(int i=0;i<num;i++) {
			System.out.println("#"+(i+1)+" "+ans[i]);
		}

	}
}
