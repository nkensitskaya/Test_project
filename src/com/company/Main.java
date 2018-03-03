package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i=1; i<=10; i++){
        	for (int j=1; j<=10; j++){
        		printFormated(i*j);
			}
			System.out.println();
		}

	}

	private static void printFormated(int k) {
		if (k<10){
			System.out.print(" " + k + " ");}
			else {	System.out.print(k + " ");}
	}

}
