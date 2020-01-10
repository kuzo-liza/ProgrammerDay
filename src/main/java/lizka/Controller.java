package lizka;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotEmpty;

@RestController
public class Controller {

    @RequestMapping
    public Greeting greeting(@NotEmpty@RequestParam(value="year", required = true, defaultValue = "-1") int year) {
        return ((year <= 999) || (year >= 10000)) ? new Greeting(400, "Bad request")
                : new Greeting(200, getDate(year));
    }

    private String getDate(int year) {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yy");
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(year, 0, 0);
        calendar.add(Calendar.DAY_OF_YEAR, 256);
        date.setCalendar(calendar);
        return date.format(calendar.getTime());
    }
}

