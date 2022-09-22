package Main;
import restaurant.*;
import java.util.Scanner;

public class RestaurantMain {
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		Restaurant menu = new Restaurant();
		menu.tambahMakanan();
		int temp = 0;
		while(temp != 1) {			
				menu.tampilMenuMakanan(); 				
				System.out.println();
				System.out.print("Pilih angka : ");
				int pilihan = myObj.nextInt();
				menu.isOutOfStock(pilihan);
				System.out.print("Jumlah : ");
				int quantity = myObj.nextInt();
				System.out.println();		
				pilihan = pilihan - 1;
				menu.beliMakanan(pilihan,quantity);				
			System.out.print("Exit ? (1 = Yes 2 = No)");
			temp  = myObj.nextInt();
		}
	}
}
