package entity;

public class ChuNhat {
	double rong;
	double dai;
	double getChuVi() {
		return rong*2+dai*2;
	}
	double getDienTich() {
		return rong*dai;
	}

	public void Xuat() {
		String info= "ChuNhat [rong=" + rong + ", dai=" + dai + ", getChuVi()=" + getChuVi() + ", getDienTich()="
				+ getDienTich() + "]";
		System.out.println(info);
	}
	public double getRong() {
		return rong;
	}
	public void setRong(double rong) {
		this.rong = rong;
	}
	public double getDai() {
		return dai;
	}
	public void setDai(double dai) {
		this.dai = dai;
	}
	
	
}
