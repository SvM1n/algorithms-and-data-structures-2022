package mirea.practice.task5to6;

public class ThrowsDemo {
    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return key;
    }

    public void getMessage(String key) {
        try {
            System.out.println("get key: " + getDetails(key));
        } catch (NullPointerException nullPointerException) {
            System.out.println("Error: key is null");
        }

    }
}
