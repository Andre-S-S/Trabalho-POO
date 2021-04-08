package br.com;

public class LaserTrain {
    
    void perimeter(double measureOne, double measureTwo, double measureThree, double measureFour) {
        double sum = measureOne + measureTwo + measureThree + measureFour;
        System.out.println("A soma do perímetro é: " + sum + "m");
    }
    
    double area(double measureOne, double measureTwo) {
        System.out.print("O calculo da área é: ");
        return measureOne * measureTwo;
    }
    
    double volume(double measureOne, double measureTwo, double measureThree) {
        System.out.print("O valor do volume é: ");
        return measureOne * measureTwo * measureThree;
    }
    
    double indirectMeasurementTwoMeasures(double hypotenuse, double collegiate) {
        double hypotenuseOne = Math.pow(hypotenuse, 2);
        double collegiateOne = Math.pow(collegiate, 2);
        double result = hypotenuseOne - collegiateOne;
        if (hypotenuse > collegiate) {
            System.out.print("A dimensão do segundo cateto é: ");
            return Math.sqrt(result);
        }
        System.out.print("O comprimento não pode ser maior ou igual a hipotenusa, por isso o resultado retornado é zero: ");
        return 0.0;
    }
    
    double IndirectMeasurementThreeMeasurements(double hypotenuseOne, double hypotenuseTwo, double collegiate) {
        double hypotenuseThree = Math.pow(hypotenuseOne, 2);
        double hypotenuseFour = Math.pow(hypotenuseTwo, 2);
        double collegiateOne = Math.pow(collegiate, 2);
        double resultOne = Math.sqrt(hypotenuseThree - collegiateOne);
        double resultTwo = Math.sqrt(hypotenuseFour - collegiateOne);
        
        if ((hypotenuseOne > collegiate) && (hypotenuseTwo > collegiate)) {
            System.out.print("A soma da dimensão do dois cateto é: ");
            return resultOne + resultTwo;
        }
        if ((hypotenuseOne > collegiate) || (hypotenuseTwo > collegiate)) {
            System.out.print("A soma da dimensão foi parcial, a medida da hipotenusa 1 ou 2, é menor ou igual a do cateto: ");
            return resultOne + resultTwo;
        }
        System.out.print("O comprimento não pode ser maior ou igual a hipotenusa, por isso o resultado retornado é zero: ");
        return 0.0;
    } 
    
    public static void main(String[] args) {
        LaserTrain laserTrain = new LaserTrain();
        
        double measureOne = 5.0;
        double measureTwo = 5.0;
        double measureThree = 4.0;
        double measureFour = 4.8;
        
        laserTrain.perimeter(measureOne, measureTwo, measureThree, measureFour);
        System.out.println(laserTrain.area(measureOne, measureTwo) + "m²");
        System.out.println(laserTrain.volume(measureOne, measureTwo, measureThree) + "m³");
        System.out.println(laserTrain.indirectMeasurementTwoMeasures(measureOne, measureThree) + "m");
        System.out.println(laserTrain.IndirectMeasurementThreeMeasurements(measureOne, measureTwo, measureThree)+"m");
    }
}
