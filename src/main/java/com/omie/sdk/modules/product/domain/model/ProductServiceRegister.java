package com.omie.sdk.modules.product.domain.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class ProductServiceRegister implements  Serializable {
    @JsonProperty("bloqueado")
    private String blocked;

    @JsonProperty("cst_pis")
    private String cstPis;

    @JsonProperty("dias_crossdocking")
    private Integer dayCrossDocking;

    @JsonProperty("csosn_icms")
    private String csosnIcms;

    @JsonProperty("marca")
    private String brand;

    @JsonProperty("bloquado_exclusao")
    private String blockedExclusion;

    @JsonProperty("imagems")
    private List<Imagens> imagems;

    @JsonProperty("cst_cofins")
    private String cstCofins;

    @JsonProperty("estoque_minimo")
    private Integer stockMin;

    @JsonProperty("exibir_descricao_pedido")
    private String displayDescriptionOrder;

    @JsonProperty("descr_detalhada")
    private String descriptionDetail;

    @JsonProperty("aliquota_ibpt")
    private Integer aliquotaIbpt;

    @JsonProperty("info")
    private Info information;

    @JsonProperty("valor_unitario")
    private Integer valueUnitary;

    @JsonProperty("codigo")
    private String code;

    @JsonProperty("largura")
    private Integer large;

    @JsonProperty("aliquota_pis")
    private Integer aliquotaPis;

    @JsonProperty("cfop")
    private String cfop;

    @JsonProperty("modelo")
    private String model;

    @JsonProperty("descricao")
    private String description;

    @JsonProperty("importado_api")
    private String ImportApi;

    @JsonProperty("tipoItem")
    private String typeItem;

    @JsonProperty("altura")
    private Integer height;

    @JsonProperty("aliquota_icms")
    private Integer aliquotaIcms;

    @JsonProperty("peso_liq")
    private Integer netWeitht;

    @JsonProperty("quantidade_estoque")
    private Integer stockQuantity;

    @JsonProperty("aliquota_cofins")
    private Integer aliquotaCofins;

    @JsonProperty("cst_icms")
    private String cstIcms;

    @JsonProperty("per_icms_fcp")
    private Integer perIcmsFcp;

    @JsonProperty("red_base_cofins")
    private Integer redBaseCofins;

    @JsonProperty("unidade")
    private String unity;

    @JsonProperty("red_base_pis")
    private Integer redBasePis;

    @JsonProperty("codigo_produto")
    private Integer codeProduct;

    @JsonProperty("dias_garantia")
    private Integer warrantyDays;

    @JsonProperty("motivo_deson_icms")
    private String reasonDesonIcms;

    @JsonProperty("exibir_descricao_nfe")
    private String displayDescriptionNfe;

    @JsonProperty("codigo_produto_integracao")
    private String codeProductIntegration;

    @JsonProperty("ean")
    private String ean;

    @JsonProperty("obs_internas")
    private String internalObservation;

    @JsonProperty("lead_time")
    private Integer leadTime;

    @JsonProperty("ncm")
    private String ncm;

    @JsonProperty("recomendacoes_fiscais")
    private TaxRecommendation taxRecommendation;

    @JsonProperty("peso_bruto")
    private Integer grossWeight;

    @JsonProperty("codigo_familia")
    private Integer codeFamily;

    @JsonProperty("codInt_familia")
    private String codeInternalFamily;

    @JsonProperty("codigo_beneficio")
    private String codeBenefit;

    @JsonProperty("profundidade")
    private Integer depth;

    @JsonProperty("cest")
    private String cest;

    @JsonProperty("descricao_familia")
    private String descriptionFamily;

    @JsonProperty("inativo")
    private String inactive;

    @JsonProperty("red_base_icms")
    private Integer redBaseIcms;

    public String getBlocked() {
        return blocked;
    }

    public void setBlocked(String blocked) {
        this.blocked = blocked;
    }

    public String getCstPis() {
        return cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }

    public Integer getDayCrossDocking() {
        return dayCrossDocking;
    }

    public void setDayCrossDocking(Integer dayCrossDocking) {
        this.dayCrossDocking = dayCrossDocking;
    }

    public String getCsosnIcms() {
        return csosnIcms;
    }

    public void setCsosnIcms(String csosnIcms) {
        this.csosnIcms = csosnIcms;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBlockedExclusion() {
        return blockedExclusion;
    }

    public void setBlockedExclusion(String blockedExclusion) {
        this.blockedExclusion = blockedExclusion;
    }

    public List<Imagens> getImagems() {
        return imagems;
    }

    public void setImagems(List<Imagens> imagems) {
        this.imagems = imagems;
    }

    public String getCstCofins() {
        return cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }

    public Integer getStockMin() {
        return stockMin;
    }

    public void setStockMin(Integer stockMin) {
        this.stockMin = stockMin;
    }

    public String getDisplayDescriptionOrder() {
        return displayDescriptionOrder;
    }

    public void setDisplayDescriptionOrder(String displayDescriptionOrder) {
        this.displayDescriptionOrder = displayDescriptionOrder;
    }

    public String getDescriptionDetail() {
        return descriptionDetail;
    }

    public void setDescriptionDetail(String descriptionDetail) {
        this.descriptionDetail = descriptionDetail;
    }

    public Integer getAliquotaIbpt() {
        return aliquotaIbpt;
    }

    public void setAliquotaIbpt(Integer aliquotaIbpt) {
        this.aliquotaIbpt = aliquotaIbpt;
    }

    public Info getInformation() {
        return information;
    }

    public void setInformation(Info information) {
        this.information = information;
    }

    public Integer getValueUnitary() {
        return valueUnitary;
    }

    public void setValueUnitary(Integer valueUnitary) {
        this.valueUnitary = valueUnitary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getLarge() {
        return large;
    }

    public void setLarge(Integer large) {
        this.large = large;
    }

    public Integer getAliquotaPis() {
        return aliquotaPis;
    }

    public void setAliquotaPis(Integer aliquotaPis) {
        this.aliquotaPis = aliquotaPis;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImportApi() {
        return ImportApi;
    }

    public void setImportApi(String importApi) {
        ImportApi = importApi;
    }

    public String getTypeItem() {
        return typeItem;
    }

    public void setTypeItem(String typeItem) {
        this.typeItem = typeItem;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setAliquotaIcms(Integer aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public Integer getNetWeitht() {
        return netWeitht;
    }

    public void setNetWeitht(Integer netWeitht) {
        this.netWeitht = netWeitht;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Integer getAliquotaCofins() {
        return aliquotaCofins;
    }

    public void setAliquotaCofins(Integer aliquotaCofins) {
        this.aliquotaCofins = aliquotaCofins;
    }

    public String getCstIcms() {
        return cstIcms;
    }

    public void setCstIcms(String cstIcms) {
        this.cstIcms = cstIcms;
    }

    public Integer getPerIcmsFcp() {
        return perIcmsFcp;
    }

    public void setPerIcmsFcp(Integer perIcmsFcp) {
        this.perIcmsFcp = perIcmsFcp;
    }

    public Integer getRedBaseCofins() {
        return redBaseCofins;
    }

    public void setRedBaseCofins(Integer redBaseCofins) {
        this.redBaseCofins = redBaseCofins;
    }

    public String getUnity() {
        return unity;
    }

    public void setUnity(String unity) {
        this.unity = unity;
    }

    public Integer getRedBasePis() {
        return redBasePis;
    }

    public void setRedBasePis(Integer redBasePis) {
        this.redBasePis = redBasePis;
    }

    public Integer getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(Integer codeProduct) {
        this.codeProduct = codeProduct;
    }

    public Integer getWarrantyDays() {
        return warrantyDays;
    }

    public void setWarrantyDays(Integer warrantyDays) {
        this.warrantyDays = warrantyDays;
    }

    public String getReasonDesonIcms() {
        return reasonDesonIcms;
    }

    public void setReasonDesonIcms(String reasonDesonIcms) {
        this.reasonDesonIcms = reasonDesonIcms;
    }

    public String getDisplayDescriptionNfe() {
        return displayDescriptionNfe;
    }

    public void setDisplayDescriptionNfe(String displayDescriptionNfe) {
        this.displayDescriptionNfe = displayDescriptionNfe;
    }

    public String getCodeProductIntegration() {
        return codeProductIntegration;
    }

    public void setCodeProductIntegration(String codeProductIntegration) {
        this.codeProductIntegration = codeProductIntegration;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getInternalObservation() {
        return internalObservation;
    }

    public void setInternalObservation(String internalObservation) {
        this.internalObservation = internalObservation;
    }

    public Integer getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(Integer leadTime) {
        this.leadTime = leadTime;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public TaxRecommendation getTaxRecommendation() {
        return taxRecommendation;
    }

    public void setTaxRecommendation(TaxRecommendation taxRecommendation) {
        this.taxRecommendation = taxRecommendation;
    }

    public Integer getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(Integer grossWeight) {
        this.grossWeight = grossWeight;
    }

    public Integer getCodeFamily() {
        return codeFamily;
    }

    public void setCodeFamily(Integer codeFamily) {
        this.codeFamily = codeFamily;
    }

    public String getCodeInternalFamily() {
        return codeInternalFamily;
    }

    public void setCodeInternalFamily(String codeInternalFamily) {
        this.codeInternalFamily = codeInternalFamily;
    }

    public String getCodeBenefit() {
        return codeBenefit;
    }

    public void setCodeBenefit(String codeBenefit) {
        this.codeBenefit = codeBenefit;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public String getCest() {
        return cest;
    }

    public void setCest(String cest) {
        this.cest = cest;
    }

    public String getDescriptionFamily() {
        return descriptionFamily;
    }

    public void setDescriptionFamily(String descriptionFamily) {
        this.descriptionFamily = descriptionFamily;
    }

    public String getInactive() {
        return inactive;
    }

    public void setInactive(String inactive) {
        this.inactive = inactive;
    }

    public Integer getRedBaseIcms() {
        return redBaseIcms;
    }

    public void setRedBaseIcms(Integer redBaseIcms) {
        this.redBaseIcms = redBaseIcms;
    }
}
