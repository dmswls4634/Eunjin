import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA1989 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int n = Integer.parseInt(br.readLine());
		int [] ans = new int[n];
		
		for(int i=0;i<n;i++) {
			String data = br.readLine();
			if(check(data)) {
				ans[i]=1;
			}
			else {
				ans[i]=0;
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("#"+(i+1)+" "+ans[i]);
		}
	}
	
	public static boolean check(String data) {
		String [] rev = new String [data.length()];
		String [] ino = data.split("");
		int cnt=0;
		
		for(int i=0;i<data.length();i++) {
			rev[i]=ino[data.length()-1-i];
		}
		
		for(int i=0;i<data.length();i++) {
			if(rev[i].equals(ino[i])) {
				cnt++;
			}
		}

		if(cnt==data.length()) {
			return true;
		}
		else {
			return false;
		}
	}
}
