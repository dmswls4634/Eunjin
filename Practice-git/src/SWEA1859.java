import java.util.*;
import java.io.*;
public class SWEA1859 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);	
		long [] p= new long [num];
		
		for(int i=0;i<num;i++) {
			String loop = br.readLine();
			int lp = Integer.parseInt(loop);
			String [] str2 = br.readLine().split(" ");

			long sum=0;
			int end=str2.length-1;
			
			for(int j=end;j>=1;j--) {
				
				if(Integer.parseInt(str2[j-1])<Integer.parseInt(str2[end])) {
					sum=sum+(Integer.parseInt(str2[end])-Integer.parseInt(str2[j-1]));
				}
				else {
					end=j-1;
				}
			}
			p[i]=sum;
		}
		
		for(int i=0;i<num;i++) {
			System.out.println("#"+(i+1)+" "+p[i]);	
		}
		
	}
}
