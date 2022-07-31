import java.util.*;
public class One {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int n = sc.nextInt(); //개수
		int m  = sc.nextInt(); //총합
		
		for(int i=0;i<n;i++) {
			int num = sc.nextInt(); //n개의 배열 값
			list.add(num);
		}
		
		int sum=0; //합
		int cnt=0; //카운트
		
		for(int i=0;i<n;i++) {
			if(list.get(i)==m) {
				cnt++; //배열 값 중 그 자체로 총합인 것 카운트
			}
		}
		
		for(int i=0;i<n;i++) {
			sum = list.get(i);
			for(int j=i+1;j<n;j++) {
				sum += list.get(j);
				
				if(sum==m) {
					cnt++;
				}
				
			}
		}
		System.out.print(cnt);
		
	}
}
