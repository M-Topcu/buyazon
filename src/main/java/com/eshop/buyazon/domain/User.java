package com.eshop.buyazon.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String isim;

    private String soyisim;

    private Date dogumTarihi;

    private String adres;

    private String telefonNo;

    private  String eMail;

    private  String kullaniciAdi;

    private String sifre;

    private LocalDateTime uyelikBaslangici;

    private Set<Rol> rol;





}
