package com.belajar.fetch.demo.fetch.service;

import com.belajar.fetch.demo.fetch.entity.Kota;
import com.belajar.fetch.demo.fetch.repository.KotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KotaService {

    @Autowired
    private KotaRepository kotaRepository;

    public List<Kota> getAllKota() {
        return kotaRepository.findAll();
    }
}
