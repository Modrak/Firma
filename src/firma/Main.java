package firma;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

			Sprz�taczki s1=new Sprz�taczki();
			Dyrektorzy d1=new Dyrektorzy();
			Pracownik p1 = new Pracownik();
			dzia�HR hr1 = new dzia�HR();
			Scanner menu = new Scanner(System.in);
			
			
			
			
				System.out.println("Co chcesz zrobi�? \n 1.Dodaj pracownika \n 2.Dodaj sprz�taczke \n 3.Dodaj dyrektora "
						+ "\n 4.��czna produktywno�� \n 5.Zobacz wszystkich pracownik�w \n 6.Zobacz wszystkie sprz�taczki \n 7.Zobacz wszystkich dyrektor�w \n 8.Miesi�czny koszt pracy ");
				String wyb�r= menu.nextLine();
				int zmiennaCase=0;
				
				if(wyb�r.equals("Dodaj pracownika")) {
					zmiennaCase=1;
				}
				else if(wyb�r.equals("Dodaj sprz�taczke")) {
					zmiennaCase=2;
				}
				else if (wyb�r.equals("Dodaj dyrektora")) {
					zmiennaCase=3;
				}
				else if(wyb�r.equals("��czna produktywno��")) {
					zmiennaCase=4;
				}
				else if(wyb�r.equals("Zobacz wszystkich pracownik�w")) {
					zmiennaCase=5;
				}
				else if(wyb�r.equals("Zobacz wszystkie sprz�taczki")) {
					zmiennaCase=6;
				}
				else if(wyb�r.equals("Zobacz wszystkich dyrektor�w")) {
					zmiennaCase=7;
				}
				else if(wyb�r.equals("Miesi�czny koszt pracy")) {
					zmiennaCase=8;
				}

				switch (zmiennaCase) {
				case 1:
					hr1.nowyPracownik();
					break;
				case 2:
					hr1.nowaSprz�taczka();
					break;
				case 3:
					hr1.nowyDyrektor();
					break;
				case 4:
					p1.��cznaProduktywno��();
					break;
				case 5:
					p1.wymie�Pracownik�w();
					break;
				case 6:
					s1.wymie�Sprz�taczki();
					break;
				case 7:
					d1.wymie�Dyrektor�w();
					break;
				case 8:
					hr1.miesi�cznyKosztPracy();
					break;
				}
				
	}

}
