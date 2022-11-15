import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA2806 {
	public static int n;
	public static int [] data;
	public static int cnt=0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int [] ans = new int[num];
		
		for(int i=0;i<num;i++) {
			n = Integer.parseInt(br.readLine()); //n*n크기의 체스판
			data = new int [n]; //n크기의 1차원 배열
			
			queen(0); //depth 0을 넣어줌
			ans[i]=cnt;
			cnt=0;
		}	
		
		for(int i=0;i<num;i++) {
			System.out.println("#"+(i+1)+" "+ans[i]);
		}
	}
	
	public static void queen(int depth) {
		if(depth==n) {
			cnt++;
			return;
		}
		for(int i=0;i<n;i++) {
			data[depth]=i;
			if(check(depth)) {
				queen(depth+1);
			}
		}
	}
	
	public static boolean check(int depth) {
		for(int i=0;i<depth;i++) {
			if(data[depth]==data[i]) {
				return false;
			}
			else if(Math.abs(depth-i)==Math.abs(data[depth]-data[i])) {
				return false;
			}
		}
		return true;
	}
}
