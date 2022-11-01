import java.util.*;

public class baekjoon2960 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int [] arr = new int[n-1];
		int cnt=0;
		
		for(int i=0;i<n-1;i++) {
			arr[i] = i+2;
		}
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]%(i+2)==0) {
					cnt++;
					if(cnt==k) {
						System.out.print(arr[j]);
					}
					arr[j]=1;
				}
			}
			
		}
	}
}
