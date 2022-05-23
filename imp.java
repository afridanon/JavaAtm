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
import java.io.File;
import java.io.FileWriter;
import java.io.IOException; 
import java.util.Scanner;
// Account Holder Details

 class readfileatmpin{
	 public int ATMPIN() 
	{
		
		try {
			File file = new File("ATMPIN.txt");
			Scanner read = new Scanner(file);
		    int data = read.nextInt();
		    read.close();
		    return data;
			
		}
		catch(IOException e) {
			return 0;
		}
		
	}
}
 class readfilebankamount {
	 public int bankamount() 
	{
		
		try {
			File file = new File("BANKAMOUNT.txt");
			Scanner read = new Scanner(file);
		    int data = read.nextInt();
		    read.close();
		    return data;
			
		}
		catch(IOException e) {
			return 0;
		}
		
	}
}

 class writeatmpin{
	   public void Writeatmpin(int pin) {
		 try {
		 FileWriter filewrite = new FileWriter("ATMPIN.txt");
		 //new Integer(comb).toString()
		 filewrite.write(new Integer(pin).toString());
		 filewrite.close();
		 
		 }
		 catch (IOException e){
			 System.out.println("nope");
		 }
	 }
}

public class imp{
	
	readfileatmpin atmpin = new readfileatmpin();
	readfilebankamount bankamount = new readfilebankamount();
	writeatmpin writeatmpin = new writeatmpin();
	
	
	private int MAINPIN = atmpin.ATMPIN();
	int AMOUNTINBANK = bankamount.bankamount() ;
	
	
	public int getMAINPIN() {
		return MAINPIN ;
	}
	public void setMAINPIN(int newpin) {
		writeatmpin.Writeatmpin(newpin);
	}
	
}





/*
public class imp {
	int ATMPIN = 1703;
	private int MAINPIN = ATMPIN;
	
	
	public int getMAINPIN() {
		return MAINPIN ;
	}
	public void setMAINPIN(int newpin) {
		this.MAINPIN = newpin;
	}
}
*/
