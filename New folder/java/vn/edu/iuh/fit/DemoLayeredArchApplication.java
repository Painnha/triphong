package vn.edu.iuh.fit;

import net.datafaker.Faker;
import net.datafaker.providers.food.Coffee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.edu.iuh.fit.models.Product;
import vn.edu.iuh.fit.reponsitories.ProductRepository;

@SpringBootApplication
public class DemoLayeredArchApplication implements CommandLineRunner {
@Autowired
    private final ProductRepository productRepository;

    public DemoLayeredArchApplication(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoLayeredArchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Faker faker= new Faker();
        Coffee fk = faker.coffee();
        for(int i=0;i<100;i++){
          Product p = new Product(fk.blendName(),fk.descriptor(),100);
            productRepository.save(p);
        }
    }
}
