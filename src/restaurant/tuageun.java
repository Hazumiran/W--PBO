package restaurant;

public class tuageun {
	private String nama_makanan;
	private int stok;
	private double harga_makanan;
	// object == variabel kalo di c
	// method == func atau prosedure
	// biar lebih paham saya kasih komentar pak, soalnya saya suka bingung dan kadang terbalik hehe
	
	//object
	public String getNama_makanan() {
		return nama_makanan;
	}
	public void setNama_makanan(String nama_makanan) {
		this.nama_makanan = nama_makanan;
	}
	public double getHarga_makanan() {
		return harga_makanan;
	}
	public void setHarga_makanan(double harga_makanan) {
		this.harga_makanan = harga_makanan;
	}
	public int getStok() {
		return stok;
	}
	public void setStok(int stok) {
		this.stok = stok;
	}
	
	
}
