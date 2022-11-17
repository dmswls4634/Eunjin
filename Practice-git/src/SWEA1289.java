import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SWEA1289 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());//반복횟수
		
		for(int i=0;i<num;i++) {
			String [] data = br.readLine().split("");
			int [] old = new int[data.length];//입력받는 값
			
			Stack<Integer> s1 = new Stack<>();
			Stack<Integer> s2 = new Stack<>();
			for(int a=0;a<data.length;a++) {
				old[a] = Integer.parseInt(data[a]);
			}
			
			for(int a=old.length-1;a>=0;a--) {
				s1.push(old[a]);
			}
			
			s2.push(0);
			int cnt=0;
			while(!s1.empty()) {
				if(s1.peek()!=s2.peek()) {
					cnt++;
					s2.push(s1.peek());
					s1.pop();
				}
				else {
					s2.push(s1.peek());
					s1.pop();
				}
			}
			
			System.out.println("#"+(i+1)+" "+cnt);
		}
	}
}
