package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tax implements Serializable {
    @JsonProperty("ipi")
    private Ipi ipi;

    @JsonProperty("icms_ie")
    private IcmsIe icmsIe;

    @JsonProperty("iss")
    private Iss iss;

    @JsonProperty("cofins_st")
    private CofinsSt cofinsSt;

    @JsonProperty("icms_sn")
    private Object icmsSn;

    @JsonProperty("cofins_padrao")
    private CofinsDefault confinsDefault;

    @JsonProperty("irrf")
    private Irrf irrf;

    @JsonProperty("icms")
    private Icms icms;

    @JsonProperty("icms_st")
    private IcmsSt icmsSt;

    @JsonProperty("inss")
    private SocialSecurity inss;

    @JsonProperty("pis_st")
    private PisSt pisSt;

    @JsonProperty("icms_efet")
    private Object icmsEffective;

    @JsonProperty("pis_padrao")
    private PisSt pisStandard;

    @JsonProperty("csll")
    private Csll csll;

    public Ipi getIpi() {
        return ipi;
    }

    public void setIpi(Ipi ipi) {
        this.ipi = ipi;
    }

    public IcmsIe getIcmsIe() {
        return icmsIe;
    }

    public void setIcmsIe(IcmsIe icmsIe) {
        this.icmsIe = icmsIe;
    }

    public Iss getIss() {
        return iss;
    }

    public void setIss(Iss iss) {
        this.iss = iss;
    }

    public CofinsSt getCofinsSt() {
        return cofinsSt;
    }

    public void setCofinsSt(CofinsSt cofinsSt) {
        this.cofinsSt = cofinsSt;
    }

    public Object getIcmsSn() {
        return icmsSn;
    }

    public void setIcmsSn(Object icmsSn) {
        this.icmsSn = icmsSn;
    }

    public CofinsDefault getConfinsDefault() {
        return confinsDefault;
    }

    public void setConfinsDefault(CofinsDefault confinsDefault) {
        this.confinsDefault = confinsDefault;
    }

    public Irrf getIrrf() {
        return irrf;
    }

    public void setIrrf(Irrf irrf) {
        this.irrf = irrf;
    }

    public Icms getIcms() {
        return icms;
    }

    public void setIcms(Icms icms) {
        this.icms = icms;
    }

    public IcmsSt getIcmsSt() {
        return icmsSt;
    }

    public void setIcmsSt(IcmsSt icmsSt) {
        this.icmsSt = icmsSt;
    }

    public SocialSecurity getInss() {
        return inss;
    }

    public void setInss(SocialSecurity inss) {
        this.inss = inss;
    }

    public PisSt getPisSt() {
        return pisSt;
    }

    public void setPisSt(PisSt pisSt) {
        this.pisSt = pisSt;
    }

    public Object getIcmsEffective() {
        return icmsEffective;
    }

    public void setIcmsEffective(Object icmsEffective) {
        this.icmsEffective = icmsEffective;
    }

    public PisSt getPisStandard() {
        return pisStandard;
    }

    public void setPisStandard(PisSt pisStandard) {
        this.pisStandard = pisStandard;
    }

    public Csll getCsll() {
        return csll;
    }

    public void setCsll(Csll csll) {
        this.csll = csll;
    }
}
