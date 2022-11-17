import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA2046 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++) {
			System.out.print("#");
		}

	}

}
