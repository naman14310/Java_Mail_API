package com.java.mail;

import java.util.ArrayList;
import java.util.Scanner;
import com.java.mail.Send;

public class Compose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String from = "namanjain14310@gmail.com";
		final String password = "";
		final String sub = "hello !";
		final String msg = "This message is sent by java program !";
		int num;

		Scanner sc = new Scanner(System.in);

		Send send = new Send();

		ArrayList<String> list = new ArrayList<String>();

		System.out.print("how many person , you want to send this mail ?  :  ");
		num = sc.nextInt();

		System.out.println("enter email id");
		for (int i = 0; i < num; i++) {
			list.add(sc.next());
		}

		for (String to : list) {
			send.mail(from, password, to, sub, msg);

		}

	}

}
