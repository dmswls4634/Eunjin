import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SWEA1860 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());//�ݺ�Ƚ��
		
		for(int i=0;i<num;i++) {
			String [] make = br.readLine().split(" ");
			String [] temp = br.readLine().split(" ");
			int [] arrive = new int[temp.length];
			
			for(int a=0;a<temp.length;a++) {
				arrive[a] = Integer.parseInt(temp[a]);
			}
			
			Arrays.sort(arrive); //�մ� ���� �ð� �������
			int sec = Integer.parseInt(make[1]); //�ʴ�
			int fish = Integer.parseInt(make[2]); //���
			
			System.out.print("#"+(i+1)+" ");
			
			int time=0; //�ð��� �󸶳� �귶����
			int total=0; //�� ���� ����
			int cnt=0; //���° �մ�
			int people=0; //�ؾ�� ������ ���� �մ� ��

			while(people<arrive.length) {
				if(time!=0&&time%sec==0) { // total�� sec�� �� fish������ ����
					total+=fish;
				}
				if(time>=arrive[cnt]) {
					if(total<=0) {
						System.out.println("Impossible");
						break;
					}
					else {
						people++;
						total--;
						cnt++;
					}
				}
				time++;
			}
			
			if(people==arrive.length) {
				System.out.println("Possible");
			}
			
		}
	}
}
