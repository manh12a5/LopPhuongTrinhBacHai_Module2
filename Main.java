import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        LopPhuongTrinhBacHai QuadraticEquation = new LopPhuongTrinhBacHai(a, b, c);

        //In ra delta
        double delta = QuadraticEquation.getDiscriminant();
        System.out.println("Delta là: " + QuadraticEquation.getDiscriminant());

        //Điều kiện delta
        if (delta > 0) {
            System.out.println("PT có nghiệm 1 là: " + QuadraticEquation.getRoot1());
            System.out.println("PT có nghiệm 2 là: " + QuadraticEquation.getRoot2());
        } else {
            System.out.println("Phương trình có nghiệm = 0");
        }

    }
}
