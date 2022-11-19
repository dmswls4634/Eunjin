import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA1948 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());//반복횟수
		
		for(int i=0;i<num;i++) {
			String [] input=br.readLine().split(" ");
			int f_m = Integer.parseInt(input[0]);
			int f_d = Integer.parseInt(input[1]);
			int s_m = Integer.parseInt(input[2]);
			int s_d = Integer.parseInt(input[3]);
			int dday=0;
			
			if(f_m==s_m) {
				dday = s_d-f_d+1;
			}
			else {
				int [] arr = new int[s_m-f_m];
				for(int a=0;a<arr.length;a++) {
					arr[a] = a+f_m;
				}
				
				for(int a=0;a<arr.length;a++) {
					if(arr[a]==2) {
						dday+=28;
					}
					else {
						if(arr[a]<8) { //2월 제외 8월보다 작은 달
							if(arr[a]%2==0) { //그 중 짝수 달
								dday+=30;
							}
							else { //그 중 홀수 달
								dday+=31;
							}
						}
						else { //8월 이상 달
							if(arr[a]%2==0) { //그 중 짝수 달
								dday+=31;
							}
							else { //그 중 홀수 달
								dday+=30;
							}
						}			
					}
				}
				dday = dday+s_d-f_d+1;
			}
			System.out.println("#"+(i+1)+" "+dday);
		}
	}

}
