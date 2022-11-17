import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SWEA15612 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());//반복횟수
		
		for(int i=0;i<num;i++) {
			String[][]input = new String[8][8];
			String[]check = new String[8];
			for(int a=0;a<8;a++) {
				input[a] = br.readLine().split("");//입력
			}
			System.out.print("#"+(i+1)+" ");
			
			for(int a=0;a<8;a++) {
				int cnt=0;
				for(int b=0;b<8;b++) {
					if(input[a][b].contains("O")) { //가로 검사
						cnt++;
					}
				}
				if(cnt>1||cnt<1) {
					check[a]="u";
				}
				else if(cnt==1) {
					check[a]="p";
				}
			}
			
			if(Arrays.asList(check).contains("u")) { //가로에 O가 2개 이상이거나 0개 인것
				System.out.println("no");
			}
			else { //가로가 모두 올바른 것 중에
				String[]check2 = new String[8];
				for(int a=0;a<8;a++) {
					int cnt=0;
					for(int b=0;b<8;b++) {
						if(input[b][a].contains("O")) { //세로
							cnt++;
						}
					}
					if(cnt>1||cnt<1) {
						check2[a]="u";
					}
					else if(cnt==1) {
						check2[a]="p";
					}
				}
				if(Arrays.asList(check2).contains("u")) {
					System.out.println("no");
				}
				else {
					System.out.println("yes");
				}
			}			
		}
	}
}
