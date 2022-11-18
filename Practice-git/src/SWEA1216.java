import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA1216 {
	static int max,cnt;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i=0;i<10;i++) {
			int idx = Integer.parseInt(br.readLine());
			String [] data = new String[100];
			
			for(int a=0;a<100;a++) {
				data[a]=br.readLine();
			}
			
			int m=0;
			boolean p;
			//System.out.println("가로");
			for(int a=0;a<100;a++) {//가로
				int c=100;
				p=true;
				while(p) { // 회문이 true가 나올때까지 c길이마다 전체 검사
					for(int b=0; b<=100-c && c>=1; b++) { 
						//System.out.println(data[a].substring(b, b+c));
						if(check(data[a].substring(b, b+c))) {
							if(c>m) {
								m=c;
							}
							p=false;
							break;
						}
					}
					c--;
				}
			}
			
			String[]vertical=new String[100];
			for(int a=0;a<100;a++) {
				String [] temp = new String[100];
				for(int b=0;b<100;b++) {
					temp[b]=data[b].substring(a, a+1);
				}
				
				String temp2 = String.join("",temp);
				vertical[a]=temp2;
			}
			
			
			//System.out.println("세로");
			
			for(int a=0;a<100;a++) {//세로
				int c=100;
				p=true;
				while(p) { // 회문이 true가 나올때까지 c길이마다 전체 검사
					for(int b=0; b<=100-c && c>=1; b++) { 
						//System.out.println(vertical[a].substring(b, b+c));
						if(check(vertical[a].substring(b, b+c))) {
							if(c>m) {
								m=c;
							}
							p=false;
							break;
						}
					}
					c--;
				}
			}
			
			System.out.println("#"+(i+1)+" "+m);
			
		}

	}
	
	public static boolean check(String input) {
		int count=0;
		String [] str2 = input.split("");
		String [] str = new String[str2.length];
		
		for(int i=0;i<input.length();i++) {
			str[i] = str2[str2.length-1-i];
		}
		
		for(int i=0;i<str2.length;i++) {
			if(str[i].equals(str2[i])) {
				count++;
			}
		}
		
		if(count==str2.length) {
			return true;
		}
		else {
			return false;
		}
	}
}
