import java.util.*;
import java.io.*;

public class SWEA2056 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String [] ans = new String [num];
		
		for(int i=0;i<num;i++) {
			String str = br.readLine();	
			String insert = str.substring(0,4)+'/'+str.substring(4, 6)+'/'+str.substring(6, 8);			
			String [] data = insert.split("/");
			
			String even = "04,06,09,11";
			String odd = "01,03,05,07,08,10,12";
			
			//System.out.print[]
			
			if(Integer.parseInt(data[1])>12||Integer.parseInt(data[1])==0||Integer.parseInt(data[2])>31||Integer.parseInt(data[2])==0) {				
				ans[i]="-1";
			}
			else {
				if(even.contains(data[1])) {
					if(Integer.parseInt(data[2])>30) {
						ans[i]="-1";
					}
					else {
						String temp = data[0]+'/'+data[1]+'/'+data[2];
						ans[i]=temp;
						
					}
				}
				else if(odd.contains(data[1])) {
					if(Integer.parseInt(data[2])>31) {
						ans[i]="-1";
					}
					else {
						String temp = data[0]+'/'+data[1]+'/'+data[2];
						ans[i]=temp;
					}
				}
				else {
					if(Integer.parseInt(data[2])>28) {
						ans[i]="-1";
					}
					else {
						String temp = data[0]+'/'+data[1]+'/'+data[2];
						ans[i]=temp;
					}
				}
			}
		}
		
		for(int i=0;i<num;i++) {
			System.out.println("#"+(i+1)+" "+ans[i]);
		}
	}
}
