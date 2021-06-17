
public class Main{
	
	public static void main(String[] args) {
		ParentsClass luas= new ParentsClass("HALLO");
		int panjang= 5;
		int lebar= 3, hasil;
		
		 hasil= luas.getluas(panjang,lebar);
		 
		System.out.println(luas.pembukaan);
		
		System.out.println(hasil);
		
		luas.luas();
	}
	
}
