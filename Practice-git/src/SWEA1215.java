import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SWEA1215 {
	public static int n;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int [] ans = new int[10];
		for(int i=0;i<10;i++) {
			int count=0;
			n = Integer.parseInt(br.readLine());
			String [] data = new String [8];
			
			for(int j=0;j<8;j++) {
				data[j] = br.readLine();
			}
			
			for(int a=0;a<8;a++) { //가로
				for(int b=0;b<=8-n;b++) {
					if(check(data[a].substring(b, b+n))) {
						count++;
					}					
				}
			}
			ans[i]=count;
			
			String [] array = new String[8]; 
			for(int a=0;a<8;a++) {
				String [] input = new String [8];
				for(int b=0;b<8;b++) {
					input[b]=data[b].substring(a,a+1);
				}
				String arr = String.join("",input);
				array[a] = arr;	
			}
			
			count=0;
			for(int c=0;c<8;c++) { //세로
				for(int d=0;d<=8-n;d++) {
					if(check(array[c].substring(d, d+n))) {
						count++;
					}					
				}
			}
			ans[i]+=count;
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("#"+(i+1)+" "+ans[i]);
		}
	}
	
	public static boolean check(String data) {
		String [] rev = new String [n];
		String [] ino = data.split("");
		int cnt=0;
		
		for(int i=0;i<n;i++) {
			rev[i]=ino[n-1-i];
		}
		
		for(int i=0;i<n;i++) {
			if(rev[i].equals(ino[i])) {
				cnt++;
			}
		}
		
		if(cnt==n) {
			return true;
		}
		else {
			return false;
		}
	}
}
