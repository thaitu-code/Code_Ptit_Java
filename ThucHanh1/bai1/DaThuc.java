package ThucHanh1.bai1;

import java.util.Scanner;

public class DaThuc {

    private int n;
    private double[] a;

    public DaThuc(int n){
        this.n = n;
        this.a = new double[n + 1];
    }
    public DaThuc(double[] a){
        this.a = a;
        n = a.length - 1;
    }
    public int getBac() {
        return n;
    }

    public double[] getA() {
        return a;
    }
    public void input(Scanner in){
        for(int i = 0; i <= n; i++){
            a[i] = in.nextDouble();
        }
    }
    public void out(){
        for(int i = 0; i <= n; i++){
            System.out.printf("%.1f * X^%d", a[i], i);
            if(i != n){
                System.out.print(" + ");
            }
            else{
                System.out.println();
            }
        }
    }
    public DaThuc nhan(DaThuc b){
        int bacMoi = this.n + b.n;
        double[] c = new double[bacMoi + 1];
        for(int i = 0; i <= this.n; i++){
            for(int j = 0; j <= b.n; j++){
                c[i + j] += this.a[i] * b.a[j];
            }
        }
        return new DaThuc(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        DaThuc u = new DaThuc(n);
        u.input(sc);
        u.out();
        int m=sc.nextInt();
        DaThuc v = new DaThuc(m);
        v.input(sc);
        v.out();
        DaThuc t = u.nhan(v);
        t.out();
    }
}
