/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.springboot.taotao.service.model;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author Kevin
 * @version $Id: TemplateMdcodeNotifyConf.java, v 0.1 2018年1月18日 下午3:21:57 Kevin Exp $
 */
public class TemplateMdcodeNotifyConf {

    /**
     * 商户接收发码通知的地址链接； 只支持https地址； 用户打开会员卡时，支付宝提交POST请求此url地址，通知商户发码。
     */
    @JSONField(name = "url")
    private String url;

    /**
     * 扩展参数信息； 格式为key-value键值对； 支付宝POST请求指定url时，除BizCardNo等固定参数外，将带上ext_params中配置的所有key-value参数。
     */
    @JSONField(name = "ext_params")
    private String extParams;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExtParams() {
        return extParams;
    }

    public void setExtParams(String extParams) {
        this.extParams = extParams;
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "TemplateMdcodeNotifyConf [url=" + url + ", ext_params=" + extParams + "]";
    }

}
