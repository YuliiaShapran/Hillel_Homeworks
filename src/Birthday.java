
import java.time.LocalDate;
import java.time.Period;

public class Birthday {
    public static void main(String[] args) {
        LocalDate birth = LocalDate.of(1993, 11, 12);
        LocalDate current = LocalDate.now();
        Period diff = Period.between(birth, current);
        System.out.println("The difference is = " + diff.getYears() + "years " + diff.getMonths() + "months " + diff.getDays() + "days ");



    }
}
