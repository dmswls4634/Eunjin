import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA1936 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[]input = br.readLine().split(" ");
		
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		
		
		if(A==1&&B==3||A==2&&B==1||A==3&&B==2) {
			System.out.print("A");
		}
		
		else {
			System.out.print("B");
		}
		
		

	}

}
