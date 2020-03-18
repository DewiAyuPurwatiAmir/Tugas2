public class jam{

	int totalDetik, detikSekarang, totalMenit, menitSekarang, totalJam, jamSekarang;
	
	jam(){

		totalDetik=17032001;
		detikSekarang=totalDetik%60;
		totalMenit=totalDetik/60;
		menitSekarang=totalMenit%60;
		totalJam=totalMenit/60;
		jamSekarang=totalJam%24;
	}
	public static void main(String[] args){
	jam tampil= new jam();
	
	System.out.println(+tampil.jamSekarang +" jam "+tampil.menitSekarang+" menit "+tampil.detikSekarang+" detik ");
	}

}