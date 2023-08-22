package kodlamaio.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "cars")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {
    @Id // Pk oldugunu gostermek ıcın yazılır
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id otomatik artması icim yazildi
    @Column(name = "id") // veritabanındaki tablo ile eşlendi
    private int id;

    @Column(name = "plate",unique = true)
    private String plate;

    @Column(name = "dailyPrice")
    private double dailyPrice;

    @Column(name = "modelYear")
    private int modelYear;

    @Column(name = "state")
    private int state; // 1-Available 2-Rented 3-Maintenance

    @JoinColumn(name = "model_id")
    @ManyToOne
    private Model model;

}
