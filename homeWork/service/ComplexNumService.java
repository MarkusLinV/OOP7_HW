package service;

import model.ComplexNum;

public class ComplexNumService {

    public ComplexNumService() {
    }

    public ComplexNum createComplexNum(int n, int ni){
        return new ComplexNum(n, ni);
    }

    public ComplexNum ConjugateCompNum(ComplexNum n){
        return new ComplexNum(n.getI1(), -n.getI2());
    }
}