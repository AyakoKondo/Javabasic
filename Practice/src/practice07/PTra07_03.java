package practice07;
/*
 * PTra07_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_03 {
	public static void main(String[] args) {

		char[] keyword = {'平', '島', '沼', '山', '森'};// ★ char型の配列keywordを定義し 「'平', '島', '沼', '山', '森'」 で初期化してください
		
		for(int i = keyword.length-1;0<=i;i--) {
			System.out.println(keyword[i]);// ★ 配列keywordに格納されている値を後ろから順番に全て表示してください
		}
	}
}
