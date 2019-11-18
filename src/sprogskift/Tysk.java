/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprogskift;

/**
 *
 * @author vnord
 */
public class Tysk implements SprogI {
    	public void printMenu() {
		System.out.println("Willkommen");
		System.out.println("1) Hunde zeigen");
		System.out.println("2) Hund wählen");
		System.out.println("3) Suche mit Name");
		System.out.println("4) Sprache ändern");
		System.out.println("9) Programm schliessen");
		System.out.println("Geben Sie Ihre Wahl ein: ");
	}
	public void printLang() {
		System.out.println("Sprache ändern: ");
		System.out.println("1) Dänisch");
		System.out.println("2) Englisch");
		System.out.println("3) Deutsche");
	}
}
