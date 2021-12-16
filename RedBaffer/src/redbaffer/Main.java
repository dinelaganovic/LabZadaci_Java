/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redbaffer;

import java.util.Scanner;

/**
 *
 * @author Minela
 */
public class Main {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
		Red b = null;
		try {
			b = new Red(200);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print("Unesite neki broj veci od 0 a manji od 100: ");
			int p = scan.nextInt();
			try {
				b = new Red(p);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
}
