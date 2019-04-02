/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.springboot.taotao.service.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;
import java.util.List;

/**
 * @author Kevin
 * @version $Id: TemplateBenfitInfo.java, v 0.1 2018年1月18日 下午3:17:07 Kevin Exp $
 */
public class TemplateBenefitInfo {

    /**
     * 权益描述
     */
    @JSONField(name = "title")
    private String title;

    /**
     * 权益描述信息
     */
    @JSONField(name = "benefit_desc")
    private List<String> benefitDesc;

    /**
     * 开始时间
     */
    @JSONField(name = "start_date")
    private Date startDate;

    /**
     * 权益结束时间
     */
    @JSONField(name = "end_date")
    private Date endDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getBenefitDesc() {
        return benefitDesc;
    }

    public void setBenefitDesc(List<String> benefitDesc) {
        this.benefitDesc = benefitDesc;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "TemplateBenefitInfo [title=" + title + ", benefit_desc=" + benefitDesc
                + ", start_date=" + startDate + ", end_date=" + endDate + "]";
    }

}
