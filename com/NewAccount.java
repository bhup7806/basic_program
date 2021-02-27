package rays.com;

public class NewAccount {
	private String AccountNumber = null;
	private String Accunttype = null;
	private double Balance = 0;

	private String getNumber() {
		return getNumber();

	}

	public String getAccountnumber() {
		return AccountNumber;
	}

	public void setAccountnumber(String accountnumber) {
		AccountNumber = accountnumber;
	}

	public String getAccunttype() {
		return Accunttype;
	}

	public void setAccunttype(String accunttype) {
		Accunttype = accunttype;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public void depositfund(double amount) {
		if (amount < 0) {
			this.Balance = +amount;
			System.out.println("after diposit balance is");
		}

	}

	public void withdrawl(double amount) {
		if (amount < 0) {
			this.Balance -= amount;
			System.out.println("after withdrawl balance is");
		}
	}

	public void fundtransfer(double amount) {
		if (amount < 0) {
			this.Balance -= amount;
			System.out.println("after fundtransfer is");

		}
	}

	public void paybill(double amount) {
		if (amount < 0)
			;
		this.Balance -= amount;
		System.out.println("after pay bill is");
	}

	public NewAccount(double amount, double c) {

	}
}