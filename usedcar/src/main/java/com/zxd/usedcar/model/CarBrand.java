package com.zxd.usedcar.model;

public class CarBrand {
    private Long cbId;

    private String cbBrand;

    private String cbSeries;

    private String cbType;

    private String cbYear;

    private Double cbGas;

    public Long getCbId() {
        return cbId;
    }

    public void setCbId(Long cbId) {
        this.cbId = cbId;
    }

    public String getCbBrand() {
        return cbBrand;
    }

    public void setCbBrand(String cbBrand) {
        this.cbBrand = cbBrand == null ? null : cbBrand.trim();
    }

    public String getCbSeries() {
        return cbSeries;
    }

    public void setCbSeries(String cbSeries) {
        this.cbSeries = cbSeries == null ? null : cbSeries.trim();
    }

    public String getCbType() {
        return cbType;
    }

    public void setCbType(String cbType) {
        this.cbType = cbType == null ? null : cbType.trim();
    }

    public String getCbYear() {
        return cbYear;
    }

    public void setCbYear(String cbYear) {
        this.cbYear = cbYear == null ? null : cbYear.trim();
    }

    public Double getCbGas() {
        return cbGas;
    }

    public void setCbGas(Double cbGas) {
        this.cbGas = cbGas;
    }
}