package com.zxd.usedcar.model;

public class CarFrom {
    private Long cfId;

    private String cfFrom;

    public Long getCfId() {
        return cfId;
    }

    public void setCfId(Long cfId) {
        this.cfId = cfId;
    }

    public String getCfFrom() {
        return cfFrom;
    }

    public void setCfFrom(String cfFrom) {
        this.cfFrom = cfFrom == null ? null : cfFrom.trim();
    }
}