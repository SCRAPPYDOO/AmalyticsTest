package main;

import java.util.Scanner;

import main.till.Till;

public class Main {

	public static void main(String... args) {
		Till till = new Till();
		System.out.println("TEST START");
		System.out.println("PUT LIST OF ITEMS SEPARATED BY SPACE (FOR EXAMPLE: orange apple apple orange)");
		Scanner scanner = new Scanner(System.in);
		till.scanItems(scanner.nextLine());
		scanner.close();
		System.out.println("TEST END");
	}
}
