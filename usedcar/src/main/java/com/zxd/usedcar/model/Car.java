package com.zxd.usedcar.model;

import java.util.Date;

public class Car {
    private Long cId;

    private Long uId;

    private Long csId;

    private Long cfId;

    private Long cbId;

    private Integer cProvid;

    private String cProvince;

    private Integer cCityid;

    private String cCity;

    private Double cCitylat;

    private Double cCitylng;

    private Date cRegdate;

    private Integer cReportprice;

    private Date cPosttime;

    private Integer cModelprice;

    private Integer cPriceflag;

    private Integer cBrandno;

    private Integer cSeriesno;

    private String cColor;

    private Integer cSellertype;

    private Integer cGeartype;

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public Long getCsId() {
        return csId;
    }

    public void setCsId(Long csId) {
        this.csId = csId;
    }

    public Long getCfId() {
        return cfId;
    }

    public void setCfId(Long cfId) {
        this.cfId = cfId;
    }

    public Long getCbId() {
        return cbId;
    }

    public void setCbId(Long cbId) {
        this.cbId = cbId;
    }

    public Integer getcProvid() {
        return cProvid;
    }

    public void setcProvid(Integer cProvid) {
        this.cProvid = cProvid;
    }

    public String getcProvince() {
        return cProvince;
    }

    public void setcProvince(String cProvince) {
        this.cProvince = cProvince == null ? null : cProvince.trim();
    }

    public Integer getcCityid() {
        return cCityid;
    }

    public void setcCityid(Integer cCityid) {
        this.cCityid = cCityid;
    }

    public String getcCity() {
        return cCity;
    }

    public void setcCity(String cCity) {
        this.cCity = cCity == null ? null : cCity.trim();
    }

    public Double getcCitylat() {
        return cCitylat;
    }

    public void setcCitylat(Double cCitylat) {
        this.cCitylat = cCitylat;
    }

    public Double getcCitylng() {
        return cCitylng;
    }

    public void setcCitylng(Double cCitylng) {
        this.cCitylng = cCitylng;
    }

    public Date getcRegdate() {
        return cRegdate;
    }

    public void setcRegdate(Date cRegdate) {
        this.cRegdate = cRegdate;
    }

    public Integer getcReportprice() {
        return cReportprice;
    }

    public void setcReportprice(Integer cReportprice) {
        this.cReportprice = cReportprice;
    }

    public Date getcPosttime() {
        return cPosttime;
    }

    public void setcPosttime(Date cPosttime) {
        this.cPosttime = cPosttime;
    }

    public Integer getcModelprice() {
        return cModelprice;
    }

    public void setcModelprice(Integer cModelprice) {
        this.cModelprice = cModelprice;
    }

    public Integer getcPriceflag() {
        return cPriceflag;
    }

    public void setcPriceflag(Integer cPriceflag) {
        this.cPriceflag = cPriceflag;
    }

    public Integer getcBrandno() {
        return cBrandno;
    }

    public void setcBrandno(Integer cBrandno) {
        this.cBrandno = cBrandno;
    }

    public Integer getcSeriesno() {
        return cSeriesno;
    }

    public void setcSeriesno(Integer cSeriesno) {
        this.cSeriesno = cSeriesno;
    }

    public String getcColor() {
        return cColor;
    }

    public void setcColor(String cColor) {
        this.cColor = cColor == null ? null : cColor.trim();
    }

    public Integer getcSellertype() {
        return cSellertype;
    }

    public void setcSellertype(Integer cSellertype) {
        this.cSellertype = cSellertype;
    }

    public Integer getcGeartype() {
        return cGeartype;
    }

    public void setcGeartype(Integer cGeartype) {
        this.cGeartype = cGeartype;
    }
}