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
	public void ³¹cznaProduktywnoœæ() throws FileNotFoundException {
		double ³¹cznaProduktywnoœæ=0;
		File listaPracowników=new File("Spis_Pracowników.txt");
		Scanner czytanie=new Scanner(listaPracowników);
		
		while(czytanie.hasNextLine()) {
		String nextLineFromFile= czytanie.nextLine();
        String[] parameters= nextLineFromFile.split("-");
        String produkowanie=parameters[3];
        double produktywnoœæ=Double.parseDouble(produkowanie);
        System.out.println(produkowanie);
        ³¹cznaProduktywnoœæ= ³¹cznaProduktywnoœæ+produktywnoœæ;
        
		}
		System.out.println("£¹czna produktywnoœæ dzienna wynosi: "+(double)³¹cznaProduktywnoœæ);
		
	}

	public void wymieñPracowników() throws IOException{
		File listaPracowników=new File("Spis_Pracowników.txt");
		Scanner czytanie=new Scanner(listaPracowników);
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
	public void wymieñDyrektorów() throws FileNotFoundException {
		File listaDyrektorów=new File("Spis_Dyrektorów.txt");
		Scanner liczenieDyrektorów=new Scanner(listaDyrektorów);
		while(liczenieDyrektorów.hasNextLine()) {
			
			
			String jednaLinia=liczenieDyrektorów.nextLine();
			String[] parameters=jednaLinia.split("-");
			System.out.println(parameters[0] + parameters[1]);
		}
	}

}



class Sprz¹taczki extends Pracownik {
	int szybkoscSprz¹tania;
	public void wymieñSprz¹taczki() throws IOException{
		File listaPracowników=new File("Spis_Sprz¹taczek.txt");
		Scanner czytanie=new Scanner(listaPracowników);
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

class dzia³HR {
	int iloœæImion = 0;
	int iloœæNazwisk = 0;
	int zmiennaX = 0;
	int age;
	String noweImie = null;
	String noweNazwisko = null;
	boolean wiekToInt = true;

	public void nowyPracownik() throws IOException {

		File pracownicy = new File("Spis_Pracowników.txt");
		Writer zapisPracownika;
		Scanner czytanie = new Scanner(pracownicy);
		Scanner pobieranieDanych = new Scanner(System.in);
		zapisPracownika = new BufferedWriter(new FileWriter("Spis_Pracowników.txt", true)); // buffered Writer, nie wiem czemu ale dzia³a po zmianie z "writera"																							

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
		System.out.println("Podaj dzienn¹ produktywnoœæ: ");
		zapisPracownika.write(pobieranieDanych.nextDouble()+"\n");

		zapisPracownika.close();
		pobieranieDanych.close();
		System.out.println("Dodano pracownika "+noweImie+" "+noweNazwisko+ " i ma "+age+" lat");
		

	}

	public void nowaSprz¹taczka() throws IOException {

		File sprz¹taczki = new File("Spis_Sprz¹taczek.txt");
		Writer zapisPracownika;
		Scanner czytanie = new Scanner(sprz¹taczki);
		Scanner pobieranieDanych = new Scanner(System.in);
		zapisPracownika = new BufferedWriter(new FileWriter("Spis_Sprz¹taczek.txt", true)); // buffered Writer, nie wiem czemu ale dzia³a po zmianie z "writera"																							

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
		System.out.println("Dodano sprz¹tacza/ke "+noweImie+" "+noweNazwisko+ " i ma "+age+" lat");
		czytanie.close();

	}
	
	public void nowyDyrektor() throws IOException {

		File dyrektory = new File("Spis_Dyrektorów.txt");
		Writer zapisPracownika;
		Scanner pobieranieDanych = new Scanner(System.in);
		zapisPracownika = new BufferedWriter(new FileWriter("Spis_Dyrektorów.txt", true)); // buffered Writer, nie wiem czemu ale dzia³a po zmianie z "writera"																							

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
	
	public void miesiêcznyKosztPracy() throws FileNotFoundException {
		File pracownicy =new File("Spis_Pracowników.txt");
		File sprz¹taczki =new File("Spis_Sprz¹taczek.txt");
		File dyrektorzy =new File("Spis_Dyrektorów.txt");
		Scanner liczeniePracowników=new Scanner(pracownicy);
		Scanner liczenieSprz¹taczek=new Scanner(sprz¹taczki);
		Scanner liczenieDyrektorów=new Scanner(dyrektorzy);
		
		int wyp³ataPracownicy=0;
		int iloœæPracowników=0;
	
		while(liczeniePracowników.hasNextLine()) {
			wyp³ataPracownicy+=2600;
			iloœæPracowników++;
		}
		
		int iloœæSprz¹taczek=0;
		int wyp³ataSprz¹taczek=0;
		while(liczenieSprz¹taczek.hasNextLine()) {
			wyp³ataSprz¹taczek+=1500;
			iloœæSprz¹taczek++;
		}
		int iloœæDyrektorów=0;
		int wyp³ataDyrektorów=0;
		int ³¹cznyKosztPremii=0;
		while(liczenieDyrektorów.hasNextLine()) {
		String nastêpnaLinia = liczenieDyrektorów.nextLine();
        String[] parameters= nastêpnaLinia.split("-");
        int kosztPremii= Integer.parseInt(parameters[3]);
        ³¹cznyKosztPremii =+ kosztPremii;
        wyp³ataDyrektorów=+3200+kosztPremii;
        iloœæDyrektorów++;
		}
		System.out.println("Masz ³¹cznie: "+iloœæPracowników+" roboli. \n P³acisz im ³¹cznie"+wyp³ataPracownicy+"Brutto miesiêcznie.");
		System.out.println("Masz ³¹cznie: "+iloœæSprz¹taczek+" sprz¹taczek. \n P³acisz im ³¹cznie"+wyp³ataSprz¹taczek+"Brutto miesiêcznie.");
		System.out.println("Masz ³¹cznie: "+iloœæDyrektorów+" dyrektorów. \n P³acisz im ³¹cznie"+wyp³ataDyrektorów+"Brutto miesiêcznie, w tym "+³¹cznyKosztPremii+" to koszty premii.");
	}
	
	private void losowanieImienia() {
		File imiona = new File("imiona");
		int Rand = 0;
		liczenieImion();
		try {

			Random losowa = new Random();

			boolean losowanie = true;
			while (losowanie == true) {

				Rand = losowa.nextInt(iloœæImion);
				if (Rand <= iloœæImion) {
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

				Rand = losowa.nextInt(iloœæNazwisk);
				if (Rand <= iloœæNazwisk) {
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
				iloœæImion++;
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
				iloœæNazwisk++;
			}
			
			czytnikNazwisk.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
