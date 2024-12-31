package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.io.Serializable;

public class Freight implements Serializable {
    @JsonProperty("outras_despesas")
    private Integer otherExpenses;

    @JsonProperty("peso_bruto")
    private Integer grossWeight;

    @JsonProperty("veiculo_proprio")
    private String ownVehicle;

    @JsonProperty("codigo_tipo_entrega")
    private String deliveryTypeCode;

    @JsonProperty("placa_estado")
    private String licensePlateState;

    @JsonProperty("codigo_rastreio")
    private String trackingCode;

    @JsonProperty("registro_transportador")
    private String carrierRegistration;

    @JsonProperty("numero_lacre")
    private String sealNumber;

    @JsonProperty("peso_liquido")
    private Integer netWeight;

    @JsonProperty("codigo_transportadora")
    private String carrierCode;

    @JsonProperty("quantidade_volumes")
    private Integer volumeQuantity;

    @JsonProperty("marca_volumes")
    private String volumeBrand;

    @JsonProperty("numeracao_volumes")
    private String volumeNumbering;

    @JsonProperty("previsao_entrega")
    private String deliveryEstimate;

    @JsonProperty("valor_frete")
    private Integer freightValue;

    @JsonProperty("especie_volumes")
    private String volumeType;

    @JsonProperty("valor_seguro")
    private Integer insuranceValue;

    @JsonProperty("modalidade")
    private String mode;

    @JsonProperty("placa")
    private String licensePlate;

    public Integer getOtherExpenses() {
        return otherExpenses;
    }

    public void setOtherExpenses(Integer otherExpenses) {
        this.otherExpenses = otherExpenses;
    }

    public Integer getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(Integer grossWeight) {
        this.grossWeight = grossWeight;
    }

    public String getOwnVehicle() {
        return ownVehicle;
    }

    public void setOwnVehicle(String ownVehicle) {
        this.ownVehicle = ownVehicle;
    }

    public String getDeliveryTypeCode() {
        return deliveryTypeCode;
    }

    public void setDeliveryTypeCode(String deliveryTypeCode) {
        this.deliveryTypeCode = deliveryTypeCode;
    }

    public String getLicensePlateState() {
        return licensePlateState;
    }

    public void setLicensePlateState(String licensePlateState) {
        this.licensePlateState = licensePlateState;
    }

    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }

    public String getCarrierRegistration() {
        return carrierRegistration;
    }

    public void setCarrierRegistration(String carrierRegistration) {
        this.carrierRegistration = carrierRegistration;
    }

    public String getSealNumber() {
        return sealNumber;
    }

    public void setSealNumber(String sealNumber) {
        this.sealNumber = sealNumber;
    }

    public Integer getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(Integer netWeight) {
        this.netWeight = netWeight;
    }

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public Integer getVolumeQuantity() {
        return volumeQuantity;
    }

    public void setVolumeQuantity(Integer volumeQuantity) {
        this.volumeQuantity = volumeQuantity;
    }

    public String getVolumeBrand() {
        return volumeBrand;
    }

    public void setVolumeBrand(String volumeBrand) {
        this.volumeBrand = volumeBrand;
    }

    public String getVolumeNumbering() {
        return volumeNumbering;
    }

    public void setVolumeNumbering(String volumeNumbering) {
        this.volumeNumbering = volumeNumbering;
    }

    public String getDeliveryEstimate() {
        return deliveryEstimate;
    }

    public void setDeliveryEstimate(String deliveryEstimate) {
        this.deliveryEstimate = deliveryEstimate;
    }

    public Integer getFreightValue() {
        return freightValue;
    }

    public void setFreightValue(Integer freightValue) {
        this.freightValue = freightValue;
    }

    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public Integer getInsuranceValue() {
        return insuranceValue;
    }

    public void setInsuranceValue(Integer insuranceValue) {
        this.insuranceValue = insuranceValue;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
