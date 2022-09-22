package restaurant;
import Main.*;

public class Restaurant {

		// TODO Auto-generated method stub
		private tuageun[] makanan_resto;		
//		private tuageun[] stok_makanan;
//		private tuageun[] harga_makanan;
		private static byte id=0;
		
		public Restaurant() {
//			nama_makanan = new String[10];
//			harga_makanan = new double[10];
//			stok = new int[10];
			makanan_resto = new tuageun[10];	
//			stok_makanan= new tuageun[10];
//			harga_makanan = new tuageun[10];
			
		}

		public void tambahMenuMakanan(String nama, double harga, int stok) {
			makanan_resto[id] = new tuageun();
			makanan_resto[id].setNama_makanan(nama);
			makanan_resto[id].setStok(stok);
			makanan_resto[id].setHarga_makanan(harga);
//			this.harga_makanan[id] = harga;
//			this.stok[id]=stok;
		}
		
		public void tampilMenuMakanan() {
			System.out.println("--------------------------------");
			System.out.println("MENU");
			System.out.println("--------------------------------");
			for(int i =0; i<=id;i++) {
				int a = i;
				if(!isOutOfStock(i)) {
					a++;
					System.out.println(a + ". " + makanan_resto[i].getNama_makanan() + "[" + makanan_resto[i].getStok() + "]" + "\tRp." + makanan_resto[i].getHarga_makanan());
				}else {
					a++;
					System.out.println(a + ". " + makanan_resto[i].getNama_makanan() + "\t\t Stock Habis");
				}			
			}
			
		}
		
		public void beliMakanan(int inputan, int quantity) {	
			if(!isOutOfStock(inputan)) {		
				makanan_resto[inputan].setStok(makanan_resto[inputan].getStok() - quantity);
				System.out.println(makanan_resto[inputan].getNama_makanan() + "\t\t" + makanan_resto[inputan].getStok() );
				TotalHarga(inputan,quantity);
			}else {
			
			}
		}
		
		public void TotalHarga(int id_harga, int jumlahbeli) {
			double TotalBayar = makanan_resto[id_harga].getHarga_makanan() * jumlahbeli;
			System.out.println("Total Harga :" + TotalBayar);
		}
		
		public boolean isOutOfStock(int id) {
			if(makanan_resto[id].getStok() == 0) {
				return true;
			}else {
				return false;
			}
		}		
		
		public void tambahMakanan() {
			this.tambahMenuMakanan("Bala-Bala", 1_000,20);
			Restaurant.nextId();
			this.tambahMenuMakanan("Gehu", 1_000, 20);
			Restaurant.nextId();
			this.tambahMenuMakanan("Tahu", 1_000, 0);
			Restaurant.nextId();
			this.tambahMenuMakanan("Molen", 1_000, 20);		
			Restaurant.nextId();
			this.tambahMenuMakanan("Bala-Bala", 1_000,20);
			Restaurant.nextId();
			this.tambahMenuMakanan("UbiGoreng", 4_000, 20);
			Restaurant.nextId();
			this.tambahMenuMakanan("Combro", 2_000, 0);
			Restaurant.nextId();
			this.tambahMenuMakanan("Cireng", 1_000, 20);	
			Restaurant.nextId();
			this.tambahMenuMakanan("Tempe", 2_000, 0);
			Restaurant.nextId();
			this.tambahMenuMakanan("Donat", 5_000, 20);	
		}
		
		public static void nextId() {
			id++;
		}
}
