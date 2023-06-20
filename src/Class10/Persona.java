package Class10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Persona {
    private String id;
    private String name;
    private Integer age;
    private Date bornDate;
    private String DNI;

    public Persona(String id, String name, Integer age, Date bornDate, String DNI) throws IOException {
        this.setId(id);
        this.setName(name);
        this.setAge(age);
        this.setBornDate(bornDate);
        this.setDNI(DNI);
    }

    public Persona() {

    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) throws IOException {
        this.id = this.strValidation(id, "ID");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) throws IOException {
        this.name = this.strValidation(name, "NAME");
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) throws IOException {
        while(age <= 0) {
            if(age == 0) {
                System.out.println("Please, type an age number bigger than \"0\":");
            } else {
                System.out.println("Please, type a positive age number!:");
            }
            age = this.intScanner();
        }
        this.age = age;
    }

    public Date getBornDate() {
        return this.bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getDNI() {
        return this.DNI;
    }

    public void setDNI(String DNI) throws IOException {
        this.DNI = this.strValidation(DNI, "DNI");
    }

    public void isAnAdult() {
        int adult = 18;
        boolean isAnAdult = this.age > adult;
        boolean teenAger = this.age > 13 && this.age < 18;
        boolean kid = this.age > 4 && this.age < 13;

        if(isAnAdult) {
            System.out.println("---- " + this.name + " is an adult ----");
        } else if(teenAger) {
            System.out.println("---- " + this.name + " is a teenager ----");
        } else if(kid) {
            System.out.println("---- " + this.name + " is a kid ----");
        } else {
            System.out.println("---- " + this.name + " is a baby ----");
        }
    }

    private String strScanner() throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        return buffer.readLine();
    }

    private Integer intScanner() throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        String strNum = buffer.readLine();
        return Integer.parseInt(strNum);
    }

    private String strValidation(String data, String name)throws IOException {
        while(data == null || data.equalsIgnoreCase("null")) {
            System.out.println("Please, don't type a \"null\" " + name + " value!");
            data = this.strScanner();
        }
        return data;
    }

    public String toString() {
        return "Persona{" +
                "id= " + this.id + " \\ " +
                "name= " + this.name + " \\ " +
                "age= " + this.age + " \\ " +
                "born date= " + this.bornDate + " \\ " +
                "DNI= " + this.DNI + "\\}";
    }

    /*@Override
    public String toString() {
        return "Persona{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bornDate=" + bornDate +
                ", DNI='" + DNI + '\'' +
                '}';
    }*/
}
