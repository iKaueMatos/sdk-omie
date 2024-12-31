package com.omie.sdk.modules.product.domain.model;

import java.io.Serializable;

public class Info implements Serializable {
    private String hAlt;
    private String uAlt;
    private String dInc;
    private String hInc;
    private String dAlt;
    private String uInc;

    public String getHAlt() {
        return this.hAlt;
    }

    public void setHAlt(String hAlt) {
        this.hAlt = hAlt;
    }

    public String getUAlt() {
        return this.uAlt;
    }

    public void setUAlt(String uAlt) {
        this.uAlt = uAlt;
    }

    public String getDInc() {
        return this.dInc;
    }

    public void setDInc(String dInc) {
        this.dInc = dInc;
    }

    public String getHInc() {
        return this.hInc;
    }

    public void setHInc(String hInc) {
        this.hInc = hInc;
    }

    public String getDAlt() {
        return this.dAlt;
    }

    public void setDAlt(String dAlt) {
        this.dAlt = dAlt;
    }

    public String getUInc() {
        return this.uInc;
    }

    public void setUInc(String uInc) {
        this.uInc = uInc;
    }
}
