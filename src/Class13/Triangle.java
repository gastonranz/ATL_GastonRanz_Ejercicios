package Class13;

import java.io.IOException;

public class Triangle extends Figure {/*
    private Float base;
    private Float hipotenusa;

    public Triangle() throws IOException {
        this.triangleSize("side1", 1);
        this.triangleSize("side2", 2);
        this.triangleSize("side3", 3);
        this.operation();
    }

    private void triangleSize(String name, Integer value) throws IOException {
        Float size;
        switch (value) {
            case 1: System.out.println("Perfect! You've chosen a Triangle!\n" +
                    "Now let's build it! Type the size of its 1st side on \"cm\":");
                size = this.floatNumberScanner();
                break;
            case 2: System.out.println("Great! Now type the size of its 2nd side on \"cm\":");
                size = this.floatNumberScanner();
                break;
            default: System.out.println("Awesome! Now let's type the size of its base on \"cm\":");
                size = this.floatNumberScanner();
        }

        while(size < 0) {
            System.out.println("Please, type a positive number! Type the size again:");
            size = this.numberScanner();
        }

        switch (value) {
            case 1: this.side1 = size;
            break;
            case 2: this.side2 = size;
            break;
            case 3: this.side3 = size;
        }
    }

    public void operation() throws IOException {
        Integer choiceNum = 0;

        System.out.println("Great! It's 1st side is " + this.side1 + "cm., it's 2nd side is " + this.side2 +
                "cm., and it's base is " + this.side3 + "\nNow what do you want to do?\n" +
                "Type 1 to calculate the Perimeter of your Triangle:\n" +
                "Type 2 to calculate the Area of your Triangle:");
        choiceNum = Math.round(this.numberScanner());

        while(choiceNum < 1 || choiceNum > 2) {
            System.out.println("Please, type a number between 1 and 2!\n" +
                    "Type 1 to calculate the Perimeter of your Triangle:\n" +
                    "Type 1 to calculate the Area of your Triangle:");
            choiceNum = Math.round(this.numberScanner());
        }

        switch (choiceNum) {
            case 1: System.out.println("The Perimeter of your Triangle is: " + this.calculoPerimetro() + "cm.");
            break;
            case 2: System.out.println("The Area of your Triangle is " + this.calculoArea() + " cm.");
        }
    }

    public Float calculoPerimetro() {
        return this.side1 + this.side2 + this.side3;
    }

    public Float calculoArea() {
        Float high = 0f;
        if(this.side1 == this.side2 || this.side1 == this.side3 || this.side2 == this.side3) {
            this.ordenBaseHipotenusa();
            Float cateto =  this.base / 2;
            high = (this.hipotenusa * this.hipotenusa) - (cateto * cateto);
            return (float) Math.sqrt(high);
        } else {
            this.ordenBaseHipotenusa();
            high = this.calculoAlturaEscaleno();
        }
        return (this.base * high) / 2;
    }

    public void ordenBaseHipotenusa() {
        this.hipotenusa = this.side3;
        this.base = this.side1;
        if(this.side2 > base) {
            this.hipotenusa = this.base;
            this.base = this.side2;
        }
        if(this.side3 > base) {
            this.hipotenusa = this.base;
            this.base = this.side3;
        }
    }

    public Float calculoAlturaEscaleno() {
        Float hipotenusaMenor = this.side1;
        Float hipotenusaMayor = 0f;
        if(this.side2 < hipotenusaMenor) {
            hipotenusaMenor = this.side2;
        }
        if(this.side3 < hipotenusaMenor) {
            hipotenusaMenor = this.side3;
        }

        if(this.side1 > hipotenusaMenor && this.side1 < base) {
            hipotenusaMayor = this.side1;
        }
        if(this.side2 > hipotenusaMenor && this.side2 < base) {
            hipotenusaMayor = this.side2;
        }
        if(this.side3 > hipotenusaMenor && this.side3 < base) {
            hipotenusaMayor = this.side3;
        }

        Float hipotenusaMayor2 = hipotenusaMayor * hipotenusaMayor;
        Float hipotenusaMenor2 = hipotenusaMenor * hipotenusaMenor;
        Float cateto = (hipotenusaMayor2 + (base * base) - hipotenusaMenor2) / (base * 2);
        Float result = hipotenusaMayor2 - (cateto * cateto);
        return (float) Math.sqrt(result);
    }*/
}
