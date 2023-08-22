package kodlamaio.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "models")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Model {
    @Id // Pk oldugunu gostermek ıcın yazılır
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id otomatik artması icim yazildi
    @Column(name = "id") // veritabanındaki tablo ile eşlendi
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name ="brand_id")
    private Brand brand;

    @OneToMany(mappedBy = "model")
    private List<Car> cars;
}
