package ucr.ac.ProyectoCitas.config;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void initialize() {
        try {
            jdbcTemplate.execute("CREATE DATABASE citas");
            System.out.println("Database 'citas' created successfully.");
        } catch (Exception e) {
            // Excepción lanzada si la base de datos ya existe o hay algún otro problema
            System.err.println("Database 'citas' already exists or failed to create.");
        }
    }
}
