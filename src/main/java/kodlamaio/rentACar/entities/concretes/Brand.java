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
    @Id // Pk oldugunu gostermek ıcın yazılır
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id otomatik artması icim yazildi
    @Column(name = "id") // veritabanındaki tablo ile eşlendi
    private int id;

    @Column(name = "name")
    private String name;



}
