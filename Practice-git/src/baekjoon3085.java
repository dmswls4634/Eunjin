import java.io.*;
import java.util.*;
public class baekjoon3085 {
	static int N;
	static String[][]board;
	static int max=0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		board = new String[N][N];
		
		for(int i=0;i<N;i++) {
			board[i]=br.readLine().split("");
		}
		
		check(board);
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N-1;j++) {
				if(!board[i][j].equals(board[i][j+1])) {
					String temp = board[i][j]; //교환
					board[i][j] = board[i][j+1];
					board[i][j+1] = temp;
					check(board); //확인
					temp = board[i][j]; //교환
					board[i][j] = board[i][j+1];
					board[i][j+1] = temp;
				}
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N-1;j++) {
				if(!board[j][i].equals(board[j+1][i])) {
					String temp = board[j][i]; //교환
					board[j][i] = board[j+1][i];
					board[j+1][i] = temp;
					check(board);
					temp = board[j][i]; //교환
					board[j][i] = board[j+1][i];
					board[j+1][i] = temp;
				}
			}
		}	
		
		System.out.println(max);
	}
	
	public static void check(String[][]input) {
		for(int i=0;i<N;i++) {
			int cnt=1;
			for(int j=0;j<N-1;j++) {
				if(input[i][j].equals(input[i][j+1])) {
					cnt++;
				}
				else {
					max=Math.max(max, cnt);
					cnt=1;
				}
			}
			max=Math.max(max, cnt);
		}
		
		for(int i=0;i<N;i++) {
			int cnt=1;
			for(int j=0;j<N-1;j++) {
				if(input[j][i].equals(input[j+1][i])) {
					cnt++;
				}
				else {
					max=Math.max(max, cnt);
					cnt=1;
				}
			}
			max=Math.max(max, cnt);
		}	
	}
}
