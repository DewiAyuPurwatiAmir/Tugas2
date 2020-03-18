public class coba{

	//mendeklarasikan
	int a;
	double b;

	coba(){
	a=17;
	b=10.5;

	}
	coba (int nilai1, double nilai2){
		a=nilai1;
		b=nilai2;
	}
	public static void main(String[] args){
	coba tampil=new coba();
	coba tampil1=new coba(17,10.5);

	System.out.println(tampil.b);
	System.out.println(tampil1.a);
	}
}

