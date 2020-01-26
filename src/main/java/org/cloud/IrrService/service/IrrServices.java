package org.cloud.IrrService.service;

import org.cloud.IrrService.Dao.IrrRepo;
import org.cloud.IrrService.model.AccountIrr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IrrServices {

    @Autowired
    private IrrRepo irrrepo;

    public List<AccountIrr> getIrr(String office,String account){
        List<AccountIrr> accountIrrs = irrrepo.findAccountIrrByOfficeAndAccount(office,account);
        return accountIrrs;
    }
}
