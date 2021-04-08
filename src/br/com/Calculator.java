package br.com;


class Calculator {
    
    void addition(int numberOne, int numberTwo) {
        int result = numberOne + numberTwo;
        System.out.println("O resultado entre " + numberOne + " + " + numberTwo + ": " + result);
    }
    
    int subtract(int numberThree, int numberFour) {
        System.out.print("O resultado entre " + numberThree + " - " + numberFour + ": ");
        return numberThree - numberFour;
    }
    
    double division(double numberFive, double numberSix) {
        System.out.print("O resultado entre " + numberFive + " ÷ " + numberSix + ": ");
        return numberFive / numberSix;
    }
    
    double multiplication(double numberSeven, double numberEight) {
        System.out.print("O resultado entre " + numberSeven + " x " + numberEight + ": ");
        return numberSeven * numberEight; 
    }
    
    double squareRoot(double numberNine) {
        if (numberNine >= 0) {
            System.out.print("Raíz quadrada de " + numberNine + ": ");
            return Math.sqrt(numberNine);
        }
        System.out.print("O número informado é negativo, por isso o resultado retornado é zero: ");
        return 0.0;
    }
    
    double rootCubic(double numberTen) {
        System.out.print("Raíz cúbica de " + numberTen + ": ");
        return Math.cbrt(numberTen);
    }
    
    double squared(double numberEleven) {
        System.out.print(numberEleven + " elevado 2 :");
        return Math.pow(numberEleven, 2);
    }
    
    
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        calculator.addition(5, 8);
        System.out.println(calculator.subtract(9, 3));
        System.out.println(calculator.division(8.0, 2.0));
        System.out.println(calculator.multiplication(9.0, 18.0));
        System.out.println(calculator.squareRoot(9.0));
        System.out.println(calculator.rootCubic(8.0));
        System.out.println(calculator.squared(10.0));
        
    }
}
