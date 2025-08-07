package workshop.account.control;

import workshop.account.entity.Account;

public class AccountTest {

	public static void main(String[] args) {
		//1. Account ��ü���� - �⺻������ ȣ��
		Account account = new Account();
		
		//1-1. setter �޼��� ȣ��� ���� ����
		//������ȣ : "A1100", ���¹�ȣ : "221-22-3477", �ܾ� : 100
		account.setCustId("A1100");
		account.setAcctId("221-22-3477");
		account.deposit(1000);
		
		//1-2. getter �޼��� ȣ��� ���� Ȯ��
		System.out.println("고객번호 = " + account.getCustId());
		System.out.println("계좌번호 = " + account.getAcctId());
		System.out.println("잔액 = "    + account.getBalance());
		
		//2.Account ��ü���� - �����ε��� ������ ȣ��
		Account account2 = new Account("B1200", "331-22-3477", 2000);
		System.out.println("고객번호 = " + account2.getCustId());
		System.out.println("계좌번호 = " + account2.getAcctId());
		System.out.println("잔액 = "    + account2.getBalance());
		
		System.out.println("10000원 입금");
		account2.deposit(10000);
		System.out.println("잔액 = "    + account2.getBalance());
		
		try{
			System.out.println("10000원 출금");		
			account2.withdraw(10000);
			System.out.println("잔액 = "    + account2.getBalance());
		
			System.out.println("5000원 출금");
			account2.withdraw(5000);
			System.out.println("잔액 = "  + account2.getBalance());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}