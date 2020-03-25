package firma;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.Writer;

class Pracownik {
	String name;
	String lastName;
	int age;
	int salary;
	public void ��cznaProduktywno��() throws FileNotFoundException {
		double ��cznaProduktywno��=0;
		File listaPracownik�w=new File("Spis_Pracownik�w.txt");
		Scanner czytanie=new Scanner(listaPracownik�w);
		
		while(czytanie.hasNextLine()) {
		String nextLineFromFile= czytanie.nextLine();
        String[] parameters= nextLineFromFile.split("-");
        String produkowanie=parameters[3];
        double produktywno��=Double.parseDouble(produkowanie);
        System.out.println(produkowanie);
        ��cznaProduktywno��= ��cznaProduktywno��+produktywno��;
        
		}
		System.out.println("��czna produktywno�� dzienna wynosi: "+(double)��cznaProduktywno��);
		
	}

	public void wymie�Pracownik�w() throws IOException{
		File listaPracownik�w=new File("Spis_Pracownik�w.txt");
		Scanner czytanie=new Scanner(listaPracownik�w);
		System.out.println("Oto wszyscy robole:");
		while(czytanie.hasNextLine()) {
		String nextLineFromFile= czytanie.nextLine();
        String[] parameters= nextLineFromFile.split("-");
        String imie = parameters[0];
        String nazwisko=parameters[1];
        String wiek=parameters[2];
        System.out.println(imie+" "+nazwisko+" "+wiek+"lat");
        
		}
		
		
	}
}

class Dyrektorzy extends Pracownik {
	int premia;
	public void wymie�Dyrektor�w() throws FileNotFoundException {
		File listaDyrektor�w=new File("Spis_Dyrektor�w.txt");
		Scanner liczenieDyrektor�w=new Scanner(listaDyrektor�w);
		while(liczenieDyrektor�w.hasNextLine()) {
			
			
			String jednaLinia=liczenieDyrektor�w.nextLine();
			String[] parameters=jednaLinia.split("-");
			System.out.println(parameters[0] + parameters[1]);
		}
	}

}



class Sprz�taczki extends Pracownik {
	int szybkoscSprz�tania;
	public void wymie�Sprz�taczki() throws IOException{
		File listaPracownik�w=new File("Spis_Sprz�taczek.txt");
		Scanner czytanie=new Scanner(listaPracownik�w);
		System.out.println("Oto wszyscy robole:");
		while(czytanie.hasNextLine()) {
		String nextLineFromFile= czytanie.nextLine();
        String[] parameters= nextLineFromFile.split("-");
        String imie = parameters[0];
        String nazwisko=parameters[1];
        String wiek=parameters[2];
        System.out.println(imie+" "+nazwisko+" "+wiek+"lat");
        
		}
		
		
	}
}

class dzia�HR {
	int ilo��Imion = 0;
	int ilo��Nazwisk = 0;
	int zmiennaX = 0;
	int age;
	String noweImie = null;
	String noweNazwisko = null;
	boolean wiekToInt = true;

	public void nowyPracownik() throws IOException {

		File pracownicy = new File("Spis_Pracownik�w.txt");
		Writer zapisPracownika;
		Scanner czytanie = new Scanner(pracownicy);
		Scanner pobieranieDanych = new Scanner(System.in);
		zapisPracownika = new BufferedWriter(new FileWriter("Spis_Pracownik�w.txt", true)); // buffered Writer, nie wiem czemu ale dzia�a po zmianie z "writera"																							

		losowanieImienia(); 
		losowanieNazwiska();

		zapisPracownika.write(noweImie + "-"); // Dodawanie imienia i nazwiska
		zapisPracownika.write(noweNazwisko + "-");
		System.out.println("Podaj wiek pracownika");
		while (wiekToInt) {
			age = pobieranieDanych.nextInt();
			String s=String.valueOf(age);
			
			if (age > 0 & age < 100) {
				System.out.println(s);
				zapisPracownika.write(s+"-");
				wiekToInt = false;
			} else
				System.out.println("Podaj wiek poprawnie");
		}
		System.out.println("Podaj dzienn� produktywno��: ");
		zapisPracownika.write(pobieranieDanych.nextDouble()+"\n");

		zapisPracownika.close();
		pobieranieDanych.close();
		System.out.println("Dodano pracownika "+noweImie+" "+noweNazwisko+ " i ma "+age+" lat");
		

	}

	public void nowaSprz�taczka() throws IOException {

		File sprz�taczki = new File("Spis_Sprz�taczek.txt");
		Writer zapisPracownika;
		Scanner czytanie = new Scanner(sprz�taczki);
		Scanner pobieranieDanych = new Scanner(System.in);
		zapisPracownika = new BufferedWriter(new FileWriter("Spis_Sprz�taczek.txt", true)); // buffered Writer, nie wiem czemu ale dzia�a po zmianie z "writera"																							

		losowanieImienia(); 
		losowanieNazwiska();

		zapisPracownika.write(noweImie + "-"); // Dodawanie imienia i nazwiska
		zapisPracownika.write(noweNazwisko + "-");
		System.out.println("Podaj wiek pracownika");
		while (wiekToInt) {
			age = pobieranieDanych.nextInt();
			if (age > 0 & age < 100) {
				System.out.println(age);
				zapisPracownika.write(age);
				wiekToInt = false;
			} else
				System.out.println("Podaj wiek poprawnie");
		}

		zapisPracownika.close();
		pobieranieDanych.close();
		System.out.println("Dodano sprz�tacza/ke "+noweImie+" "+noweNazwisko+ " i ma "+age+" lat");
		czytanie.close();

	}
	
