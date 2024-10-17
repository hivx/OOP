public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    public static final double LUONG_MAX = 50000;

    // Phương thức khởi tạo với các tham số cần thiết
    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    // Phương thức tăng lương
    public boolean tangLuong(double tangHeSoLuong) {
        if ((heSoLuong + tangHeSoLuong) * luongCoBan <= LUONG_MAX) {
            heSoLuong += tangHeSoLuong;
            return true;
        }
        return false;
    }

    // Phương thức tính lương
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    // Phương thức in thông tin nhân viên
    public void inTTin() {
        System.out.println("Tên nhân viên: " + tenNhanVien);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Lương hiện tại: " + tinhLuong());
    }
}
