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
	public void łącznaProduktywność() throws FileNotFoundException {
		double łącznaProduktywność=0;
		File listaPracowników=new File("Spis_Pracowników.txt");
		Scanner czytanie=new Scanner(listaPracowników);
		
		while(czytanie.hasNextLine()) {
		String nextLineFromFile= czytanie.nextLine();
        String[] parameters= nextLineFromFile.split("-");
        String produkowanie=parameters[3];
        double produktywność=Double.parseDouble(produkowanie);
        System.out.println(produkowanie);
        łącznaProduktywność= łącznaProduktywność+produktywność;
        
		}
		System.out.println("Łączna produktywność dzienna wynosi: "+(double)łącznaProduktywność);
		
	}

	public void wymieńPracowników() throws IOException{
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
	public void wymieńDyrektorów() throws FileNotFoundException {
		File listaDyrektorów=new File("Spis_Dyrektorów.txt");
		Scanner liczenieDyrektorów=new Scanner(listaDyrektorów);
		while(liczenieDyrektorów.hasNextLine()) {
			
			
			String jednaLinia=liczenieDyrektorów.nextLine();
			String[] parameters=jednaLinia.split("-");
			System.out.println(parameters[0] + parameters[1]);
		}
	}

}



class Sprzątaczki extends Pracownik {
	int szybkoscSprzątania;
	public void wymieńSprzątaczki() throws IOException{
		File listaPracowników=new File("Spis_Sprzątaczek.txt");
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

class działHR {
	int ilośćImion = 0;
	int ilośćNazwisk = 0;
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
		zapisPracownika = new BufferedWriter(new FileWriter("Spis_Pracowników.txt", true)); // buffered Writer, nie wiem czemu ale działa po zmianie z "writera"																							

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
		System.out.println("Podaj dzienną produktywność: ");
		zapisPracownika.write(pobieranieDanych.nextDouble()+"\n");

		zapisPracownika.close();
		pobieranieDanych.close();
		System.out.println("Dodano pracownika "+noweImie+" "+noweNazwisko+ " i ma "+age+" lat");
		

	}

	public void nowaSprzątaczka() throws IOException {

		File sprzątaczki = new File("Spis_Sprzątaczek.txt");
		Writer zapisPracownika;
		Scanner czytanie = new Scanner(sprzątaczki);
		Scanner pobieranieDanych = new Scanner(System.in);
		zapisPracownika = new BufferedWriter(new FileWriter("Spis_Sprzątaczek.txt", true)); // buffered Writer, nie wiem czemu ale działa po zmianie z "writera"																							

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
		System.out.println("Dodano sprzątacza/ke "+noweImie+" "+noweNazwisko+ " i ma "+age+" lat");
		czytanie.close();

	}
	
	public void nowyDyrektor() throws IOException {

		File dyrektory = new File("Spis_Dyrektorów.txt");
		Writer zapisPracownika;
		Scanner pobieranieDanych = new Scanner(System.in);
		zapisPracownika = new BufferedWriter(new FileWriter("Spis_Dyrektorów.txt", true)); // buffered Writer, nie wiem czemu ale działa po zmianie z "writera"																							

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
	
	public void miesięcznyKosztPracy() throws FileNotFoundException {
		File pracownicy =new File("Spis_Pracowników.txt");
		File sprzątaczki =new File("Spis_Sprzątaczek.txt");
		File dyrektorzy =new File("Spis_Dyrektorów.txt");
		Scanner liczeniePracowników=new Scanner(pracownicy);
		Scanner liczenieSprzątaczek=new Scanner(sprzątaczki);
		Scanner liczenieDyrektorów=new Scanner(dyrektorzy);
		
		int wypłataPracownicy=0;
		int ilośćPracowników=0;
	
		while(liczeniePracowników.hasNextLine()) {
			wypłataPracownicy+=2600;
			ilośćPracowników++;
		}
		
		int ilośćSprzątaczek=0;
		int wypłataSprzątaczek=0;
		while(liczenieSprzątaczek.hasNextLine()) {
			wypłataSprzątaczek+=1500;
			ilośćSprzątaczek++;
		}
		int ilośćDyrektorów=0;
		int wypłataDyrektorów=0;
		int łącznyKosztPremii=0;
		while(liczenieDyrektorów.hasNextLine()) {
		String następnaLinia = liczenieDyrektorów.nextLine();
        String[] parameters= następnaLinia.split("-");
        int kosztPremii= Integer.parseInt(parameters[3]);
        łącznyKosztPremii =+ kosztPremii;
        wypłataDyrektorów=+3200+kosztPremii;
        ilośćDyrektorów++;
		}
		System.out.println("Masz łącznie: "+ilośćPracowników+" roboli. \n Płacisz im łącznie"+wypłataPracownicy+"Brutto miesięcznie.");
		System.out.println("Masz łącznie: "+ilośćSprzątaczek+" sprzątaczek. \n Płacisz im łącznie"+wypłataSprzątaczek+"Brutto miesięcznie.");
		System.out.println("Masz łącznie: "+ilośćDyrektorów+" dyrektorów. \n Płacisz im łącznie"+wypłataDyrektorów+"Brutto miesięcznie, w tym "+łącznyKosztPremii+" to koszty premii.");
	}
	
	private void losowanieImienia() {
		File imiona = new File("imiona");
		int Rand = 0;
		liczenieImion();
		try {

			Random losowa = new Random();

			boolean losowanie = true;
			while (losowanie == true) {

				Rand = losowa.nextInt(ilośćImion);
				if (Rand <= ilośćImion) {
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

				Rand = losowa.nextInt(ilośćNazwisk);
				if (Rand <= ilośćNazwisk) {
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
				ilośćImion++;
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
				ilośćNazwisk++;
			}
			
			czytnikNazwisk.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
