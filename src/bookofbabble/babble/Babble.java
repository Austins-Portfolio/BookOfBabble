package bookofbabble.babble;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

import bookofbabble.utils.Converter;

public class Babble {

	private HashMap<Character, Integer> symbolTable = new HashMap<>();
	private HashMap<Integer, Character> valueTable = new HashMap<>();
	
	public Babble() {
		
	}
	
	public Babble(HashMap<Character, Integer> symbolTable, HashMap<Integer, Character> valueTable) {
		this.symbolTable = symbolTable;
		this.valueTable = valueTable;
	}
	
	public void addSymbol(Character c) {
		int size = symbolTable.size();
		symbolTable.put(c, size);
		valueTable.put(size, c);
	}
	
	public int getPosition(String text) {
		ArrayList<Integer> symbols = new ArrayList<Integer>();
		char[] characters = text.toCharArray();
		for(int i = 0; i < characters.length; i++) {
			symbols.add(symbolTable.get(characters[i]));
		}
		
		for(int i = 0; i < symbols.size(); i++) {
			System.out.print(symbols.get(i)+" ");
		}
		System.out.println();
		
		return Converter.convertToInteger(symbols, symbolTable.size());
	}
	
	public String getText(int position) {
		ArrayList<Integer> symbols = Converter.convertToArray(position, symbolTable.size());
		
		for(int i = 0; i < symbols.size(); i++) {
			System.out.print(symbols.get(i)+" ");
		}
		System.out.println();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < symbols.size(); i++) {
			sb.append(valueTable.get(symbols.get(i)));
		}
		
		return sb.toString();
	}
	
	public BigInteger getBigPosition(String text) {
		ArrayList<BigInteger> symbols = new ArrayList<BigInteger>();
		char[] characters = text.toCharArray();
		for(int i = 0; i < characters.length; i++) {
			symbols.add(BigInteger.valueOf(symbolTable.get(characters[i])));
		}
		
		for(int i = 0; i < symbols.size(); i++) {
			System.out.print(symbols.get(i)+" ");
		}
		System.out.println();
		
		return Converter.convertToBigInteger(symbols, symbolTable.size());
	}
	
	public String getBigText(BigInteger position) {
		ArrayList<BigInteger> symbols = Converter.convertToBigArray(position, symbolTable.size());
		
		for(int i = 0; i < symbols.size(); i++) {
			System.out.print(symbols.get(i)+" ");
		}
		System.out.println();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < symbols.size(); i++) {
			sb.append(valueTable.get(symbols.get(i).intValue()));
		}
		
		return sb.toString();
	}
	
	
}
