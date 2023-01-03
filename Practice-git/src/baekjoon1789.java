import java.io.*;
import java.util.*;
public class baekjoon1789 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//long S = Integer.parseInt(br.readLine());
		long S = Long.parseLong(br.readLine());
		long sum=0;
		long cnt=0;
		
		for(long i=1;;i++) {
			if(sum>S) {
				System.out.println(cnt-1);
				break;
			}
			sum+=i;
			cnt++;
		}
	}
}
