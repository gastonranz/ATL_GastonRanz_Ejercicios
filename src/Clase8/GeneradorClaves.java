package Clase8;

public class GeneradorClaves {
    public static void main(String[] args) {
        GeneradorClaves.executeProgram();
    }

    private static void executeProgram() {
        String[] password = new String[15];

        for(int i = 0; i < password.length; i++) {
            int num = (int) (Math.floor(Math.random() * (3) + 1));
            int j = 0;

            if (num == 1) {
                while (j < GeneradorClaves.passwordGenerate().length) {
                    password[i] = GeneradorClaves.passwordGenerate()[j];
                    i++;
                    j++;
                }
            } else if (num == 2) {
                while (j < GeneradorClaves.passwordGenerate2().length) {
                    password[i] = GeneradorClaves.passwordGenerate2()[j];
                    i++;
                    j++;
                }
            } else if(num == 3) {
                while(j < GeneradorClaves.passwordGenerate4().length) {
                    password[i] = GeneradorClaves.passwordGenerate4()[j];
                    i++;
                    j++;
                }
            } else {
                while(j < GeneradorClaves.passwordGenerate3().length) {
                    password[i] = GeneradorClaves.passwordGenerate3()[j];
                    i++;
                    j++;
                }
            }
            i--;
        }

        System.out.print("Your Password is: \"");

        for(int i = 0; i < password.length; i++) {
            System.out.print(password[i]);
        }
        System.out.print("\"");
    }

    private static String[] passwordGenerate() {
        String[] password = new String[5];
        String abc = "abcde01234";
        String[] letra = abc.split("");

        for(int i = 0; i < password.length; i++) {
            int num = (int) (Math.random() * 10);
            password[i] = letra[num];
        }
        return password;
    }

    private static String[] passwordGenerate2() {
        String[] password = new String[5];
        String abc = "fghij56789";
        String[] letra = abc.split("");

        for(int i = 0; i < password.length; i++) {
            int num = (int) (Math.random() * 10);
            password[i] = letra[num];
        }
        return password;
    }

    private static String[] passwordGenerate3() {
        String[] password = new String[5];
        String abc = "klmnñopqrs";
        String[] letra = abc.split("");

        for(int i = 0; i < password.length; i++) {
            int num = (int) (Math.random() * 10);
            password[i] = letra[num];
        }
        return password;
    }

    private static String[] passwordGenerate4() {
        String[] password = new String[5];
        String abc = "tuvwxyz168";
        String[] letra = abc.split("");

        for(int i = 0; i < password.length; i++) {
            int num = (int) (Math.random() * 10);
            password[i] = letra[num];
        }
        return password;
    }
}
