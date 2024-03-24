package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "product_id")
    private long id;
    @Column(name="product_name",length = 200,nullable = false)
    private String name;
    private String description;
    private int quantity;

    public Product(String name, String description, int quantity) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }
}
