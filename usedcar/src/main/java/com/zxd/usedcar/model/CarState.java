package com.zxd.usedcar.model;

public class CarState {
    private Long csId;

    private String csState;

    public Long getCsId() {
        return csId;
    }

    public void setCsId(Long csId) {
        this.csId = csId;
    }

    public String getCsState() {
        return csState;
    }

    public void setCsState(String csState) {
        this.csState = csState == null ? null : csState.trim();
    }
}