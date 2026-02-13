package com.example.demo.service;

import com.example.demo.client.PetApiClient;
import com.example.demo.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService {

    @Autowired
    private PetApiClient petApiClient;

    public Pet getPetById(Long id) {
        return petApiClient.fetchPetFromExternalApi(id);
    }
}
