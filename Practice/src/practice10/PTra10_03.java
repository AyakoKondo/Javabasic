package practice10;
/*
 * PTra10_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_03 {

	/*
	 * PTra10_01で作成したUserクラスを使用します
	 */

	public static void main(String[] args) {

		// Userクラスを作成後に着手してください
		User us;// ★ User型の変数usを宣言してください


		User us1 = new User();// ★ 変数usに、Userクラスのインスタンスを作成・代入してください


		System.out.println("ユーザID（数字）、 ユーザ名、メールアドレス、パスワードをカンマ区切りで入力してください");

		java.util.Scanner scanner = new java.util.Scanner(System.in);
		// ★ java.util.Scannerクラスをインスタンス化し、変数scannerに代入してください
		
		
		// ※ コマンドプロンプトで入力された値が、数字ではなかった場合はプログラムがエラーになります

		// ★ 入力された値を、String型の変数lineに格納してください
		String line = scanner.nextLine();

		// ★ 変数lineに格納されている値を','で区切り、配列にしてください（Stringクラスのメソッドを使用します）
		String[] list = line.split(",",0);


		us1.userId = Integer.parseInt(list[0]);
		us1.userNm = list[1];
		us1.mail   = list[2];
		us1.password = list[3];
		
		// ★ 配列にした値を、usの各フィールドに代入してください
		// ユーザIDに該当する値が数値でなかった場合は、エラーでプログラムが止まっても良いです
		


		System.out.println(us1.userId);
		System.out.println(us1.userNm);
		System.out.println(us1.mail);
		System.out.println(us1.password);// ★ 変数usに格納されているインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください

	}
}
