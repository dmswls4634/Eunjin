import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SWEA1860 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());//¹Ýº¹È½¼ö
		
		for(int i=0;i<num;i++) {
			String [] make = br.readLine().split(" ");
			String [] temp = br.readLine().split(" ");
			int [] arrive = new int[temp.length];
			
			for(int a=0;a<temp.length;a++) {
				arrive[a] = Integer.parseInt(temp[a]);
			}
			
			Arrays.sort(arrive); //¼Õ´Ô µµÂø ½Ã°£ ¼ø¼­´ë·Î
			int sec = Integer.parseInt(make[1]); //ÃÊ´ç
			int fish = Integer.parseInt(make[2]); //¸î¸¶¸®
			
			System.out.print("#"+(i+1)+" ");
			
			int time=0; //½Ã°£ÀÌ ¾ó¸¶³ª Èê·¶´ÂÁö
			int total=0; //ÃÑ ¸¸µç °³¼ö
			int cnt=0; //¸î¹øÂ° ¼Õ´Ô
			int people=0; //ºØ¾î»§À» ¸À³ª°Ô ¸ÔÀº ¼Õ´Ô ¼ö

			while(people<arrive.length) {
				if(time!=0&&time%sec==0) { // totalÀÌ secÃÊ ´ç fish¸¶¸®¾¿ Áõ°¡
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
