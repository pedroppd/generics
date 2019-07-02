package generics.main;

import java.util.Scanner;

import generics.service.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PrintService<Integer> ps = new PrintService<>();

		System.out.println("How many values? ");
		Integer n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValues(value);
		}
		
		ps.print();
		System.out.print("First: " + ps.first());
		sc.close();
	}
}
