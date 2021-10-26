package bookofbabble.launcher;

import java.math.BigInteger;
import java.util.Scanner;

import bookofbabble.babble.Babble;

public class Launcher {

	public static void main(String[] args) {
		Babble bob = new Babble();
		
		bob.addSymbol(' ');
		bob.addSymbol('a');
		bob.addSymbol('b');
		bob.addSymbol('c');
		bob.addSymbol('d');
		bob.addSymbol('e');
		bob.addSymbol('f');
		bob.addSymbol('g');
		bob.addSymbol('h');
		bob.addSymbol('i');
		bob.addSymbol('j');
		bob.addSymbol('k');
		bob.addSymbol('l');
		bob.addSymbol('m');
		bob.addSymbol('n');
		bob.addSymbol('o');
		bob.addSymbol('p');
		bob.addSymbol('q');
		bob.addSymbol('r');
		bob.addSymbol('s');
		bob.addSymbol('t');
		bob.addSymbol('u');
		bob.addSymbol('v');
		bob.addSymbol('w');
		bob.addSymbol('x');
		bob.addSymbol('y');
		bob.addSymbol('z');
		bob.addSymbol('A');
		bob.addSymbol('B');
		bob.addSymbol('C');
		bob.addSymbol('D');
		bob.addSymbol('E');
		bob.addSymbol('F');
		bob.addSymbol('G');
		bob.addSymbol('H');
		bob.addSymbol('I');
		bob.addSymbol('J');
		bob.addSymbol('K');
		bob.addSymbol('L');
		bob.addSymbol('M');
		bob.addSymbol('N');
		bob.addSymbol('O');
		bob.addSymbol('P');
		bob.addSymbol('Q');
		bob.addSymbol('R');
		bob.addSymbol('S');
		bob.addSymbol('T');
		bob.addSymbol('U');
		bob.addSymbol('V');
		bob.addSymbol('W');
		bob.addSymbol('X');
		bob.addSymbol('Y');
		bob.addSymbol('Z');
		bob.addSymbol('0');
		bob.addSymbol('1');
		bob.addSymbol('2');
		bob.addSymbol('3');
		bob.addSymbol('4');
		bob.addSymbol('5');
		bob.addSymbol('6');
		bob.addSymbol('7');
		bob.addSymbol('8');
		bob.addSymbol('9');
		bob.addSymbol('-');
		bob.addSymbol('_');
		bob.addSymbol('.');
		bob.addSymbol('!');
		bob.addSymbol('?');
		bob.addSymbol('+');
		bob.addSymbol('-');
		bob.addSymbol('=');
		bob.addSymbol(',');
		bob.addSymbol('\'');
		bob.addSymbol('\r');
		bob.addSymbol('\n');
		bob.addSymbol('/');
		bob.addSymbol('\\');
		bob.addSymbol('\"');
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Phrase To Babble: ");
		String data = sc.nextLine();
		
		BigInteger position = bob.getBigPosition(data);
		String myString = bob.getBigText(position);
		
		int biBytes = (position.bitLength()/8);
		int sBytes = myString.getBytes().length;
		double saved = 100-(biBytes * 100.0d) / sBytes;
		
		System.out.println("The text: ["+myString+"] is found at position "+ position +"!");
		System.out.println("The text: ["+myString+"] found at position "+ position +" is " + biBytes + " bytes compaired to " + sBytes + " bytes for the string!");
		System.out.println("A saving of "+saved+"%!");
	}

}
