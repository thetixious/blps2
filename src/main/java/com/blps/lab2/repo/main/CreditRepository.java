package com.blps.lab2.repo.main;

import com.blps.lab2.model.mainDB.CreditOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepository extends JpaRepository<CreditOffer,Long> {

    @Query("from CreditOffer co where co.user_id = :id")
    CreditOffer findByUserId(@Param("id") Long id);

}
