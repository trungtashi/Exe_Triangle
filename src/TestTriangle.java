import java.util.Scanner;
public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter edge first ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter edge second");
        double side2 = scanner.nextDouble();
        System.out.println("Enter edge last");
        double side3 = scanner.nextDouble();
        CheckTriangle checkTriangle = new CheckTriangle(side1,side2,side3);
        System.out.println(checkTriangle.showTriangleIs());
    }
}
