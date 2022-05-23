
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

class PinCheck{
	imp passwords = new imp();
	Scanner input = new Scanner(System.in);
	int pinCheck(){
		System.out.print("Please Enter Your Pin :- ");
		int pinCheck = input.nextInt();
		if(pinCheck == passwords.getMAINPIN()) {
			return 0;
		}
		else {
			return 1;
		}
		
	}
}