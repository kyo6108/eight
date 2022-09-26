import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("dos.*")
@ComponentScan({"line","com.huang.*","dos"})
public class EightApplication {

    public static void main(String[] args) {
        SpringApplication.run(EightApplication.class, args);
    }

}
