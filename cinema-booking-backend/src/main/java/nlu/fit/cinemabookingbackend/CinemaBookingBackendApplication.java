package nlu.fit.cinemabookingbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.sql.DataSource;

@SpringBootApplication
public class CinemaBookingBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CinemaBookingBackendApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void checkDatabaseConnection(ApplicationReadyEvent event) {
        try {
            DataSource dataSource = event.getApplicationContext().getBean(DataSource.class);
            dataSource.getConnection().close();
            System.out.println("Kết nối Database thành công!");
        } catch (Exception e) {
            System.out.println("Kết nối Database thất bại!");
        }
    }
}
