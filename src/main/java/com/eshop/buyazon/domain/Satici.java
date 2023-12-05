package com.eshop.buyazon.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Builder(toBuilder = true)
public class Satici {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String isim;

    @Column(nullable = false)
    private Long vergiNo;

    private List<Urun> urunListesi;

}
