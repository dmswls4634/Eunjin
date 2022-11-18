import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SWEA1970 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());//¹Ýº¹È½¼ö
		int [] m = {50000,10000,5000,1000,500,100,50,10};
		//Arrays.fill(ans, 0);
		
		for(int i=0;i<num;i++) {
			int money = Integer.parseInt(br.readLine());
			int [] ans = new int[8];
			
			int a=0;
			while(a<8) {
				int cnt=0;
				while(money>=m[a]) {
					money=money-m[a];
					cnt++;
				}
				ans[a]=cnt;
				a++;
			}
			
			System.out.println("#"+(i+1)+" ");
			for(int b=0;b<8;b++) {
				System.out.print(ans[b]+" ");
			}
			System.out.println();
		}

	}

}
