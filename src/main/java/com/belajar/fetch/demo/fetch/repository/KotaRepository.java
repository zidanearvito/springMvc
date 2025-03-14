package com.belajar.fetch.demo.fetch.repository;

import com.belajar.fetch.demo.fetch.entity.Kota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KotaRepository extends JpaRepository<Kota, Long> {
}
