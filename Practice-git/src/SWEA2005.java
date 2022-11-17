import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA2005 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());//¹Ýº¹È½¼ö
		int [] ans = new int[num];
		
		for(int i=0;i<num;i++) {
			int p = Integer.parseInt(br.readLine());
			int [][] pascal = new int [p][p];
			
			for(int a=0;a<p;a++) {
                for(int b=0;b<=a;b++) {
                    if(a==b) {
                        pascal[a][b] = 1;
                    }
                    else if(b==0) {
                        pascal[a][b] = 1;
                    }
                    else {
                        pascal[a][b] = pascal[a-1][b-1] + pascal[a-1][b];
                    }
                }
            }
  
            System.out.println("#"+(i+1));
            for(int a=0;a<p;a++) {
                for(int b=0;b<=a;b++) {
                    System.out.print(pascal[a][b] + " ");
                }
                System.out.println();
            }
		}
	}
}
