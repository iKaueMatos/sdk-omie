package com.omie.sdk.modules.saleandnfe.invoice.domain.model;

import java.io.Serializable;

public class ISSQNtot implements Serializable {
    private String vPIS;

    private String vCOFINS;

    private String vISS;

    private String vBC;

    private String vServ;

    public String getVPIS() {
        return this.vPIS;
    }

    public void setVPIS(String vPIS) {
        this.vPIS = vPIS;
    }

    public String getVCOFINS() {
        return this.vCOFINS;
    }

    public void setVCOFINS(String vCOFINS) {
        this.vCOFINS = vCOFINS;
    }

    public String getVISS() {
        return this.vISS;
    }

    public void setVISS(String vISS) {
        this.vISS = vISS;
    }

    public String getVBC() {
        return this.vBC;
    }

    public void setVBC(String vBC) {
        this.vBC = vBC;
    }

    public String getVServ() {
        return this.vServ;
    }

    public void setVServ(String vServ) {
        this.vServ = vServ;
    }
}