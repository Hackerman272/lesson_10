package geometry;

import customExceptions.IllegalTriangleException;

public class TriangleNew {
    private double sideA;
    private double sideB;
    private double sideC;


    public TriangleNew(double sideA, double sideB,
                       double sideC) throws IllegalTriangleException {
        try {
            if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
                throw new IllegalArgumentException("Each slide must be greater than 0");
            }
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
            if (!isValid()) {
                throw new IllegalArgumentException("The triangle does not conform to the inequality theorem");
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalTriangleException("Error msg…", e);
        }
    }

    public boolean isValid() {
        return (sideA + sideB > sideC) &&
                (sideA + sideC > sideB) &&
                (sideB + sideC > sideA);
    }


    public double getArea() {
// Semiparameter.
        double s = 0.5 * (sideA + sideB + sideC);
// Heron's formula for area.
        return Math.sqrt(
                s * (s - sideA) * (s - sideB) * (s - sideC)
        );
    }
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}