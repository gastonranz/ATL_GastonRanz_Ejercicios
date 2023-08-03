package Class13;

import java.io.IOException;

public class Circle extends Figure {
    private Float radio;

    public Circle() throws IOException {
        this.circleSize();
    }

    private void circleSize() throws IOException {
        System.out.println("Perfect! You've chosen a Circle!\n" +
                "Now let's build it! Type the size of its radio on \"cm\":");
        Float size = this.floatNumberScanner();

        while(size < 0) {
            System.out.println("Please, type a positive number!:");
            size = this.floatNumberScanner();
        }
        this.operation();
    }

    public void operation() throws IOException {
        Integer choiceNum = 0;

        System.out.println("Great! It's radio is " + this.radio + "cm. Now what do you want to do?\n" +
                "Type 1 to calculate the Perimeter of your Circle:\n" +
                "Type 2 to calculate the Area of your Circle:");
        choiceNum = this.integerNumberScanner();

        while(choiceNum < 1 || choiceNum > 2) {
            System.out.println("Please, type a number between 1 and 2!\n" +
                    "Type 1 to calculate the Perimeter of your Circle:\n" +
                    "Type 1 to calculate the Area of your Circle:");
            choiceNum = this.integerNumberScanner();
        }

        if(choiceNum == 1) {
            System.out.println("The Perimeter of your Circle is: " + this.calculoPerimetro() + "cm.");
        } else {
            System.out.println("The Area of your Circle is: " + this.calculoArea() + "cm.");
        }
    }

    public Float calculoPerimetro() {
        return (2 * (float) Math.PI) * this.radio;
    }

    public Float calculoArea() {
        return (float) Math.PI * (this.radio * this.radio);
    }
}
