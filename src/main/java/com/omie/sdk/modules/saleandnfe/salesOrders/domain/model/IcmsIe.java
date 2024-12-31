package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonProperty;


public class IcmsIe implements Serializable {
    @JsonProperty("valor_icms_uf_dest")
    private Integer icmsValueDestinationState;

    @JsonProperty("aliq_partilha_icms")
    private Integer icmsShareRate;

    @JsonProperty("valor_fcp_icms_inter")
    private Integer icmsFcpValueInterstate;

    @JsonProperty("valor_icms_uf_remet")
    private Integer icmsValueSourceState;

    @JsonProperty("aliq_interestadual")
    private Integer interstateRate;

    @JsonProperty("aliq_interna_uf_destino")
    private Integer internalRateDestinationState;

    @JsonProperty("base_icms_uf_destino")
    private Integer icmsBaseDestinationState;

    @JsonProperty("aliq_icms_FCP")
    private Integer icmsFcpRate;

    public Integer getIcmsValueDestinationState() {
        return icmsValueDestinationState;
    }

    public void setIcmsValueDestinationState(Integer icmsValueDestinationState) {
        this.icmsValueDestinationState = icmsValueDestinationState;
    }

    public Integer getIcmsShareRate() {
        return icmsShareRate;
    }

    public void setIcmsShareRate(Integer icmsShareRate) {
        this.icmsShareRate = icmsShareRate;
    }

    public Integer getIcmsFcpValueInterstate() {
        return icmsFcpValueInterstate;
    }

    public void setIcmsFcpValueInterstate(Integer icmsFcpValueInterstate) {
        this.icmsFcpValueInterstate = icmsFcpValueInterstate;
    }

    public Integer getIcmsValueSourceState() {
        return icmsValueSourceState;
    }

    public void setIcmsValueSourceState(Integer icmsValueSourceState) {
        this.icmsValueSourceState = icmsValueSourceState;
    }

    public Integer getInterstateRate() {
        return interstateRate;
    }

    public void setInterstateRate(Integer interstateRate) {
        this.interstateRate = interstateRate;
    }

    public Integer getInternalRateDestinationState() {
        return internalRateDestinationState;
    }

    public void setInternalRateDestinationState(Integer internalRateDestinationState) {
        this.internalRateDestinationState = internalRateDestinationState;
    }

    public Integer getIcmsBaseDestinationState() {
        return icmsBaseDestinationState;
    }

    public void setIcmsBaseDestinationState(Integer icmsBaseDestinationState) {
        this.icmsBaseDestinationState = icmsBaseDestinationState;
    }

    public Integer getIcmsFcpRate() {
        return icmsFcpRate;
    }

    public void setIcmsFcpRate(Integer icmsFcpRate) {
        this.icmsFcpRate = icmsFcpRate;
    }
}
