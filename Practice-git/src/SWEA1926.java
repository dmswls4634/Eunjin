import java.util.*;
import java.io.*;

public class SWEA1926 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String [] arr = new String [num];
		
		String syg = "3,6,9";

		
		
		for(int i=0;i<num;i++) {
			arr[i]=String.valueOf(i+1);
		}
		
		for(int i=0;i<num;i++) {

			if(Integer.parseInt(arr[i])<10) {//한 자리 수 
				if(Integer.parseInt(arr[i])%3==0) {
					arr[i]="-";
				}
				
			}
			else {// 한 자리 수가 아닌 것 중
				if(Integer.parseInt(arr[i])<100){//두 자리 수
					int cnt=0;
					if((Integer.parseInt(arr[i])/10)%3==0) {
						cnt++;
					}
					if(Integer.parseInt(arr[i])%10!=0&&(Integer.parseInt(arr[i])%10)%3==0) {
						cnt++;
					}
					if(cnt==1) {
						arr[i]="-";
					}
					else if(cnt==2){
						arr[i]="--";
					}
				}
				else {//세 자리 수
					if(Integer.parseInt(arr[i])<1000){
						int cnt=0;
						if((Integer.parseInt(arr[i])/100)%3==0) {//첫째자리
							cnt++;
						}
						if(Integer.parseInt(arr[i])/10%10!=0&&(Integer.parseInt(arr[i])/10%10)%3==0) {//둘째자리
							cnt++;
						}
						if(Integer.parseInt(arr[i])%10%10!=0&&(Integer.parseInt(arr[i])%10%10)%3==0) {//셋째자리
							cnt++;
						}
						if(cnt==1) {
							arr[i]="-";
						}
						else if(cnt==2) {
							arr[i]="--";
						}
						else if(cnt==3){
							arr[i]="---";
						}
					}
					
				}
			}
		}
		
		for(String i:arr) {
			System.out.print(i+" ");
		}
	}
}
