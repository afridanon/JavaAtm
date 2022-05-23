/*

=========================================================================================
|   --------------------------|      @AFRIDANON           |----------------------------  |
|   --------------------------|   github.com/afridanon    |----------------------------  |
|   --------------------------|  instagram/_richard_dany_ |----------------------------  |
|   --------------------------|  facebook/sk.afrid.564    |----------------------------  |
|   --------------------------|    twiter/@afridanon      |----------------------------  |
|   --------------------------|  Author :- Shaik Afrid    |----------------------------  |
|   --------------------------|      Mr Anonymous         |----------------------------  |
|   --------------------------|   JavaBank Atm Project    |----------------------------  |
|   --------------------------|  Java,OOPS,Logic,Doc      |----------------------------  |
==========================================================================================


*/


package atm; // main package 
import java.util.Scanner ;  //import Scanner class

//MainMenu
class MainMenu{
	Scanner input = new Scanner(System.in);
	int MainMenu(){
		System.out.println("1 - MINI STATEMENT                5 - FUNDS TRANSFER ");
		System.out.println("2 - BALANCE INQUIRY               6 - BILL PAYMENTS ");
		System.out.println("3 - QUICK CASH                    7 - CASH WITHDRAWAL ");
		System.out.println("4 - CHANGE PIN                    8 - CASH DEPOSIT ");
		System.out.print("Select Your Option :- ");
		int optionSelect = input.nextInt(); //Taking Int Input
		return optionSelect; //It Will Returns Selected Option
	}
}



// Main Class For ATMMAIN

public class atmmain{
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		boolean t = true;
		boolean f = false;
		PinCheck pincheck = new PinCheck(); //pincheck object created
		MainMenu mainmenu = new MainMenu(); //mainmenu object created
		CashDeposit cashdeposit = new CashDeposit(); //cashdeposit object created
		BalanceInquiry balanceinquiry = new BalanceInquiry(); //balanceinquiry object created
		QuickCash quickcash = new QuickCash(); //quickcash object created
		imp passwords = new imp(); //bankaccountinfo object created
		PinChange pinchange = new PinChange(); //pinchange object created
		writebankamount writebankamount = new writebankamount(); //writebankamount on txt file object created
		CashWithdraw cashwithdraw = new CashWithdraw(); //cashwithdraw object created
		CheckAccountNumber checkaccountnumber = new CheckAccountNumber(); //for checking account number object created
		MiniStatement ministatementwrite = new MiniStatement(); // ministatement object created
		MinistatementRead ministatementread = new MinistatementRead(); //ministstementread object created
		
