package com.eshop.buyazon.service;

import com.eshop.buyazon.domain.Urun;
import com.eshop.buyazon.dto.UrunKayitIstegi;
import com.eshop.buyazon.repository.UrunRepository;
import org.springframework.stereotype.Service;

@Service
public class UrunService {

    private UrunRepository urunRepository;
    public void urunKaydet(UrunKayitIstegi urunKayitIstegi){

        Urun urun= new Urun(urunKayitIstegi.getIsim(),urunKayitIstegi.getSatici(),urunKayitIstegi.getFiyat());
        urun.setIsim(urunKayitIstegi.getIsim());

        urunRepository.save(u)

    }
}
