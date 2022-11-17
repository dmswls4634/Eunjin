import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA1961 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());//¹Ýº¹È½¼ö
		//int [] ans = new int[num];
		
		for(int i=0;i<num;i++) {
			int n = Integer.parseInt(br.readLine());
			String[][] input = new String[n][n];
			
			for(int j=0;j<n;j++) {
				input[j] = br.readLine().split(" ");
			}
			
			System.out.println("#"+(i+1));
			
			for(int a=0;a<n;a++) {	
				for(int b=n-1;b>=0;b--) {
					System.out.print(input[b][a]);
				}
				System.out.print(" ");
				
				for(int b=n-1;b>=0;b--) {
					System.out.print(input[Math.abs(a-(n-1))][b]);
				}
				System.out.print(" ");
		
				for(int b=0;b<n;b++) {	
					System.out.print(input[b][Math.abs(a-(n-1))]);
				}
				System.out.println();
			}
		}
	}
}