	public void nowyDyrektor() throws IOException {

		File dyrektory = new File("Spis_Dyrektor�w.txt");
		Writer zapisPracownika;
		Scanner pobieranieDanych = new Scanner(System.in);
		zapisPracownika = new BufferedWriter(new FileWriter("Spis_Dyrektor�w.txt", true)); // buffered Writer, nie wiem czemu ale dzia�a po zmianie z "writera"																							

		losowanieImienia(); 
		losowanieNazwiska();

		zapisPracownika.write(noweImie + "-"); // Dodawanie imienia i nazwiska
		zapisPracownika.write(noweNazwisko + "-");
		System.out.println("Podaj wiek pracownika");
		while (wiekToInt) {
			age = pobieranieDanych.nextInt();
			if (age > 0 & age < 100) {
				
				zapisPracownika.write(age+"-");
				wiekToInt = false;
			} else
				System.out.println("Podaj wiek poprawnie");
		}
		System.out.println("ile wynosi premia?");
		
		
		zapisPracownika.write(pobieranieDanych.nextInt()+"\n");
		
		zapisPracownika.close();
		pobieranieDanych.close();
		System.out.println("Dodano dyrektora "+noweImie+" "+noweNazwisko+ " i ma "+age+" lat");

	}
	
	public void miesi�cznyKosztPracy() throws FileNotFoundException {
		File pracownicy =new File("Spis_Pracownik�w.txt");
		File sprz�taczki =new File("Spis_Sprz�taczek.txt");
		File dyrektorzy =new File("Spis_Dyrektor�w.txt");
		Scanner liczeniePracownik�w=new Scanner(pracownicy);
		Scanner liczenieSprz�taczek=new Scanner(sprz�taczki);
		Scanner liczenieDyrektor�w=new Scanner(dyrektorzy);
		
		int wyp�ataPracownicy=0;
		int ilo��Pracownik�w=0;
	
		while(liczeniePracownik�w.hasNextLine()) {
			wyp�ataPracownicy+=2600;
			ilo��Pracownik�w++;
		}
		
		int ilo��Sprz�taczek=0;
		int wyp�ataSprz�taczek=0;
		while(liczenieSprz�taczek.hasNextLine()) {
			wyp�ataSprz�taczek+=1500;
			ilo��Sprz�taczek++;
		}
		int ilo��Dyrektor�w=0;
		int wyp�ataDyrektor�w=0;
		int ��cznyKosztPremii=0;
		while(liczenieDyrektor�w.hasNextLine()) {
		String nast�pnaLinia = liczenieDyrektor�w.nextLine();
        String[] parameters= nast�pnaLinia.split("-");
        int kosztPremii= Integer.parseInt(parameters[3]);
        ��cznyKosztPremii =+ kosztPremii;
        wyp�ataDyrektor�w=+3200+kosztPremii;
        ilo��Dyrektor�w++;
		}
		System.out.println("Masz ��cznie: "+ilo��Pracownik�w+" roboli. \n P�acisz im ��cznie"+wyp�ataPracownicy+"Brutto miesi�cznie.");
		System.out.println("Masz ��cznie: "+ilo��Sprz�taczek+" sprz�taczek. \n P�acisz im ��cznie"+wyp�ataSprz�taczek+"Brutto miesi�cznie.");
		System.out.println("Masz ��cznie: "+ilo��Dyrektor�w+" dyrektor�w. \n P�acisz im ��cznie"+wyp�ataDyrektor�w+"Brutto miesi�cznie, w tym "+��cznyKosztPremii+" to koszty premii.");
	}
	
	private void losowanieImienia() {
		File imiona = new File("imiona");
		int Rand = 0;
		liczenieImion();
		try {

			Random losowa = new Random();

			boolean losowanie = true;
			while (losowanie == true) {

				Rand = losowa.nextInt(ilo��Imion);
				if (Rand <= ilo��Imion) {
					losowanie = false;
				}
			}
			Scanner czytnikImion = new Scanner(imiona);
			for (int i = 0; i <= Rand; i++) {
				noweImie = czytnikImion.nextLine();
			}

			
			czytnikImion.close();
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void losowanieNazwiska() {
		File nazwiska = new File("nazwiska");
		int Rand = 0;
		try {
			Random losowa = new Random();
			liczenieNazwisk();
			boolean losowanie = true;
			while (losowanie == true) {

				Rand = losowa.nextInt(ilo��Nazwisk);
				if (Rand <= ilo��Nazwisk) {
					losowanie = false;
				}
			}
			Scanner czytnikNazwisk = new Scanner(nazwiska);
			for (int i = 0; i <= Rand; i++) {
				noweNazwisko = czytnikNazwisk.nextLine();
			}

		
			czytnikNazwisk.close();
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void liczenieImion() {

		File imiona = new File("imiona");
		try {

			Scanner czytnikImion = new Scanner(imiona);
			while (czytnikImion.hasNextLine()) {
				czytnikImion.nextLine(); // Nastepna linia
				ilo��Imion++;
			}
			
			czytnikImion.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	private void liczenieNazwisk() {

		File nazwiska = new File("nazwiska");
		try {

			Scanner czytnikNazwisk = new Scanner(nazwiska);
			while (czytnikNazwisk.hasNextLine()) {
				czytnikNazwisk.nextLine(); // Nastepna linia
				ilo��Nazwisk++;
			}
			
			czytnikNazwisk.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
