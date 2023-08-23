package kodlamaio.rentACar.business.abstracts;

import kodlamaio.rentACar.business.requests.CreateModelRequest;
import kodlamaio.rentACar.business.requests.UpdateBrandRequest;
import kodlamaio.rentACar.business.requests.UpdateModelRequest;
import kodlamaio.rentACar.business.responses.GetAllModelsResponse;
import kodlamaio.rentACar.business.responses.GetByIdModelResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ModelService {
    List<GetAllModelsResponse> getAll();
    GetByIdModelResponse getById(int id);
    void add(CreateModelRequest createModelRequest);

    void update(UpdateModelRequest updateModelRequest);
    void delete(int id );


}
