import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA1959 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());//¹Ýº¹È½¼ö
		int [] ans = new int[num];
		
		for(int i=0;i<num;i++) {
			String [] input = br.readLine().split(" ");
			String [] arrN = br.readLine().split(" ");
			String [] arrM = br.readLine().split(" ");		
			int N = Integer.parseInt(input[0]);
			int M = Integer.parseInt(input[1]);
			int sum=0;
			
			if(N<M) {
				for(int b=0;b<=M-N;b++) {
					int temp=0;
					for(int a=0;a<N;a++) {
						temp+=Integer.parseInt(arrN[a])*Integer.parseInt(arrM[b+a]);
					}
					if(temp>sum) {
						sum=temp;
					}
				}	
			}
			else {
				for(int b=0;b<=N-M;b++) {
					int temp=0;
					for(int a=0;a<M;a++) {
						temp+=Integer.parseInt(arrM[a])*Integer.parseInt(arrN[b+a]);
					}
					if(temp>sum) {
						sum=temp;
					}
				}
			}
			ans[i]=sum;
		}
		
		for(int i=0;i<num;i++) {
			System.out.println("#"+(i+1)+" "+ans[i]);
		}
	}
}
