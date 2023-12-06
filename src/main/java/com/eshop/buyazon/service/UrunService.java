package com.eshop.buyazon.service;

import com.eshop.buyazon.domain.Urun;
import com.eshop.buyazon.dto.UrunKayitIstegi;
import com.eshop.buyazon.repository.UrunRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UrunService {


    private UrunRepository urunRepository;

    /*
    public Urun urunKaydet(UrunKayitIstegi urunKayitIstegi){

        Urun urun=new Urun();

        urun.setIsim(urunKayitIstegi.getIsim());
        urun.setFiyat(urunKayitIstegi.getFiyat());
        urun.setResimler(urunKayitIstegi.getResimler());
        urun.setStokAdedi(urunKayitIstegi.getStokAdedi());



        return urunRepository.save(urun);


    }

     */
}
