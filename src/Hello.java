import javax.swing.JOptionPane;

public class Hello{

	public static void main(String[] args){
	int nilai, a, b;
	String str=JOptionPane.showInputDialog("Masukkan nilai :");
	nilai=Integer.parseInt(str);
	b = 100;
	a= 100 + nilai;
	System.out.println(a+b);
	Siswa siswa = new Siswa();
	siswa.info();
	System.exit(0);

	}
}

class Siswa{
	public int nrp;
	public String nama;
	public void info() {
	 System.out.println("Ini siswa PENS");
}

}
