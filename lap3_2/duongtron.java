package lap3_2;
import java.util.Scanner;
public class duongtron extends diem{
	protected int r;
    public duongtron( int x, int y, int r){
        super(x, y);
        this.r=r;
        diem DT1 = new diem(0, 0);
    }
    public void nhapDT() {
		Scanner sc = new Scanner(System.in);
		nhapDiem();
		System.out.print("Nhap ban kinh r :");
		r=sc.nextInt();
		this.r=r;
	}
	public double chuViDT() {
		return Math.PI*r*2;
	}
	public double dienTichDT() {
		return Math.pow(r, 2)*Math.PI;
	}
}
