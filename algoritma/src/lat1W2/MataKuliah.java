package lat1W2;

public class MataKuliah {
	int kode;
	String namaMatkul;
	int jmlSKS;
	int semester;
	
	MataKuliah(){
		kode = 0;
		namaMatkul = "";
		jmlSKS = 0;
		semester = 0;
	}
	
	MataKuliah(int kodeMatkul,String nama, int SKS, int smt){
		kode = kodeMatkul;
		namaMatkul = nama;
		jmlSKS = SKS;
		semester = smt;
	}
	public void setKode(int kodeMatkul){
		kode = kodeMatkul;
	}
	public void setNama(String nama){
		namaMatkul = nama;
	}
	public void setSKS(int SKS){
		jmlSKS = SKS;
	}
	public void setSemester(int smt){
		semester = smt;
	}
}
