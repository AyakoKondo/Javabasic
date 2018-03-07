package practice07;
/*
 * PTra07_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_06 {
	public static void main(String[] args) {

		// ★ ※2次元配列を用いています
		int[][] array = {
				{500,40,6},
				{70,8,90,1000}
		};
		//総計
			int sumAll = 0;
			
			for(int j = 0; j < array.length;j++) {
				int sum = 0;
				for(int i = 0; i < array[j].length;i++) {
					sum += array[j][i];
				}
			sumAll += sum;
			}
			System.out.println(sumAll/array.length);// ★ 配列arrayに格納されている全ての数字の平均を出力してください
	}
}



/*for(int[]score:array) {
	int sum = 0;
	for(int i:score) {
		sum += i;
	}
		*/