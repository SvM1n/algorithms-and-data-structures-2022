package EX2;

public class Phone {
    String number;
    String model;
    double weight;

    Phone() {
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public double getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

   /* public void setNumber() {number = this.number;}

    public void setWeight() {weight = this.weight;}

    public void setModel() {
        model = this.model;
    }*/

    public String receiveCall(String name) {
        return name + " is calling";
    }

    public String receiveCall(String name, String number) {
        return name + ' ' + number + ' ' + "is calling";
    }

    public String sendMessage(String... number) {
        for (int i = 0; i < number.length; i++)
            return number[i];
        return "Hello";
    }

}
