package Class12.Students;

public class Evaluación {
    public static void main(String[] args) {
        Evaluación.first();
        Evaluación.second();
        Evaluación.third();
    }

    private static void first() {
        int total = 1000;
        int num = 0;
        int num2 = 0;

        for(int i = 0; i < total; i++) {
            if(num % 2 != 0) {
                num2 += num;
            }
            num++;
        }
        System.out.println(num2);
    }

    private static void second() {
        int total = 1000;
        int num = 0;
        int num2 = 0;

        for(int i = 0; i < total; i++) {
            if(num % 3 == 0) {
                num2 += num;
            }
            num++;
        }
        System.out.println(num2);
    }

    private static void third() {
        int x = 7 + (5 * 2) % 2 - 1;
        System.out.println(x);

        boolean z = true;
        boolean y = false;
        boolean resultado = z && y || z;
        System.out.println(resultado);
    }
}
