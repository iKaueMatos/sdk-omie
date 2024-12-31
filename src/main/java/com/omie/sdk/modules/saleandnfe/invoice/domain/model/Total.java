package com.omie.sdk.modules.saleandnfe.invoice.domain.model;

import java.io.Serializable;

public class Total implements Serializable {
    private RetTrib retTrib;

    private ISSQNtot ISSQNtot;

    private ICMSTot ICMSTot;

    public RetTrib getRetTrib() {
        return this.retTrib;
    }

    public void setRetTrib(RetTrib retTrib) {
        this.retTrib = retTrib;
    }

    public ISSQNtot getISSQNtot() {
        return this.ISSQNtot;
    }

    public void setISSQNtot(ISSQNtot ISSQNtot) {
        this.ISSQNtot = ISSQNtot;
    }

    public ICMSTot getICMSTot() {
        return this.ICMSTot;
    }

    public void setICMSTot(ICMSTot ICMSTot) {
        this.ICMSTot = ICMSTot;
    }
}
