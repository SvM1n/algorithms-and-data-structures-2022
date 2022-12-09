package EX1;
import java.util.Locale;
public class MAin {
    public static void printInfo(EX_1.Seasons season) {
        System.out.printf(Locale.ROOT, "%s %s, ", season.name(), season);
        season.getDescription();
    }
    public void main (String [] args){
        for (EX_1.Seasons season : EX_1.Seasons.values()) {
            printInfo(season);
        }
        System.out.print("\nЛюбимое время года: ");
        printInfo(EX_1.Seasons.valueOf("SPRING"));

    }




}
