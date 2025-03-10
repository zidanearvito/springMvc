package com.belajar.fetch.demo.fetch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "kota")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Kota {

    @Id
    private Long id;

    private String kota;
}
