
public class ParentsClass {
	private int hasil;// harus di luar object
	 String pembukaan;
	
	public ParentsClass(String pembukaan) {
		this.pembukaan= pembukaan;
	}
		public int getluas(int panjang,int lebar) {
		 
		 int hasilnya;
		hasil=panjang*lebar;
		
		return hasil;
	}
	void luas() {
		System.out.println("hasilnya adalah"+ hasil);//membaca dari private hasil
	}
}
