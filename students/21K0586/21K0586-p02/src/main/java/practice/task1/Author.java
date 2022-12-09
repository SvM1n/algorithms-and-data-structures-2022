package practice.task1;

public class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender) {
        this.email = email;
        this.gender = gender;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return this.name + " " + this.email + " " + this.gender;
    }
}

