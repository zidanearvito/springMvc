package com.belajar.fetch.demo.fetch.repository;

import com.belajar.fetch.demo.fetch.entity.LaporanKeuangan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaporanKeuanganRepository extends JpaRepository<LaporanKeuangan, Long> {
}
