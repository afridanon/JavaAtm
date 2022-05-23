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

import java.util.Scanner;

class PinChange{
	imp passwords = new imp();
	Scanner input =new Scanner(System.in); 
	int PinChange(){
		System.out.print("Enter Your Old Pin :- ");
		int oldatmpin = input.nextInt();
		if(oldatmpin == passwords.getMAINPIN() ) {
			return 0;
		}
		else {
			return 1;
		}
		
	}
}

