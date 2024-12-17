import java.util.Scanner;

class Line  {
    private final int x1, y1, x2, y2;

    // Constructor to initialize line endpoints
    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // UC-1: Method to calculate the length of the line
    public double calculateLength() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
public class LineComparisonProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Scanner scanner = new Scanner(System.in);

        // Input for the first line
        System.out.println("Enter coordinates of Line 1 (x1 y1 x2 y2): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        // UC-1: Calculate the length of a line
        Line line1 = new Line(x1, y1, x2, y2);
        System.out.printf("Length of Line 1: %.2f%n", line1.calculateLength());
    }

}


