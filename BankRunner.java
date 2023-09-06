class BankRunner{
	
	public static void main(String args[]){
		
		Bank bank=new Bank();
		bank.setBankId(1);
		bank.setBankName("Canara");
		bank.setBankLocation("sagar");
		bank.setBankIFSCCode("CNBR00012");
		bank.setBankManager("Chandan");
		bank.setNoOfStatf(9);
		bank.setContactNumber(9088995832L);
		
		System.out.println("Bank ID :"+bank.getBankId());
		System.out.println("Bank Name :"+bank. getBankName());
		System.out.println("Location  :"+bank. getBankLocation());
		System.out.println("IFSC CODE :"+ bank.getBankIFSCCode());
		System.out.println("Manager Name:"+bank.getBankManager());
		System.out.println("Number of Statf  :"+bank. getNoOfStatf());
		System.out.println("Contact Number :"+ bank.getContactNumber());
		
	}
}