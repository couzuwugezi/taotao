/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.springboot.taotao.service.model;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author Kevin
 * @version $Id: TemplateOpenCardConf.java, v 0.1 2018年1月18日 下午3:19:37 Kevin Exp $
 */
public class TemplateOpenCardConf {

    /**
     * ISV：外部系统  MER：直连商户
     */
    @JSONField(name = "open_card_source_type")
    private String openCardSourceType;

    /**
     * 渠道APPID，提供领卡页面的服务提供方
     */
    @JSONField(name = "source_app_id")
    private String sourceAppId;

    /**
     * 开卡连接，必须http、https开头
     */
    @JSONField(name = "open_card_url")
    private String openCardUrl;

    /**
     * 配置，预留字段，暂时不用
     */
    @JSONField(name = "conf")
    private String conf;

    public String getOpenCardSourceType() {
        return openCardSourceType;
    }

    public void setOpenCardSourceType(String openCardSourceType) {
        this.openCardSourceType = openCardSourceType;
    }

    public String getSourceAppId() {
        return sourceAppId;
    }

    public void setSourceAppId(String sourceAppId) {
        this.sourceAppId = sourceAppId;
    }

    public String getOpenCardUrl() {
        return openCardUrl;
    }

    public void setOpenCardUrl(String openCardUrl) {
        this.openCardUrl = openCardUrl;
    }

    public String getConf() {
        return conf;
    }

    public void setConf(String conf) {
        this.conf = conf;
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "TemplateOpenCardConf [open_card_source_type=" + openCardSourceType
                + ", source_app_id=" + sourceAppId + ", open_card_url=" + openCardUrl + ", conf="
                + conf + "]";
    }

}
