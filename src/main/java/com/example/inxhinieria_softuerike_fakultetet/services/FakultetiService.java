package com.example.inxhinieria_softuerike_fakultetet.services;

import com.example.inxhinieria_softuerike_fakultetet.model.Fakulteti;
import com.example.inxhinieria_softuerike_fakultetet.repositories.FakultetiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BorrowService {
    private final FakultetiRepository fakultetiRepository;

    @Autowired
    public BorrowService(FakultetiRepository fakultetiRepository) {
        this.fakultetiRepository = fakultetiRepository;
    }

    public List<Fakulteti> getAllBorrows() {
        return fakultetiRepository.findAll();
    }

    public Optional<Fakulteti> getBorrowById(Long id) {
        return fakultetiRepository.findById(id);
    }

    public Fakulteti saveFakulteti(Fakulteti fakulteti) {
        return fakultetiRepository.save(fakulteti);
    }

    public void deleteFakulteti(Long id) {
        fakultetiRepository.deleteById(id);
    }
}