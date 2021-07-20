public class SimpleCalculations {

    public static void main(String[] args) {

        int firstNum = 1337;

        double secondNum = 2442.2442;

        System.out.println("Addition: " + firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
        System.out.println("Subtraction: " + firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
        System.out.println("Multiplication: " + firstNum + " x " + secondNum + " = " + (firstNum * secondNum));
        System.out.println("Division: " + firstNum + " + " + secondNum + " = " + (firstNum / secondNum));

        double modResult = firstNum%secondNum;

        System.out.printf("Modulo: %d mod %f = %f", firstNum, secondNum, modResult);

    }

}
