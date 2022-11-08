import java.util.*;
import java.io.*;

public class SWEA1974 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String [][] arr = new String[9][9];
		int [] ans = new int[num];
		
		
		for(int i=0;i<num;i++) {
			String n= "123456789";//대조용	
			//확인용
			String [] value = new String[9];//모든 정사각형이 올바른지
					
			int True=0;
			
			for(int k=0;k<9;k++) {
				arr[k] = br.readLine().split(" "); //9*9배열
			}
			
			int bb=0;			
			//정사각형
			for(int a=0;a<=6;a=a+3) {//전체 정사각형 for문		
				for(int b=0;b<=6;b=b+3) {
					String [] check= {"f","f","f","f","f","f","f","f","f"};
					int cnt=0;
					for(int c=0;c<3;c++) {//작은 정사각형 for문
						for(int d=0;d<3;d++) {
							if(n.contains(arr[a+c][b+d])) {
								int idx=n.indexOf(arr[a+c][b+d]);
								if(check[idx].equals("f")) {
									check[idx]="t";
								}
								else if(check[idx].equals("t")) {
									check[idx]="f";
								}
								
							}
						}
					}
					
					for(int c=0;c<check.length;c++) {
						if(check[c].equals("t")) {
							cnt++;
						}
					}
					if(cnt==9) {
						bb++;
					}
				}
			}
			if(bb==9) {
				True++;
			}
			
			
			
			
			//가로 9칸
			bb=0;
			for(int a=0;a<9;a++) {
				int cnt=0;
				String [] check= {"f","f","f","f","f","f","f","f","f"};
				for(int b=0;b<9;b++) {		
					if(n.contains(arr[a][b])) {
						int idx=n.indexOf(arr[a][b]);
						if(check[idx].equals("f")) {
							check[idx]="t";
						}
						else if(check[idx].equals("t")) {
							check[idx]="f";
						}
						
					}
				}
				for(int c=0;c<check.length;c++) {
					if(check[c].equals("t")) {
						cnt++;
					}
				}
				if(cnt==9) {
					bb++;
				}
			}
			if(bb==9) {
				True++;
			}
			
			
			//세로 9칸
			bb=0;
			for(int a=0;a<9;a++) {
				String [] check= {"f","f","f","f","f","f","f","f","f"};
				int cnt=0;
				for(int b=0;b<9;b++) {	
					if(n.contains(arr[b][a])) {
						int idx=n.indexOf(arr[b][a]);
						if(check[idx].equals("f")) {
							check[idx]="t";
						}
						else if(check[idx].equals("t")) {
							check[idx]="f";
						}
					}
				}
				for(int c=0;c<check.length;c++) {
					if(check[c].equals("t")) {
						cnt++;
					}
				}
				if(cnt==9) {
					bb++;
				}
			}
			if(bb==9) {
				True++;
			}
			
			if(True==3) {
				ans[i]=1;
			}
			else if(True!=3) {
				ans[i]=0;
			}
		}
		for(int i=0;i<num;i++) {
			System.out.println("#"+(i+1)+" "+ans[i]);
		}
	}

}
