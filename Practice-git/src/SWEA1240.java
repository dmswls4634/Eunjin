import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class SWEA1240 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());//¹Ýº¹È½¼ö
		
		for(int i=0;i<num;i++) {
			String [] arr = {"0001101","0011001","0010011","0111101","0100011","0110001","0101111","0111011","0110111","0001011"};
			
			String [] NM = br.readLine().split(" ");
			int N = Integer.parseInt(NM[0]);
			int M = Integer.parseInt(NM[1]);
			String[][]data = new String[N][M];
			for(int a=0;a<N;a++) {
				data[a]=br.readLine().split("");
			}
			
			boolean check=true;
			Stack<String>s=new Stack<>();
			int a=0;
			int start=0;
			while(check) {
				for(int b=M-1;b>=0;b--) {
					if(Integer.parseInt(data[a][b])==1) {
						start=b;
						check=false;
						break;
					}
				}
				a++;
			}
			
			for(int c=start;c>=start-55;c--) {
				s.push(data[a][c]);
			}
			
			int [] code = new int [8];
			for(int c=0;c<8;c++) {
				String[]temp=new String[7];
				for(int b=0;b<7;b++) {
					temp[b]=s.pop();
				}
				String str = String.join("", temp);
				for(int b=0;b<10;b++) {
					if(str.equals(arr[b])) {
						code[c]=b;
					}
				}
				
			}
			
			int sum=0;
			int sum2=0;
			for(int b=0;b<8;b++) {
				if(b%2==0) {
					sum+=code[b];
				}
				else {
					sum2+=code[b];
				}
			}
			
			System.out.print("#"+(i+1)+" ");
			if((sum*3+sum2)%10==0) {
				System.out.println(sum+sum2);
			}
			else {
				System.out.println(0);
			}
			
			
		}

	}

}
