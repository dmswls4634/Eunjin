import java.io.*;
import java.util.*;

public class SWEA1208 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] ans = new int[10];
		
		for(int i=0;i<10;i++) {
			int cnt=0;
			int dump = Integer.parseInt(br.readLine());
			String [] str = br.readLine().split(" ");
			int [] temp = new int[str.length];
			
			for(int j=0;j<str.length;j++) {
				temp[j] = Integer.parseInt(str[j]);
			}
			
			Arrays.sort(temp);
			
			while(true) {
				if(temp[temp.length-1]>temp[0]) {
					temp[temp.length-1]=temp[temp.length-1]-1;
					temp[0] = temp[0]+1;
					cnt++;
					Arrays.sort(temp);
					if(cnt==dump||temp[str.length-1]==temp[0]) {
						ans[i] = temp[str.length-1]-temp[0];
						break;
					}
				}
			}
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("#"+(i+1)+" "+ans[i]);
		}
	}

}
