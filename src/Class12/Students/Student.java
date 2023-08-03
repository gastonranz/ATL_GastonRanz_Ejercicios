package Class12.Students;

import java.util.List;

public class Student {
    private String name;
    private String lastName;
    private String email;
    private String phone;

    private List<Subject> subject;

    private Integer id;
    private static Integer idPlus = 0;

    public Student (String name, String lastName, String email, String phone, List<Subject> subject) {
        idPlus++;
        this.id = idPlus;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Subject> getSubject() {
        return this.subject;
    }

    public Float promedioStudent() {
        Float grade = 0f;
        for(int i = 0; i < subject.size(); i++) {
            grade += this.subject.get(i).getGrade();
        }
        return grade / this.subject.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", subject=" + subject + '}';
    }
}
