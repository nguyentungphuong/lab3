package lap3_2;

public class main {
	public static void main(String[] args) {
	    System.out.println("Tam giac: ");
		tamgiac tg= new tamgiac(0, 0);
		tg.nhapTG();
		tg.inTG();
	    tg.KiemTra();
		tg.tinhChuVi();
		tg.tinhDienTich();

		System.out.println("Duong tron: ");
		duongtron dt= new duongtron(0, 0, 0);
		dt.nhapDT();
		System.out.println("Chu vi duong tron: "+dt.chuViDT());
		System.out.println("Dien tich duong tron: "+dt.dienTichDT());
	}
	    }
