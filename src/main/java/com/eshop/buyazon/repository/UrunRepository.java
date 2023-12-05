package com.eshop.buyazon.repository;

import com.eshop.buyazon.domain.Urun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrunRepository extends JpaRepository<Urun, Long> {


}
