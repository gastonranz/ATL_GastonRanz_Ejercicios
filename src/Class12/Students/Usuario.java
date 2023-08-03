package Class12.Students;

public class Usuario {
    private Integer id;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;

    public Usuario(Integer id, String name, String lastName, String email, String password, String phoneNumber) {
        this.setId(id);
        this.setName(name);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setPassword(password);
        this.setPhoneNumber(phoneNumber);
    }

    public Usuario() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if(this.validationInt(id)) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(this.validationStr(name)) {
            this.name = name;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(this.validationStr(lastName)) {
            this.lastName = lastName;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(this.validationStr(email)) {
            this.email = email;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(this.validationStr(password)) {
            this.password = password;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(this.validationStr(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        }
    }

    private boolean validationStr(String data) {
        boolean validation = false;
        if(data.equalsIgnoreCase("null")) {
            System.out.println("Please, don't use a null value!");
        } else {
            validation = true;
        }
        return validation;
    }

    private boolean validationInt(Integer data) {
        boolean validation = false;
        if(data < 0) {
            System.out.println("Please, don't use a negative number!");
        } else {
            validation = true;
        }
        return validation;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
