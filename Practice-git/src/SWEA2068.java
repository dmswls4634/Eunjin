import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SWEA2068 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());//¹Ýº¹È½¼ö
		
		for(int i=0;i<num;i++) {
			String [] data = br.readLine().split(" ");
			int [] change = new int [10];
			
			for(int a=0;a<10;a++) {
				change[a]=Integer.parseInt(data[a]);
			}
			
			Arrays.sort(change);
			
			System.out.println("#"+(i+1)+" "+change[9]);
		}

	}

}
