package controller;

import model.ComplexNum;
import service.ComplexNumService;

public class ComplexNumController {
    private ComplexNumService complexNumService = new ComplexNumService();

    public ComplexNum createComplexNum(int n, int ni) {
        return complexNumService.createComplexNum(n, ni);
    }
}
