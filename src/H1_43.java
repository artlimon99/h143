
/**
* CLASS: H1_43 (H1_43.java)
* GROUP nn
* AUTHOR 1: Arthur Limoncelli, 1223471899, alimonce@asu.edu 
* AUTHOR 2: your name, your ASURITEID username, your email address
* AUTHOR 3: your name, your ASURITEID username, your email address
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class H1_43 {

	public H1_43() {
	
	}
	
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the name of a Java source file:");
		String inFileName = scanner.next();
		String outFileName = inFileName + ".txt.";

		Scanner in = new Scanner(new File(inFileName));

		PrintWriter out = new PrintWriter(new File(outFileName));

		int count = 0;
		while (in.hasNext()) {
			String line1 = in.nextLine();

			out.printf("[%03d] %s\n", count++, line1);
		}

		in.close();
		scanner.close();
		out.close();
	}
}
