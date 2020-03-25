package firma;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

			Sprz¹taczki s1=new Sprz¹taczki();
			Dyrektorzy d1=new Dyrektorzy();
			Pracownik p1 = new Pracownik();
			dzia³HR hr1 = new dzia³HR();
			Scanner menu = new Scanner(System.in);
			
			
			
			
				System.out.println("Co chcesz zrobiæ? \n 1.Dodaj pracownika \n 2.Dodaj sprz¹taczke \n 3.Dodaj dyrektora "
						+ "\n 4.£¹czna produktywnoœæ \n 5.Zobacz wszystkich pracowników \n 6.Zobacz wszystkie sprz¹taczki \n 7.Zobacz wszystkich dyrektorów \n 8.Miesiêczny koszt pracy ");
				String wybór= menu.nextLine();
				int zmiennaCase=0;
				
				if(wybór.equals("Dodaj pracownika")) {
					zmiennaCase=1;
				}
				else if(wybór.equals("Dodaj sprz¹taczke")) {
					zmiennaCase=2;
				}
				else if (wybór.equals("Dodaj dyrektora")) {
					zmiennaCase=3;
				}
				else if(wybór.equals("£¹czna produktywnoœæ")) {
					zmiennaCase=4;
				}
				else if(wybór.equals("Zobacz wszystkich pracowników")) {
					zmiennaCase=5;
				}
				else if(wybór.equals("Zobacz wszystkie sprz¹taczki")) {
					zmiennaCase=6;
				}
				else if(wybór.equals("Zobacz wszystkich dyrektorów")) {
					zmiennaCase=7;
				}
				else if(wybór.equals("Miesiêczny koszt pracy")) {
					zmiennaCase=8;
				}

				switch (zmiennaCase) {
				case 1:
					hr1.nowyPracownik();
					break;
				case 2:
					hr1.nowaSprz¹taczka();
					break;
				case 3:
					hr1.nowyDyrektor();
					break;
				case 4:
					p1.³¹cznaProduktywnoœæ();
					break;
				case 5:
					p1.wymieñPracowników();
					break;
				case 6:
					s1.wymieñSprz¹taczki();
					break;
				case 7:
					d1.wymieñDyrektorów();
					break;
				case 8:
					hr1.miesiêcznyKosztPracy();
					break;
				}
				
	}

}
