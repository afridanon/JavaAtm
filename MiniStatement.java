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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;  
class MinistatementRead{
	void Read() {
	try  
	{  
	File file=new File("statement.txt");     
	FileReader fr=new FileReader(file);   
	BufferedReader br=new BufferedReader(fr);  
	StringBuffer sb=new StringBuffer();     
	String line;  
	while((line=br.readLine())!=null)  
	{  
	sb.append(line);   
	sb.append("\n");      
	}  
	fr.close();      
	System.out.println(sb.toString());
	System.out.println("Thank For Using JavaBank ATM ");
	}  
	catch(IOException e)  
	{  
	e.printStackTrace();  
	}  
}
}
class MiniStatement{
	void MiniStatementWrite(String Content) {
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date date = new Date();  
			BufferedWriter writer = new BufferedWriter(new FileWriter("statement.txt", true));
			writer.write(formatter.format(date) + "       "+ Content);
			writer.newLine();
			writer.close();
			
		}
		catch(IOException e) {
			System.out.println("Error Code 81 !");
		}
	}
	
}