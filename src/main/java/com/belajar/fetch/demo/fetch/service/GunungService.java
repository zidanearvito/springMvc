package com.belajar.fetch.demo.fetch.service;

import com.belajar.fetch.demo.fetch.entity.Gunung;
import com.belajar.fetch.demo.fetch.repository.GunungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GunungService {

    @Autowired
    private GunungRepository gunungRepository;

    public List<Gunung> getAllGunung() {
        return gunungRepository.findAll();
    }
}
