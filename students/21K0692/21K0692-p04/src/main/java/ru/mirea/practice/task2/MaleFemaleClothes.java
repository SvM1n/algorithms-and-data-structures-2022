package EX2;

public class MaleFemaleClothes {
    interface MenClothing{
        default void Man(){
            System.out.print("Dressing man");
        }
    }
    interface WomanClothing{
        default void Woman(){
            System.out.print("Dressing woman");
        }
    }
}
