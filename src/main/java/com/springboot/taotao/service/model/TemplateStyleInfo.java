/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.springboot.taotao.service.model;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author Kevin
 * @version $Id: TemplateStyleInfo.java, v 0.1 2018年1月18日 下午3:16:26 Kevin Exp $
 */
public class TemplateStyleInfo {

    /**
     * 钱包端显示名称
     */
    @JSONField(name = "card_show_name")
    private String cardShowName;

    /**
     * logo的图片ID
     */
    @JSONField(name = "logo_id")
    private String logoId;

    /**
     * 背景图片Id
     */
    @JSONField(name = "background_id")
    private String backgroundId;

    /**
     * 背景色(rgb(55,112,179))
     */
    @JSONField(name = "bg_color")
    private String bgColor;

    @JSONField(name = "front_text_list_enable")
    private String frontTextListEnable;

    @JSONField(name = "front_image_enable")
    private String frontImageEnable;

    @JSONField(name = "feature_descriptions")
    private String featureDescriptions;

    @JSONField(name = "slogan")
    private String slogan;

    @JSONField(name = "slogan_img_id")
    private String sloganImgId;

    @JSONField(name = "brand_name")
    private String brandName;

    public String getCardShowName() {
        return cardShowName;
    }

    public void setCardShowName(String cardShowName) {
        this.cardShowName = cardShowName;
    }

    public String getLogoId() {
        return logoId;
    }

    public void setLogoId(String logoId) {
        this.logoId = logoId;
    }

    public String getBackgroundId() {
        return backgroundId;
    }

    public void setBackgroundId(String backgroundId) {
        this.backgroundId = backgroundId;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public String getFrontTextListEnable() {
        return frontTextListEnable;
    }

    public void setFrontTextListEnable(String frontTextListEnable) {
        this.frontTextListEnable = frontTextListEnable;
    }

    public String getFrontImageEnable() {
        return frontImageEnable;
    }

    public void setFrontImageEnable(String frontImageEnable) {
        this.frontImageEnable = frontImageEnable;
    }

    public String getFeatureDescriptions() {
        return featureDescriptions;
    }

    public void setFeatureDescriptions(String featureDescriptions) {
        this.featureDescriptions = featureDescriptions;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getSloganImgId() {
        return sloganImgId;
    }

    public void setSloganImgId(String sloganImgId) {
        this.sloganImgId = sloganImgId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "TemplateStyleInfo [card_show_name=" + cardShowName + ", logo_id=" + logoId
                + ", background_id=" + backgroundId + ", bg_color=" + bgColor
                + ", front_text_list_enable=" + frontTextListEnable + ", front_image_enable="
                + frontImageEnable + ", feature_descriptions=" + featureDescriptions + ", slogan="
                + slogan + ", slogan_img_id=" + sloganImgId + ", brand_name=" + brandName + "]";
    }

    //测试0001

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    @JSONField(name = "column_info_layout")
    private String layout;

}
