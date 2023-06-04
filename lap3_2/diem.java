package lap3_2;
import java.util.Scanner;
public class diem {
	 protected int x, y;
	    public diem(int x, int y) {
		    this.x = x;
		    this.y = y;
		}
		public void nhapDiem() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhap x: ");
			x=sc.nextInt();
			System.out.print("Nhap y: ");
			y=sc.nextInt();

		}
		public void inDiem() {
			System.out.println("("+x+","+y+")");
		}
	}