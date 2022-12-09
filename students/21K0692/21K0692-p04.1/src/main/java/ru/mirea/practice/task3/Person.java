package EX3;

public class Person {
    public String fullName;
    public int age;

    Person() {
    }

    Person(String fullName, int age) {
        fullName = this.fullName;
        age = this.age;
    }

    public String talk(String fullName) {
        return fullName + "is speaking";
    }

    public String move(String fullName) {
        return fullName + "is walking";
    }
}
