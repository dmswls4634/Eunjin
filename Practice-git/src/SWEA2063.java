import java.util.*;
import java.io.*;

public class SWEA2063 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String [] score = br.readLine().split(" ");
		Arrays.sort(score);
		int m = score.length/2;

		System.out.println(score[m]);
	}
}