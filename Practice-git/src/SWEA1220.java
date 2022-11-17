import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA1220 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<10;i++) {
			int num = Integer.parseInt(br.readLine());
			String[][]data = new String[100][100];
			
			for(int a=0;a<num;a++) {
				data[a]=br.readLine().split(" ");
			}
			
			
			int cnt=0;
			for(int a=0;a<100;a++) {
				String temp="X";
				for(int b=0;b<100;b++) {
					if(data[b][a].equals("1")) {
						temp="O";
					}
					else if(temp.equals("O")&&data[b][a].equals("2")) {
						cnt++;
						temp="X";
					}
				}
			}
			
			System.out.println("#"+(i+1)+" "+cnt);
			
		}

	}

}
