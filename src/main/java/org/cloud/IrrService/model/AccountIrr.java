package org.cloud.IrrService.model;

import org.cloud.IrrService.Dao.CompositeKey;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(CompositeKey.class)
@Table(name="ACCOUNTIRR")
public class AccountIrr {
    @Id
    private String office;
    @Id
    private String account;
    @Id
    private String cusip;
    private String irr;

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public String getIrr() {
        return irr;
    }

    public void setIrr(String irr) {
        this.irr = irr;
    }

    @Override
    public String toString() {
        return "AccountIrr{" +
                "office='" + office + '\'' +
                ", account='" + account + '\'' +
                ", cusip='" + cusip + '\'' +
                ", irr='" + irr + '\'' +
                '}';
    }


    }
