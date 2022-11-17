import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class SWEA1225 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<10;i++) {
			int idx = Integer.parseInt(br.readLine());
			String [] data = br.readLine().split(" ");
			Queue<Integer> q = new LinkedList<>();
			
			for(int a=0;a<8;a++) {
				q.add(Integer.parseInt(data[a]));
			}
			
			int a=1;
			while(true) {
				int temp = q.peek()-a;
				if(temp<=0) {
					q.remove();
					q.add(0);
					break;
				}
				q.remove();
				q.add(temp);
				a++;
				if(a==6) {
					a=1;
				}
				
			}
			
			
			System.out.print("#"+idx+" ");
			for(int b=0;b<8;b++) {
				System.out.print(q.poll()+" ");
			}
			System.out.println();
			
		}

	}

}
