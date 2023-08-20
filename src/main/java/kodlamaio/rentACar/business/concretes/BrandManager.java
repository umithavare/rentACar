package kodlamaio.rentACar.business.concretes;

import kodlamaio.rentACar.business.abstracts.BrandService;
import kodlamaio.rentACar.business.requests.CreateBrandRequest;
import kodlamaio.rentACar.business.requests.UpdateBrandRequest;
import kodlamaio.rentACar.business.responses.GetAllBrandsResponse;
import kodlamaio.rentACar.business.responses.GetByIdBrandResponse;
import kodlamaio.rentACar.core.utilities.mappers.ModelMapperService;
import kodlamaio.rentACar.dataAccess.abstracts.BrandRepository;
import kodlamaio.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service // Bu sınıf bir business nesnesidir
@AllArgsConstructor
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;


    @Override
    public List<GetAllBrandsResponse> getAll() {

        List<Brand> brands = brandRepository.findAll();

        List<GetAllBrandsResponse> brandsResponse = brands.stream().
                map(brand -> this.modelMapperService.forResponse().
                        map(brand,GetAllBrandsResponse.class)).collect(Collectors.toList());


        return brandsResponse;
    }

    @Override
    public GetByIdBrandResponse getById(int id) {
        Brand brand = this.brandRepository.findById(id).orElseThrow();
        GetByIdBrandResponse response = this.modelMapperService.forResponse().
                map(brand,GetByIdBrandResponse.class);
        return response;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {

        // Mapping ile createBrand requesti Brand sınıfına eşliyor boylece veritabanına uygun hale gelıyor
        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest,Brand.class);

        this.brandRepository.save(brand);
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest,Brand.class);
        this.brandRepository.save(brand);
    }

    @Override
    public void delete(int id) {
    this.brandRepository.deleteById(id);
    }
}
