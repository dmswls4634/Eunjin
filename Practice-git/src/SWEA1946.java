import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA1946 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());//¹Ýº¹È½¼ö
		
		for(int i=0;i<num;i++) {
			int N = Integer.parseInt(br.readLine());
			String[] apb = new String[N];
			int [] cnt = new int[N];
			
			for(int a=0;a<N;a++) {
				String [] data = br.readLine().split(" ");
				apb[a] = data[0]; //¾ËÆÄºª
				cnt[a] = Integer.parseInt(data[1]); //È½¼ö
			}
			System.out.println("#"+(i+1));
			int c=0;
			for(int a=0;a<N;a++) { 
				for(int b=0;b<cnt[a];b++) {
					System.out.print(apb[a]);
					c++;
					if(c==10) {
						System.out.println();
						c=0;
					}
				}
			}
			System.out.println();
		}
	}
}
