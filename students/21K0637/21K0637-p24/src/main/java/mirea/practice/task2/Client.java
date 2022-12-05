package mirea.practice.task2;

public class Client {
    Chair chair;

    public void sit() {
        System.out.println("sit on ");
        chair.getMaterial();
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
