package com.eshop.buyazon.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Urun {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(length=30,nullable = false)
    private String isim;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="satici_id",nullable = false)
    private Satici satici;

    @Column(nullable = false)
    private Double fiyat;

    private String resimler;

    @Column(nullable = false)
    private Long stokAdedi;
}
