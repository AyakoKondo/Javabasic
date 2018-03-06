package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 */
		
		for(int i = 0;i < 5; i++) {
			for(int j = 0;j < i;j++) {
				System.out.print("■");
			}
			
			for(int j = 5;j > i;j--) {
				System.out.print("□");
			}
				
			System.out.println();
		}
		

		/*for(int i = 0;i < 5; i++) {
			for(int j = 0;j < 5;j++) {
				System.out.print("□");
					if(i == 1 || j == 0 ) {
						System.out.print("■");
					}if(i == 2 || j == 0 && i == 2 || j == 1) {
						System.out.print("■");
					}if(i == 3 || j == 0 && i == 3 || j == 1 && i == 3 || j == 2) {
						System.out.print("■");
					}if(i == 4 || j == 0 && i == 4 || j == 1 && i == 4 || j == 2 && i == 4 || j == 3) {
						System.out.println("■");
					}*/
		/*for(int i = 0;i < 5; i++) {
			for(int j = 0;j < 5;j++) {
				if(i)
				System.out.print("□");
				}
			System.out.println();*/
//		for(int i = 0;i < 5; i++) {
//			for(int j = 0;j < 5;j++) {
//					if(i == 1 || j == 0 ) {
//						System.out.print("■");
//					}if(i == 2 || j == 0 && i == 2 || j == 1) {
//						System.out.print("■");
//					}if(i == 3 || j == 0 && i == 3 || j == 1 && i == 3 || j == 2) {
//						System.out.print("■");
//					}if(i == 4 || j == 0 && i == 4 || j == 1 && i == 4 || j == 2 && i == 4 || j == 3) {
//						System.out.println("■");
//		}
	}
}