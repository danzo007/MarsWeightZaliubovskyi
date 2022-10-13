package pl.vistula.marsWeightCalc;

public class Main {

    public static void main(String[] args) {

        float weightOnEarthZaliubovskyiFloat, weightOnMarsZaliubovskyiFloat;
        double weightOnMarsZaliubovskyiDouble;
        int weightOnMarsZaliubovskyiInt, answerNumInt;
        char weightOnMarsZaliubovskyiChar;

        weightOnEarthZaliubovskyiFloat = 55.0f;
        weightOnMarsZaliubovskyiFloat = weightOnEarthZaliubovskyiFloat * 0.38f;
        System.out.println(weightOnEarthZaliubovskyiFloat + " kg On Earth is " + weightOnMarsZaliubovskyiFloat + " kg onMars");

        weightOnMarsZaliubovskyiDouble = weightOnMarsZaliubovskyiFloat;
        System.out.print( "Kilograms converted to double: " );
        System.out.printf("%.4f", weightOnMarsZaliubovskyiDouble);

        weightOnMarsZaliubovskyiInt = (int) weightOnMarsZaliubovskyiDouble;
        System.out.println("\n"+"Kilograms converted to int: " + weightOnMarsZaliubovskyiInt);

        weightOnMarsZaliubovskyiChar = (char) weightOnMarsZaliubovskyiInt;
        System.out.println("Kilograms converted to char: " + weightOnMarsZaliubovskyiChar);

        weightOnMarsZaliubovskyiChar *= 10;
        System.out.println("Kilograms converted to char multiply by 10: " + weightOnMarsZaliubovskyiChar);

        answerNumInt = (int)weightOnMarsZaliubovskyiChar;
        System.out.println("char converted to int: " + answerNumInt);






    }
}
