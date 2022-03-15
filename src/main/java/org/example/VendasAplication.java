package org.example;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages =
        {"org.example.Repository","org.example.Service"}
)


@RestController
public class VendasAplication  {

   @Value("${Application.Name}")

    private String ApplicationName;

@Gato
   private Animal animal;

   @Bean (name = "executarAnimal")
   public CommandLineRunner executar() {
       return args -> {
          this.animal.fazerBarulho();
       };
   }
    @GetMapping ("/hello")

    public String helloWorld(){

        return ApplicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasAplication.class, args);
    }
}
