//Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
//z(1+2i) и z(3,+4i); i^2 = -1
//Сложение (1+2i) + (3+4i) = z(4+6i);
// Умножение (1+2i)(3+4i) = 3+12i+6i+12i^2 = 3+18i-3 = +18i;
// для деления нужно домножить на сопряженное число делителя (сопряженное значит мнимая часть (с i) с противоположным знаком)
// Деление (1+2i) _ (1+2i)(3-4i) _  3-4i+6i-8i^2 _ 11+2i _ 11+2i _ 11 + 2i.
//         (3+4i) - (3+4i)(3-4i) -    3^2-4i^2   - 9+16  -  25   - 25 + 25'

import java.io.IOException;

import view.CalculationView;

public class Main {
    public static void main(String[] args) throws SecurityException, IOException{
        new CalculationView().Start();

    }
}