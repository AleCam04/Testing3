import java.time.*;
import java.time.format.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        try{
            OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
            String dateLong = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.ITALY));
            System.out.println(dateLong);
        } catch (DateTimeException e){
            System.err.println("Il formato è sbagliato");
        }
    }
}