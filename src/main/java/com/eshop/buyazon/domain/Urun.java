package com.eshop.buyazon.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Urun {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Setter(AccessLevel.NONE)
    private Long id;

    @Column(length=30,nullable = false)
    private String isim;

    @Column(nullable = false)
    private String satici;

    @Column(nullable = false)
    private Double fiyat;

    private String resimler;

    @Column(nullable = false)
    private Long stokAdedi;
}
