package EX5;

public class Dog {
    private String name;
    private int age;
    public Dog (String name, int age) {
        this.name = name;
        this.age=age;
    }
    public Dog () {
    }
    public String getname (String name){
        return name;
    }
    public void setname (String name){
        this.name = name;
    }
    public int getage (int age){
        return age;
    }
    public void setage (int age){
        this.age = age;
    }
    public void age_to_human (){
        setage(age*7);
    }
    @Override
    public  String toString() {
        return " {name " + name +
                " age " + age +
                " }";
    }
}
