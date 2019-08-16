package entity;

public class Main {
	public static void main(String[] args) {
		ChuNhat nhat1 = new ChuNhat();
		nhat1.setDai(10);
		nhat1.setRong(7);
		nhat1.Xuat();
		ChuNhat vuong = new Vuong();
		vuong.setRong(10);
		vuong.setDai(vuong.getRong());
		vuong.Xuat();
	}
}
