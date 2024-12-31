package com.omie.sdk.modules.saleandnfe.invoice.domain.model;

import java.io.Serializable;

public class RetTrib implements Serializable {
    private String vRetCOFINS;

    private String vIRRF;

    private String vBCRetPrev;

    private String vBCIRRF;

    private String vRetPrev;

    private String vRetCSLL;

    private String vRetPIS;

    public String getVRetCOFINS() {
        return this.vRetCOFINS;
    }

    public void setVRetCOFINS(String vRetCOFINS) {
        this.vRetCOFINS = vRetCOFINS;
    }

    public String getVIRRF() {
        return this.vIRRF;
    }

    public void setVIRRF(String vIRRF) {
        this.vIRRF = vIRRF;
    }

    public String getVBCRetPrev() {
        return this.vBCRetPrev;
    }

    public void setVBCRetPrev(String vBCRetPrev) {
        this.vBCRetPrev = vBCRetPrev;
    }

    public String getVBCIRRF() {
        return this.vBCIRRF;
    }

    public void setVBCIRRF(String vBCIRRF) {
        this.vBCIRRF = vBCIRRF;
    }

    public String getVRetPrev() {
        return this.vRetPrev;
    }

    public void setVRetPrev(String vRetPrev) {
        this.vRetPrev = vRetPrev;
    }

    public String getVRetCSLL() {
        return this.vRetCSLL;
    }

    public void setVRetCSLL(String vRetCSLL) {
        this.vRetCSLL = vRetCSLL;
    }

    public String getVRetPIS() {
        return this.vRetPIS;
    }

    public void setVRetPIS(String vRetPIS) {
        this.vRetPIS = vRetPIS;
    }
}