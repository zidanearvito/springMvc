package com.belajar.fetch.demo.fetch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "gunung")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Gunung {

    @Id
    private Long id;

    private String nama_gunung;
}
