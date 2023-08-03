package Class13;

import java.io.IOException;

public class Rectangle extends Figure {

    public Rectangle() throws IOException {
        this.rectangleDimension("height", true);
        this.rectangleDimension("width", false);
        this.operation();
    }

    private void rectangleDimension(String name, boolean sizeType) throws IOException {
        Float size = 0f;
        if(sizeType) {
            System.out.println("Perfect! You've chosen a Rectangle!\n" +
                    "Now let's build it! Type the " + name + " of its 2 sides on \"cm\":");
            size = this.floatNumberScanner();
        } else {
            System.out.println("Great! Now type the " + name + " of its 2 sides on \"cm\":");
            size = this.floatNumberScanner();
        }

        while(size < 0) {
            System.out.println("Please, type a positive number! Type the size again:");
            size = this.floatNumberScanner();
        }

        if(sizeType) {
            this.setSide1(size);
        } else if(sizeType == false) {
            this.setSide2(size);
        }
    }

    public void operation() throws IOException {
        Integer choiceNum = 0;
        System.out.println("Great! It's height is " + this.getSide1() + "cm. and it's width is " + this.getSide2() + "cm. Now" +
                " what do you want to do?\n" +
                "Type 1 to calculate the Perimeter of your Rectangle:\n" +
                "Type 2 to calculate the Area of your Rectangle:");
        choiceNum = this.integerNumberScanner();

        while(choiceNum < 1 || choiceNum > 2) {
            System.out.println("Please, type a number between 1 and 2!\n" +
                    "Type 1 to calculate the Perimeter of your Rectangle:\n" +
                    "Type 1 to calculate the Area of your Rectangle:");
            choiceNum = this.integerNumberScanner();
        }

        if(choiceNum == 1) {
            System.out.println("The Perimeter of your Rectangle is: " + this.calculoPerimetro() + "cm.");
        } else if(choiceNum == 2) {
            System.out.println("The Area of your Rectangle is: " + this.calculoArea() + "cm.");
        }
    }

    public Float calculoPerimetro() {
        return (this.getSide1() * 2) + (this.getSide2() * 2);
    }

    public Float calculoArea() {
        return this.getSide1() * this.getSide2();
    }
}