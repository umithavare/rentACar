package kodlamaio.rentACar.webApi.controllers;


import kodlamaio.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.rentACar.business.abstracts.BrandService;

import java.util.List;

@RestController //annotation
@RequestMapping("/api/brands")

public class BrandsController {
    private BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getall")
    public List<Brand> getAll(){
        return brandService.getAll();
    }
}
