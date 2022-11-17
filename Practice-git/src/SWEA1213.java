import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA1213 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<10;i++) {
			String idx = br.readLine();
			String str = br.readLine();
			String data = br.readLine();
			int cnt=0;
			int length = data.length();

			data = data.replace(str,"");
			
			cnt=(length-data.length())/str.length();
			
			System.out.println("#"+(i+1)+" "+cnt);
		}
	}
}
