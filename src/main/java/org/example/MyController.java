package org.example;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@PropertySource(value = "classpath:application.properties")
@RestController
public class MyController {
    @GetMapping("/")
    public String index() {

        //return "Greetings from Spring Boot!";
        LocalDate fromDate = LocalDate.now();
        LocalDate newYear = fromDate.plusYears(1).withDayOfYear(1);
        return "There are " + Days.daysBetween(fromDate, newYear) + "days until the new year!";
    }

}

