package Class13;

import java.io.IOException;

public class Square extends Figure {
    public Square() throws IOException {
        this.squareSize();
    }

    private void squareSize() throws IOException {
        boolean value = false;
        System.out.println("Perfect! You've chosen a Square!\n" +
                "Now let's build it! Type the size of its side on \"cm\":");
        Float size = this.floatNumberScanner();
        if(size > 0) {
            this.setSide1(size);
            value = true;
        } else {
            while(value == false) {
                System.out.println("Please, type a bigger number than \"0\"! Type the size again:");
                size = this.floatNumberScanner();
                if(size > 0) {
                    value = true;
                }
            }
        }
        this.operation();
    }

    public void operation() throws IOException {
        Integer choiceNum = 0;

        System.out.println("Great! It's size is " + this.getSide1() + "cm. Now what do you want to do?\n" +
                "Type 1 to calculate the Perimeter of your Square:\n" +
                "Type 2 to calculate the Area of your Square:");
        choiceNum = this.integerNumberScanner();

        while(choiceNum < 1 || choiceNum > 2) {
            System.out.println("Please, type a number between 1 and 2!\n" +
                    "Type 1 to calculate the Perimeter of your Square:\n" +
                    "Type 1 to calculate the Area of your Square:");
            choiceNum = this.integerNumberScanner();
        }

        if(choiceNum == 1) {
            System.out.println("The Perimeter of your Square is: " + this.calculoPerimetro() + "cm.");
        } else {
            System.out.println("The Area of your Square is: " + this.calculoArea() + "cm.");
        }
    }

    private Float calculoPerimetro() {
        return this.getSide1() * 4;
    }

    private Float calculoArea() {
        return (this.getSide1() * this.getSide1());
    }
}
