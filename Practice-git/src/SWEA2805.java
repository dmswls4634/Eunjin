import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA2805 {

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine()); //¹Ýº¹È½¼ö
		int [] ans = new int[num]; //Á¤´ä
		
		for(int i=0;i<num;i++) {
			int n = Integer.parseInt(br.readLine()); //³óÀåÅ©±â
			String [][] data = new String[n][n]; //³óÀÛ¹° °¡Ä¡ n*n
			int sum=0;
			
			for(int j=0;j<n;j++) {
				data[j] = br.readLine().split("");
			}
			
			for(int j=0;j<=n/2;j++) {
				for(int k=n/2-j;k<=n/2+j;k++) {
					sum+=Integer.parseInt(data[j][k]);
				}
			}
			
			int c=0;
			for(int j=n-1;j>n/2;j--) {
				for(int k=n/2-c;k<=n/2+c;k++) {
					sum+=Integer.parseInt(data[j][k]);
				}
				c++;
			}
			
			ans[i]=sum;
			
		}
		
		for(int i=0;i<num;i++) {
			System.out.println("#"+(i+1)+" "+ans[i]);
		}
	}
}
