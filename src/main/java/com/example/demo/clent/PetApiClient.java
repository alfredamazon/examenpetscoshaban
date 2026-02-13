package com.example.demo.client;


import com.example.demo.model.Pet;
import org.springframework.stereotype.Component;

@Component
public class PetApiClient {

    public Pet fetchPetFromExternalApi(Long id) {
        // Aquí iría la lógica de llamada HTTP a otra API
        // Por ahora devolvemos un ejemplo estático
        return new Pet(id, "ExternalFido", "pending");
    }
}
