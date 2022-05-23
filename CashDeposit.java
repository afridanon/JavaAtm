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

package atm;

import java.io.FileWriter;
import java.io.IOException;

class CashDeposit{
	imp passwords = new imp();
	CashDepositInBank cashdeposit = new CashDepositInBank();
	void Cashdeposit(int AMOUNT) {
		cashdeposit.AmountInBank(AMOUNT);
	}
}

class CashDepositInBank{
	imp passwords = new imp();
	void AmountInBank(int AmountDepositInBank) {
		try {
		FileWriter filewriter = new FileWriter("BANKAMOUNT.txt");
		int AmountDeposit = passwords.AMOUNTINBANK + AmountDepositInBank;
		filewriter.write(new Integer(AmountDeposit).toString());
		filewriter.close();
		}catch(IOException e) {
			
		}
	}
}
