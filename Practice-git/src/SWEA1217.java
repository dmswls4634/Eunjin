import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA1217 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<10;i++) {
			int idx = Integer.parseInt(br.readLine());
			String[]data=br.readLine().split(" ");
			int num = Integer.parseInt(data[0]);
			int rep = Integer.parseInt(data[1]);
			
			int ans=1;
			for(int a=0;a<rep;a++) {
				ans*=num;
			}
			
			System.out.println("#"+idx+" "+ans);
			
			
		}

	}

}
