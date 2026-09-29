

import java.util.Scanner;

public class NhanVien {
    private String hoTen;
    private String chucVu;
    private int soNgay;
    private long luongcb;
    public NhanVien() {
    }
    public double getPhuCap(String chucVu) {
        switch (chucVu.trim().toUpperCase()) {
            case "GD":
                return 250000;
            case "PGD":
                return 200000;
            case "TP":
                return 180000;
            case "NV":
                return 150000;
            default:
                return 0;
        }
    }
    public double getThuNhap(int soNgay){
        double luong = (double) luongcb * soNgay;
        if (soNgay >= 25) {
            luong *= 1.2;
        } else if (soNgay >= 22) {
            luong *= 1.1;
        }
        return luong + getPhuCap(chucVu);

    }
    public String chuanHoa(String hoTen) {
        String[] list = hoTen.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < list.length; i++) {
            StringBuilder tmp = new StringBuilder(list[i].toLowerCase());
            tmp.setCharAt(0, Character.toUpperCase(tmp.charAt(0)));
            if (i > 0) {
                ans.append(" ");
            }
            ans.append(tmp);
        }

        return ans.toString();
    }
    public void input(Scanner in){
        hoTen = in.nextLine();
        luongcb = in.nextLong();
        soNgay = in.nextInt();
        in.nextLine();
        chucVu = in.nextLine();
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        NhanVien nv=new NhanVien();
        nv.input(in);
        System.out.println(nv);
    }

    @Override
    public String toString() {
        return chuanHoa(hoTen) + " "
                + String.format("%.1f", (double) luongcb * soNgay) + " "
                + String.format("%.1f", getPhuCap(chucVu)) + " "
                + String.format("%.1f", getThuNhap(soNgay));
    }
}
