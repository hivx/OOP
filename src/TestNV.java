public class TestNV {
    public static void main(String[] args) {
        // Tạo 2 đối tượng của lớp NhanVien
        NhanVien nv1 = new NhanVien("Nguyen Van A", 5000, 5);
        NhanVien nv2 = new NhanVien("Le Thi B", 4000, 4.5);

        // Hiển thị thông tin và lương của nhân viên
        System.out.println("Thông tin nhân viên 1:");
        nv1.inTTin();

        System.out.println("\nThông tin nhân viên 2:");
        nv2.inTTin();

        // Tăng lương cho nhân viên và hiển thị thông tin sau khi tăng lương
        System.out.println("\nTăng lương cho nhân viên 1:");
        if (nv1.tangLuong(1.0)) {
            System.out.println("Tăng lương thành công.");
        } else {
            System.out.println("Tăng lương không thành công do vượt quá LUONG MAX.");
        }
        nv1.inTTin();

        System.out.println("\nTăng lương cho nhân viên 2:");
        if (nv2.tangLuong(0.8)) {
            System.out.println("Tăng lương thành công.");
        } else {
            System.out.println("Tăng lương không thành công do vượt quá LUONG MAX.");
        }
        nv2.inTTin();
    }
}
