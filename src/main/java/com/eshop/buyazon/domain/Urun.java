package com.eshop.buyazon.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Setter;

import java.util.Set;

@Entity
@Data
@Builder(toBuilder = true)
public class Urun {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(length=30,nullable = false)
    private String isim;

    @Column(nullable = false)
    private String satici;

    @Column(nullable = false)
    private Double fiyat;

    private Set<ResimDosyasi> resimler;

    @Column(nullable = false)
    private Long stokAdedi;
}
