package asbstractOOP.luyentap;

public class Oto extends PhuongTienDiChuyen{
    private String loaiNhienLieu;
    public Oto( HangSanXuat hangSanXuat,String loaiNhienLieu) {
        super("Oto", hangSanXuat);
        this.loaiNhienLieu =loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 150;
    }
}
