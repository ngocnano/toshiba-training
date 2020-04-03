
public class Bank {
	
	private int bankID;
	private String nameBank;
	private String location;
	
	public Bank addBank(int bankID, String nameBank, String location) {
		
		this.bankID   = bankID;
		this.nameBank = nameBank;
		this.location = location;
		
		return this;
	}
	
	public void editBank(int bankID, String nameBank, String location) {
		this.bankID   = bankID;
		this.nameBank = nameBank;
		this.location = location;
	}

}
