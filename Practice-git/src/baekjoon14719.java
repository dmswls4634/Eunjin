import java.io.*;
import java.util.*;
import java.math.*;

public class baekjoon14719 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int [] hw = new int[2]; //세로 가로 배열
		StringTokenizer st = new StringTokenizer(br.readLine()," "); //세로 가로
		for(int i=0;i<2;i++) {
			hw[i] = Integer.parseInt(st.nextToken()); 
		}
		
		int [] input = new int[hw[1]]; // 블록 길이 배열
		st = new StringTokenizer(br.readLine()," "); // 블록 길이
		for(int i=0;i<hw[1];i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		
		int ans=0;
		int baseidx = 0;
		int base=input[0];
		
		for(int i=1;i<hw[1]-1;i++) {
			int lmax=input[i];
			int rmax=input[i];
			for(int j=i-1;j>=0;j--) { //현재 블록 기준 왼쪽 가장 큰 블록 찾기
				lmax=Math.max(input[j], lmax);
			}
			
			for(int j=i+1;j<hw[1];j++) { //현재 블록 기준 오른쪽 가장 큰 블록 찾기
				rmax=Math.max(input[j], rmax);
			}
			
			ans+=Math.min(lmax, rmax)-input[i]; //왼쪽과 오른쪽 중 작은 블록에서 현재 블록 빼기
		}
		System.out.println(ans);
	}		
}		
