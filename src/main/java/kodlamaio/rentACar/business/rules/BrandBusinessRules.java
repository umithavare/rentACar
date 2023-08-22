package kodlamaio.rentACar.business.rules;

import kodlamaio.rentACar.core.utilities.exceptions.BusinessException;
import kodlamaio.rentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BrandBusinessRules {
    private BrandRepository brandRepository;
    public void checkIfBrandNameExists(String name){
        if (this.brandRepository.existsByName(name)){
            throw new BusinessException("Brand name already exists");
        }
    }
}
