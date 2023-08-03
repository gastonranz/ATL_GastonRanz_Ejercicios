package Class12;

public class EjercicioEvaluacionJueves {
    public static void main(String[] args) {

    }

    private static void exercise1() {
        int num = 0;
        int num2 = 1000;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;

        //1
        for(int i = 0; i < num2; i++) {
            if(num % 2 == 0) {
                num3 += num;
            }
            num++;
        }

        //2
        //Los números menores a 10 y múltiplos de 3 o de 5 son: 3,5,6 y 9. La suma de estos múltiplos es 23.
        // Encuentra la suma de los múltiplos de 3 o 5 menores a 1000. (1 punto)

        for(int i = 0; i < num2; i++) {
            if(num4 % 3 == 0) {
                num5 += num4;
            } else if(num4 % 5 == 0) {
                num5 += num4;
            }
            num4++;
        } //Aquí era múltiplos de 3 o 5!! "o" el número 3, "o" el número 5!!! Faltó más nivel de comprensión!
        //Era un número o el otro, no ambos.

        System.out.println(num3);
        System.out.println(num5);
        System.out.println();

        int numX3 = 0;
        int numX5 = 0;
        int result3 = 0;
        int result5 = 0;
        int result = 0;

        for(int i = 0; i < num2; i++) {
            if(numX3 % 3 == 0) {
                result3 += numX3;
            }
            numX3++;
        }
        for(int i = 0; i < num2; i++) {
            if(numX5 % 5 == 0) {
                result5 += numX5;
            }
            numX5++;
        }

        result = result3 + result5;
        System.out.println(result3);
        System.out.println(result5);
        System.out.println(result);
    }

    private static void exercise2() {
        Integer num = 0;
        Integer num2 = 0;
        Integer result = 0;
        Integer total = 4000000;

        num++;
        num2 = num + 1;
        result = num2 + 1;
        while(result <= 4000000) {
            num = result;
            result += num2;
            num2 = result;
        }
    }
}