		while(t) { //loop for continuous Run
			
			String HEADING = "-------------- WELCOME TO JavaBank ATM MACHINE --------------";
			System.out.println(HEADING);
			System.out.println("Select Your Language");
			System.out.println("1 == TELUGU");
			System.out.println("2 == English");
			System.out.print("Enter Your Option :- ");
			int langSelect = input.nextInt(); //taking int input from user 
			if(langSelect  == 1) {
				// telugu lang is not ready for use
				System.out.println("This Feauture Is NOT Availabele Now !");
			}
			else if(langSelect == 2) { //selected english lang
				if(pincheck.pinCheck() == 0) { // check pin 
					int mainmenuoption = mainmenu.MainMenu(); //print mainmenu
					switch(mainmenuoption) { //taking which option selected 
					case 1:
						ministatementread.Read(); //Gives ministatement output 
						
						break; //for exit the switch
					case 2:
						int balanceinbank = balanceinquiry.BalanceInquiry(); //Gives Balance In your bank
						System.out.println("Amount In Your Bank :-  " + balanceinbank);
						System.out.println("Thanks For Using JavaBank ATM");
						ministatementwrite.MiniStatementWrite("Balance Checked");
						break; //for exit
					case 3:
						switch(quickcash.QuickCash()) { //recive user selected quickcash option
						case 500:
							System.out.println("Take The Amount :- 500 ");
							writebankamount.Writebankamount(500); //subtracting 500 from bank balance 
							System.out.println("Thanks For Using JavaBank ATM");
							ministatementwrite.MiniStatementWrite(" Recived QuickCash 500 "); // write on file 
							break; //for exit 
							
						case 2000:
							System.out.println("Take The Amount :- 2000 ");
							writebankamount.Writebankamount(2000);
							System.out.println("Thanks For Using JavaBank ATM");
							ministatementwrite.MiniStatementWrite(" Recived QuickCash 2000 ");break;
							
						case 5000:
							System.out.println("Take The Amount :- 5000 ");
							writebankamount.Writebankamount(5000);
							System.out.println("Thanks For Using JavaBank ATM");
							ministatementwrite.MiniStatementWrite(" Recived QuickCash 5000 ");break;
						case 10000:
							
							System.out.println("Take The Amount :- 10000 ");
							writebankamount.Writebankamount(10000);
							System.out.println("Thanks For Using JavaBank ATM");
							ministatementwrite.MiniStatementWrite(" Recived QuickCash 10000 ");break;
						case 2:
							System.out.println("Selected Wrong Option !");break;
						case 1:
							System.out.println("Not sufficient Funds !");break;
							
						default:
							System.out.println("Error code :- 42");
						
						
						}
						
						break;
					case 4:
						if(pinchange.PinChange() == 0) {
							// Otp Checking process will done in background
							for(int i = 0;i <=1 ; i++) {
								System.out.print("Enter Your New Pin :- ");
								int newpin1 = input.nextInt();
								System.out.println();
								System.out.print("Re-Enter Your Pin :-  ");
								int newpin2 = input.nextInt();
								if(newpin1 == newpin2) {
									passwords.setMAINPIN(newpin1);
									System.out.println("Pin successfully Changed");
									System.out.println("Thanks For Using JavaBank ATM");
									ministatementwrite.MiniStatementWrite(" Atm Pin Changed Successfully ");
									i = 2;
								}
								else {
									System.out.println("Pins Does't Match ! Retry Again");
								}
							}
						}
						else {
							System.out.println("Old Password Is Wrong !");
						}
						break;
					case 5:
						System.out.print("Enter The Account Number :-  ");
						long AccountNumber = input.nextLong();
						if(checkaccountnumber.Check(AccountNumber) == 0) {
							System.out.print("Enter The Amount :-");
							int TransferAmount = input.nextInt();
							if(passwords.AMOUNTINBANK >= TransferAmount) {
								System.out.println("Tranfered Successfully");
								ministatementwrite.MiniStatementWrite("Funds Transfered :- " +TransferAmount);
								writebankamount.Writebankamount(TransferAmount);
							}
							else {
								System.out.println("Not Sufficient Funds !");
							}
							
						}
						else {
							System.out.println("Wrong Account Number !");
						}
						
						
						break;
					case 6:
						System.out.println("Error Code 61 !");
						break;
					case 7:
						System.out.print("Enter The WithDraw Amount :- ");
						int WithDrawAmount = input.nextInt();
						cashwithdraw.CashWithDraw(WithDrawAmount);
						ministatementwrite.MiniStatementWrite(" Cash Withdraw :-  "+WithDrawAmount);
						break;
					case 8:
						System.out.print("Enter The Amount To Deposit In Your JavaBank :-  ");
						int depositamount = input.nextInt();
						cashdeposit.Cashdeposit(depositamount);
						System.out.println("Cash Deposited Successfully");
						ministatementwrite.MiniStatementWrite("Cash Deposited IN JavaBank :-  " + depositamount);
						break;
					default:
							System.out.println("Selected Wrong Option !");
						
					}
					
				}
				else {
					System.out.println("Wrong Pin Entered !");
					ministatementwrite.MiniStatementWrite("Wrong Pin Entered");
				
				}
				}
			else {
				System.out.println("Wrong Option Selected !");
			}
	
			break;}
		
		}
	}
