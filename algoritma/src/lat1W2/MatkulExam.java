package lat1W2;

public class MatkulExam extends MataKuliah {

	double tugas;
	double quiz;
	double uts;
	double uas;
	double absen;
	
	MatkulExam(){
		tugas = 0;
		quiz = 0;
		uts = 0;
		uas = 0;
		absen = 0;
	}
	MatkulExam(int kode, String nama, int SKS, int semester){
	}
	MatkulExam(double nilaiTugas, double nilaiQuiz, double nilaiUts, double nilaiUas, double nilaiAbsen){
		tugas = nilaiTugas;
		quiz = nilaiQuiz;
		uts = nilaiUts;
		uas = nilaiUas;
		absen = nilaiAbsen;
	}
	private double nilaiAkhir(){
		return ((tugas*0.10)+(quiz*0.15)+(uts*0.30)+(uas*0.30)+(absen*0.15));
	}
	public String kelulusan(){
		if (nilaiAkhir() >= 56)
			return "LULUS";
		else
			return "TIDAK LULUS";
	}
}
