package com.belajar.fetch.demo.fetch.repository;

import com.belajar.fetch.demo.fetch.entity.Gunung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GunungRepository extends JpaRepository<Gunung, Long> {
}
