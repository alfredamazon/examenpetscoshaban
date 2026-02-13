package com.example.demo.client;


import com.example.demo.model.Pet;
import org.springframework.stereotype.Component;

@Component
public class PetApiClient {

    public Pet fetchPetFromExternalApi(Long id) {

        return new Pet(id, "ExternalFido", "pending");
    }
}
