package com.dev;

public class AccExample {

	public static void main(String[] args) {
		Account[] accounts;
		
		accounts = new Account[] { new Account("1-111","Hong")//
				, new Account("1-112", "Hwang")//
				, new Account("1-113", "Kim")
		};
		
		System.out.println(Account.bankName);
		Account.showBankName();		
		Calcurater.sum(10,20);
//		Calcurater c1 = new Calcurater();
//		c1.sum(10, 20);
		
	}
}
