package controller;

import model.ComplexNum;
import service.CalculationComplexNumService;

public class CalculationComplexNumController {
    private CalculationComplexNumService calculationComplexNumService = new CalculationComplexNumService();

    public ComplexNum SumComplexNum(ComplexNum n1, ComplexNum n2) {
        return calculationComplexNumService.SumComplexNum(n1, n2);
    }

    public ComplexNum MultiplierComplexNum(ComplexNum n1, ComplexNum n2) {
        return calculationComplexNumService.MultiplierComplexNum(n1, n2);
    }

    public ComplexNum DivisionComplexNum(ComplexNum n1, ComplexNum n2) {
        return calculationComplexNumService.DivisionComplexNum(n1, n2);
    }
}