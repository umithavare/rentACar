package kodlamaio.rentACar.dataAccess.concretes;

import kodlamaio.rentACar.dataAccess.abstracts.BrandRepository;
import kodlamaio.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
@Repository // bu sinif bir data acces nesnesidir
public class InMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;

    public InMemoryBrandRepository() {

        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"BMW"));
        brands.add(new Brand(2,"MERCEDES"));
        brands.add(new Brand(3,"AUDİ"));
        brands.add(new Brand(4,"FIAT"));
        brands.add(new Brand(5,"RENAULT"));

    }




    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
