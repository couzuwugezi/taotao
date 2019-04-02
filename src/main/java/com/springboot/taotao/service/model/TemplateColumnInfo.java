/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.springboot.taotao.service.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Map;

/**
 * @author Kevin
 * @version $Id: TemplateColumnInfo.java, v 0.1 2018年1月18日 下午3:18:18 Kevin Exp $
 */
public class TemplateColumnInfo {

    /**
     * 标准栏位：行为由支付宝统一定，同时已经分配标准Code
     * BALANCE：会员卡余额
     * POINT：积分
     * LEVEL：等级
     * TELEPHONE：联系方式
     * 自定义栏位：行为由商户定义，自定义Code码（只要无重复）
     */
    @JSONField(name = "code")
    private String code;

    /**
     * 1、openNative：打开二级页面，展现 more中descs
     * 2、openWeb：打开URL
     * 3、staticinfo：静态信息
     * 注意：
     * 不填则默认staticinfo；
     * 标准code尽量使用staticinfo，例如TELEPHONE商家电话栏位就只支持staticinfo；
     */
    @JSONField(name = "operate_type")
    private String operateType;

    /**
     * 栏目的标题
     */
    @JSONField(name = "title")
    private String title;

    /**
     * 卡包详情页面，卡栏位右边展现的值
     */
    @JSONField(name = "value")
    private String value;

    /**
     * 扩展信息
     */
    @JSONField(name = "more_info")
    private Map<String, Object> moreInfo;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Map<String, Object> getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(Map<String, Object> moreInfo) {
        this.moreInfo = moreInfo;
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "TemplateColumnInfo [code=" + code + ", operate_type=" + operateType + ", title="
                + title + ", value=" + value + ", more_info=" + moreInfo + "]";
    }


    //测试代码001
    @JSONField(name = "icon_id")
    private String iconId;

    @JSONField(name = "tag")
    private String tag;


    public String getIconId() {
        return iconId;
    }

    public void setIconId(String iconId) {
        this.iconId = iconId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getGroupTitle() {
        return groupTitle;
    }

    public void setGroupTitle(String groupTitle) {
        this.groupTitle = groupTitle;
    }

    @JSONField(name = "group_title")
    private String groupTitle;


}
