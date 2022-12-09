package ru.mirea.worknineteen.task1;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        User user1 = new User("John", "541457615442");
        user1.checkInn();
    }
}
