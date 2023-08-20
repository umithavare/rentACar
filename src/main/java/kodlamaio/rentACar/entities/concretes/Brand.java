package kodlamaio.rentACar.entities.concretes;


import jakarta.persistence.*;
import lombok.*;

@Table(name = "brands")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id otomatik artması icim yazildi
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;



}
