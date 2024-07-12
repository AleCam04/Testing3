import org.junit.*;
import java.time.*;
import java.time.format.*;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    private Main testing = new Main();

    OffsetDateTime testDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    public void Test() {
        String dateLong = testDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.ITALY));
        assertEquals("1 marzo 2023", dateLong, "Controlla se il formato della data sia corretto");
    }

    @Test
    public void testException() {
        assertThrows(DateTimeParseException.class, () ->
        {OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-0113:00:00Z");
            },"Controlla se il formato è sbagliato viene lanciata l'eccezione");
    }
}