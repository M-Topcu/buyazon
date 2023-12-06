package com.eshop.buyazon.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UrunKayitIstegi {

    private String isim;

    private Double fiyat;

 //   private Set<ResimDosyasi> resimler;

    private String resimler;

    private Long stokAdedi;

}
