import java.util.*;
import java.io.*;

public class baekjoon1062 {
	static int N,K;
	static int max=0;
	static boolean visit[] = new boolean[26];
	static String [] input;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken()); //단어 개수
		K = Integer.parseInt(st.nextToken()); //가르쳐 줄 알파벳 개수
		input = new String[N];
		
		if(K<5) {
			System.out.println(0);
		}
		else if(K==26) {
			System.out.println(N);
		}
		else {
			for(int i=0;i<N;i++) {
				String temp=br.readLine();
				input[i]=temp.substring(4,temp.length()-4);
			}
			K-=5;
			visit['a'-97]=true;
			visit['n'-97]=true;
			visit['t'-97]=true;
			visit['i'-97]=true;
			visit['c'-97]=true;
			DFS(0,0);
			System.out.println(max);
		}
	}
	
	public static void DFS(int alpha, int len) {
		if(len == K) { //K-5만큼 체크했을 때
			int cnt = 0;
			for(int i=0;i<N;i++) { //단어 개수만큼
				boolean read = true;
				for(int j=0;j<input[i].length();j++) { //한 단어의 알파벳 하나씩 검사
					if(!visit[input[i].charAt(j)-97]) { //만약 false인 알파벳이 있다면
						read = false; //그 단어는 못 읽는 거 
						break; //중단
					}
				}
				if(read) {
					cnt++; //read가 true인 것은 읽을 수 있다는 거==카운트 +1
				}
			}
			max = Math.max(max, cnt); //최대 단어 개수 구하기
			return;
			
		}
		for(int i=alpha;i<26;i++) {
			if(visit[i] == false) { //방문하지 않은 알파벳이라면
				visit[i] = true; //true로 바꾸고
				DFS(i, len+1); //재귀 돌리기(조합)
				visit[i] = false; //다 돌고나면 다시 false로 바꿔주기
			}
		}
	}
}