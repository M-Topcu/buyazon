package com.eshop.buyazon.dto;

import com.eshop.buyazon.domain.ResimDosyasi;
import lombok.Data;

import java.util.Set;

@Data
public class UrunKayitIstegi {

    private String isim;

    private String satici;

    private Double fiyat;

    private Set<ResimDosyasi> resimler;

    private Long stokAdedi;

}
