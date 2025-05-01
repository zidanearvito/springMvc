package com.belajar.fetch.demo.fetch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "laporan_keuangan")
@Setter
@Getter
public class LaporanKeuangan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal kas;

    private BigDecimal piutang;

    private BigDecimal persediaan;

    private BigDecimal asetLancar;

}
