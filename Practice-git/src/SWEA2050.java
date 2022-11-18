import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA2050 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n= br.readLine();
		
		for(int a=0;a<n.length();a++) {
			System.out.print((int)n.charAt(a)-64+" ");
		}
	}
}
