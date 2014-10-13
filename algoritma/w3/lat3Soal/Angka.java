package lat3Soal;

public class Angka {
	int banyak;
	int bilangan[];
	Angka(){
		banyak = 10;
		bilangan = new int[banyak];
	}
	Angka(int size){
		banyak = size;
		bilangan = new int[size];
	}
	public boolean cekAngka(int nilai){
		for (int i = 0; i < bilangan.length; i++){
			if (bilangan[i] == nilai)
				return true;
		}
		return false;
	}
	public int ukuran(){
		return bilangan.length;
	}
	public void printIsi(){
		for (int i = 0; i < bilangan.length; i++){
			System.out.print(bilangan[i]);
		}
		System.out.println();
	}
}
