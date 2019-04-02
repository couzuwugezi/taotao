/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.springboot.taotao.service.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * @author Kevin
 * @version $Id: CardTemplate.java, v 0.1 2018年1月15日 下午2:31:10 Kevin Exp $
 */
public class AlipayCardTemplateModifyRequest {

    /**
     * 请求ID
     */
    @JSONField(name = "request_id")
    private String requestId;

    /**
     * 卡模板id（卡模板更新请求中才会有这个id）
     */
    @JSONField(name = "template_id")
    private String templateId;

    /**
     * 业务卡号前缀
     */
    @JSONField(name = "biz_no_prefix")
    private String bizNoPrefix;

    /**
     * 卡包详情页面中展现出的卡码（可用于扫码核销）
     * qrcode: 二维码，扫码得商户开卡传入的external_card_no
     * barcode: 条形码，扫码得商户开卡传入的external_card_no
     */
    @JSONField(name = "write_off_type")
    private String writeOffType;

    /**
     * 模板样式信息
     */
    @JSONField(name = "template_style_info")
    private TemplateStyleInfo templateStyleInfo;

    /**
     * 权益信息
     */
    @JSONField(name = "template_benefit_info")
    private List<TemplateBenefitInfo> templateBenefitInfo;

    /**
     * 栏位信息
     */
    @JSONField(name = "column_info_list")
    private List<TemplateColumnInfo> columnInfoList;

    /**
     * 字段规则列表
     */
    @JSONField(name = "field_rule_list")
    private List<TemplateFieldRule> fieldRuleList;

    /**
     * 卡行动点配置；
     * 行动点，即用户可点击跳转的区块，类似按钮控件的交互；
     * 单张卡最多定制4个行动点
     */
    @JSONField(name = "card_action_list")
    private List<TemplateActionInfo> cardActionList;

    /**
     * 会员卡用户领卡配置，在门店等渠道露出领卡入口时，需要部署的商户领卡H5页面地址
     */
    @JSONField(name = "open_card_conf")
    private TemplateOpenCardConf openCardConf;

    /**
     * 会员卡上架门店id（支付宝门店id），既发放会员卡的商家门店id
     */
    @JSONField(name = "shop_ids")
    private String shopIds;

    /**
     * 卡模板投放渠道
     */
    @JSONField(name = "pub_channels")
    private List<TemplatePubChannel> pubChannels;

    /**
     * 卡级别配置
     */
    @JSONField(name = "card_level_conf")
    private List<TemplateCardLevelConf> cardLevelConf;

    /**
     * 商户动态码通知参数配置： 当write_off_type指定为商户动态码mdbarcode或mdqrcode时必填；
     * 在此字段配置用户打开会员卡时支付宝通知商户生成动态码（发码）的通知参数，如接收通知地址等。
     */
    @JSONField(name = "mdcode_notify_conf")
    private TemplateMdcodeNotifyConf mdcodeNotifyConf;

    /**
     * 卡特定标签，只供特定业务使用，通常接入无需关注
     */
    @JSONField(name = "card_spec_tag")
    private String cardSpecTag;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getBizNoPrefix() {
        return bizNoPrefix;
    }

    public void setBizNoPrefix(String bizNoPrefix) {
        this.bizNoPrefix = bizNoPrefix;
    }

    public String getWriteOffType() {
        return writeOffType;
    }

    public void setWriteOffType(String writeOffType) {
        this.writeOffType = writeOffType;
    }

    public TemplateStyleInfo getTemplateStyleInfo() {
        return templateStyleInfo;
    }

    public void setTemplateStyleInfo(TemplateStyleInfo templateStyleInfo) {
        this.templateStyleInfo = templateStyleInfo;
    }

    public List<TemplateBenefitInfo> getTemplateBenefitInfo() {
        return templateBenefitInfo;
    }

    public void setTemplateBenefitInfo(List<TemplateBenefitInfo> templateBenefitInfo) {
        this.templateBenefitInfo = templateBenefitInfo;
    }

    public List<TemplateColumnInfo> getColumnInfoList() {
        return columnInfoList;
    }

    public void setColumnInfoList(List<TemplateColumnInfo> columnInfoList) {
        this.columnInfoList = columnInfoList;
    }

    public List<TemplateFieldRule> getFieldRuleList() {
        return fieldRuleList;
    }

    public void setFieldRuleList(List<TemplateFieldRule> fieldRuleList) {
        this.fieldRuleList = fieldRuleList;
    }

    public List<TemplateActionInfo> getCardActionList() {
        return cardActionList;
    }

    public void setCardActionList(List<TemplateActionInfo> cardActionList) {
        this.cardActionList = cardActionList;
    }

    public TemplateOpenCardConf getOpenCardConf() {
        return openCardConf;
    }

    public void setOpenCardConf(TemplateOpenCardConf openCardConf) {
        this.openCardConf = openCardConf;
    }

    public String getShopIds() {
        return shopIds;
    }

    public void setShopIds(String shopIds) {
        this.shopIds = shopIds;
    }

    public List<TemplatePubChannel> getPubChannels() {
        return pubChannels;
    }

    public void setPubChannels(List<TemplatePubChannel> pubChannels) {
        this.pubChannels = pubChannels;
    }

    public List<TemplateCardLevelConf> getCardLevelConf() {
        return cardLevelConf;
    }

    public void setCardLevelConf(List<TemplateCardLevelConf> cardLevelConf) {
        this.cardLevelConf = cardLevelConf;
    }

    public TemplateMdcodeNotifyConf getMdcodeNotifyConf() {
        return mdcodeNotifyConf;
    }

    public void setMdcodeNotifyConf(TemplateMdcodeNotifyConf mdcodeNotifyConf) {
        this.mdcodeNotifyConf = mdcodeNotifyConf;
    }

    public String getCardSpecTag() {
        return cardSpecTag;
    }

    public void setCardSpecTag(String cardSpecTag) {
        this.cardSpecTag = cardSpecTag;
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "AlipayCardTemplateRequest [request_id=" + requestId + ", template_id="
                + templateId + ", biz_no_prefix=" + bizNoPrefix
                + ", write_off_type=" + writeOffType
                + ", template_style_info=" + templateStyleInfo + ", template_benefit_info="
                + templateBenefitInfo + ", column_info_list=" + columnInfoList
                + ", field_rule_list=" + fieldRuleList + ", card_action_list=" + cardActionList
                + ", open_card_conf=" + openCardConf
                + ", shop_ids=" + shopIds + ", pub_channels=" + pubChannels + ", card_level_conf="
                + cardLevelConf + ", mdcode_notify_conf=" + mdcodeNotifyConf + ", card_spec_tag="
                + cardSpecTag + "]";
    }

}
