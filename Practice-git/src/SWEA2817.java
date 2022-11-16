import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SWEA2817 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());//¹Ýº¹È½¼ö
		int [] ans = new int[num];
		
		for(int i=0;i<num;i++) {
			String [] NK = br.readLine().split(" ");
			int N = Integer.parseInt(NK[0]);
			int K = Integer.parseInt(NK[1]);
			String [] arr = br.readLine().split(" ");
			int cnt=0;
			int sum=0;
			int [] temp = new int [N];
			ArrayList <Integer> al = new ArrayList<>();
			
			for(int a=0;a<N;a++) {
				sum=Integer.parseInt(arr[a]);
				if(sum==K) {
					cnt++;
					continue;
				}
				al.clear();
				for(int b=a+1;b<N;b++) {
					if(sum+Integer.parseInt(arr[b])==K) {
						cnt++;
					}
					else if(sum+Integer.parseInt(arr[b])<K){
						int sz = al.size();
						for(int c=0;c<sz;c++) {
							if(al.get(c)+Integer.parseInt(arr[b])==K) {
								cnt++;
							}
							else if(al.get(c)+Integer.parseInt(arr[b])<K) {
								al.add(al.get(c)+Integer.parseInt(arr[b]));
							}
						}
						al.add(sum+Integer.parseInt(arr[b]));
					}
				}
			}		
			ans[i]=cnt;			
		}
		
		for(int i=0;i<num;i++) {
			System.out.println("#"+(i+1)+" "+ans[i]);
		}
	}
	
	/*public static int count() {
		
	}*/
}
