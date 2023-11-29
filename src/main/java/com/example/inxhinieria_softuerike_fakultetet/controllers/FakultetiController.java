package com.example.inxhinieria_softuerike_fakultetet.controllers;

import com.example.inxhinieria_softuerike_fakultetet.model.Fakulteti;
import com.example.inxhinieria_softuerike_fakultetet.repositories.FakultetiRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class FakultetiController {
    private FakultetiRepository fakultetiRepository;

    public void FakultetiRepository(FakultetiRepository fakultetiRepository) {
        this.fakultetiRepository = fakultetiRepository;
    }

    public FakultetiController(FakultetiRepository fakultetiRepository) {
        this.fakultetiRepository = fakultetiRepository;
    }

    @GetMapping
    public Fakulteti createFakulteti(@RequestBody Fakulteti fakulteti) {
        return fakultetiRepository.save(fakulteti);
    }
}
