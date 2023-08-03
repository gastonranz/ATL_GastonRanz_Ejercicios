package Class12.Students;

import java.util.Scanner;

public class Subject {
    private String name;
    private Float grade;

    public Subject() {
        this.setName();
        this.setGrade();
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a subject name:");
        String name = input.nextLine();

        while(name.equalsIgnoreCase("null")) {
            System.out.println("Please, don't use a \"null\" value!");
            name = input.nextLine();
        }
        this.name = name;
    }

    public Float getGrade() {
        return this.grade;
    }

    public void setGrade() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the " + this.name + " grade of this student:");
        Float grade = input.nextFloat();

        while(grade <= 0) {
            if(grade == 0) {
                System.out.println("Please type a grade bigger than 0:");
                grade = input.nextFloat();
            } else {
                System.out.println("please, type a positive grade number:");
                grade = input.nextFloat();
            }
        }
        System.out.println("---- Subject and Grade created successfully ----");
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
