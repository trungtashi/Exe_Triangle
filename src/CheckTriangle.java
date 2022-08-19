public class CheckTriangle {
    double side1;
    double side2;
    double side3;

    CheckTriangle(){}

    public CheckTriangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public boolean checkRightTriangle(){
        return side1 * side1 == side2 * side2 + side3 * side3
                || side3 * side3 == side1 * side1 + side2 * side2
                || side2 * side2 == side1 * side1 + side3 * side3;
    }
    public boolean checkIsoscelesTriangle(){
        return (side1 == side2 || side2 == side3 || side1 == side3) && !checkEquilateralTriangle() ;
    }
    public boolean checkTriangle(){
        return side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2;
    }
    public boolean checkEquilateralTriangle(){
        return side1 == side2 && side1 == side3;
    }
    public String showTriangleIs(){
        if (checkTriangle()){
            if (checkEquilateralTriangle())
                return "Equilateral triangle";
            else if (checkRightTriangle() && !checkIsoscelesTriangle()) {
                return "Right triangle";
            } else if (checkRightTriangle() && checkIsoscelesTriangle()) {
                return "Triangle right angle";
            } else if (checkIsoscelesTriangle() && !checkRightTriangle()) {
                return "Right triangle";
            }
            else return "Triangle";
        }
        else return "Not Triangle";
    }
}
