package org.cloud.IrrService.Dao;

import org.cloud.IrrService.model.AccountIrr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface IrrRepo extends JpaRepository<AccountIrr,String> {

        @Query(value = "SELECT * FROM ACCOUNTIRR i WHERE i.OFFICE = ?1 and i.ACCOUNT = ?2",
                nativeQuery = true)
        public List<AccountIrr> findAccountIrrByOfficeAndAccount(String office, String account);
    }

