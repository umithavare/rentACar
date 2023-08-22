package kodlamaio.rentACar.business.abstracts;

import kodlamaio.rentACar.business.requests.CreateModelRequest;
import kodlamaio.rentACar.business.responses.GetAllModelsResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ModelService {
    List<GetAllModelsResponse> getAll();
    void add(CreateModelRequest createModelRequest);

}
