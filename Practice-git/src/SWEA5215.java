import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SWEA5215 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());// 반복횟수

		for (int i = 0; i < num; i++) {
			String[] input = br.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int L = Integer.parseInt(input[1]);
			String[] score = new String[N];
			String[] cal = new String[N];

			for (int a = 0; a < N; a++) {
				String[] data = br.readLine().split(" ");
				score[a] = data[0];
				cal[a] = data[1];
			}

			int max = 0;
			for (int a = 0; a < N; a++) {
				//max = 0;
				int sum_c = Integer.parseInt(cal[a]); // a의 칼로리
				int sum_s = Integer.parseInt(score[a]); // a의 점수

				ArrayList<Integer> temp = new ArrayList<>();
				ArrayList<Integer> sum = new ArrayList<>();

				for (int b = a + 1; b < N; b++) { // a다음거부터 탐색

					if (sum_c + Integer.parseInt(cal[b]) <= L) {

						if (!temp.isEmpty()) { // temp안에 거랑 더해도 작으면 temp에 추가
							int length = temp.size();
							for (int c = 0; c < length; c++) {
								if (temp.get(c) + Integer.parseInt(cal[b]) <= L) {
									temp.add(temp.get(c) + Integer.parseInt(cal[b]));
									sum.add(sum.get(c) + Integer.parseInt(score[b]));
									if(sum.get(c) + Integer.parseInt(score[b])>max) {
										max=sum.get(c) + Integer.parseInt(score[b]);
									}
								}
							}
						}
						temp.add(sum_c + Integer.parseInt(cal[b])); // arr[a]랑 더해서 작으면 temp에 추가
						sum.add(sum_s + Integer.parseInt(score[b]));
						if(sum_s + Integer.parseInt(score[b])>max) {
							max=sum_s + Integer.parseInt(score[b]);
						}
					}

				}

			}

			System.out.println("#" + (i + 1) + " " + max);
		}

	}

}
