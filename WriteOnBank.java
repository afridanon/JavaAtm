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

class writebankamount{
	imp passwords = new imp();
	   public void Writebankamount(int amount) {
		 try {
		 FileWriter filewrite = new FileWriter("BANKAMOUNT.txt");
		 //new Integer(comb).toString()
		 int balanceinbank = passwords.AMOUNTINBANK - amount;
		 filewrite.write(new Integer(balanceinbank).toString());
		 filewrite.close();
		 
		 }
		 catch (IOException e){
			 System.out.println("Error Code 52");
		 }
	 }
}
