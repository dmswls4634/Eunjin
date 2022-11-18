import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA1986 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++) {
			int n = Integer.parseInt(br.readLine());
			
			int sum=0;
			for(int a=1;a<=n;a++) {
				if(a%2!=0) {
					sum+=a;
				}
				else {
					sum-=a;
				}
			}
			
			System.out.println("#"+(i+1)+" "+sum);
		}

	}

}
