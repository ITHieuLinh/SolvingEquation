package controller;

import common.Algorithm;
import common.Validation;
import java.util.List;
import view.Menu;

public class SolvingEquation extends Menu<String> {

    static String[] mc = {"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"};
    Validation validation;
    Algorithm algorithm;
    double a;
    double b;
    double c;

    public SolvingEquation() {
        super("--- EQUATION PROGRAM ---", mc);
        validation = new Validation();
        algorithm = new Algorithm();

    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                calculateSuperlativeEquation();
                break;
            case 2:
                calculateQuadraticEquation();
                break;
            case 3:
                System.exit(0);
        }
    }

    public void calculateSuperlativeEquation() {
        System.out.print("Enter A: ");
        a = validation.validateDouble();
        System.out.print("Enter B: ");
        b = validation.validateDouble();
        List<Double> list = algorithm.doSuperlativeEquation(a, b);
        algorithm.findEvenOddSquareNumber(list);
    }

    public void calculateQuadraticEquation() {
        System.out.print("Enter A: ");
        a = validation.validateDouble();
        System.out.print("Enter B: ");
        b = validation.validateDouble();
        System.out.print("Enter C: ");
        c = validation.validateDouble();
        List<Double> list = algorithm.doQuadraticEquation(a, b, c);
        algorithm.findEvenOddSquareNumber(list);
    }
}
