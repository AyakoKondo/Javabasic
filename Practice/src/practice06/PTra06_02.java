package practice06;
/*
 * PTra06_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_02 {
	public static void main(String[] args) {

		// ★ 20回繰り返しを行うfor文を記述してください
		for(int i = 1; i <= 20 ; i++) {//-----for start

			System.out.print("今"+i+"回目");// ★ 今何回目の処理なのかを出力してください


			if(i%2 == 0) {
				System.out.println("");
			}else{// ★ 奇数回のときには、「奇数」を出力してください
				System.out.println("奇数");
			}

		}

		//-----for end
	}
}
