package dk.aau.imi.med4.ooadp2009.javaintro.exercises;

import java.util.Scanner;

public class SortStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sa = new String[10];
		for(int i = 0; i < 10; i++) {
			System.out.print("Please input string number "+(i+1)+": ");
			sa[i] = sc.next();
		}
		for (int j = 0; j < 10; j++) System.out.println(sa[j]);
		String[] sortedSa = new String[10];
		String leastString;
		int leastIndex = 0;
		for(int i = 0; i < 10; i++) {
			leastString = null;
			leastIndex = -1;
			for(int j = 0; j < 10; j++) {
				if (leastString == null && sa[j] != null) {
					leastString = sa[j];
					leastIndex = j;
				} else if (leastString != null && 
						sa[j] != null && 
						sa[j].compareTo(leastString) == -1) {
					leastString = sa[j];
					leastIndex = j;
				}					
			}
			sortedSa[i] = leastString;
			sa[leastIndex] = null;
		}
		for(String s: sortedSa)
			System.out.println(s);
	}
}
