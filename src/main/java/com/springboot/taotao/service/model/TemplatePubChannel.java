/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.springboot.taotao.service.model;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author Kevin
 * @version $Id: TemplatePubChannel.java, v 0.1 2018年1月18日 下午3:22:58 Kevin Exp $
 */
public class TemplatePubChannel {

    /**
     * 1、SHOP_DETAIL:店铺详情页
     * 2、PAYMENT_RESULT: 支付成功页（支付成功页暂不支持）
     */
    @JSONField(name = "pub_channel")
    private String pubChannel;

    /**
     * 扩展信息，无需配置
     */
    @JSONField(name = "ext_info")
    private String extInfo;

    public String getPubChannel() {
        return pubChannel;
    }

    public void setPubChannel(String pubChannel) {
        this.pubChannel = pubChannel;
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "TemplatePubChannel [pub_channel=" + pubChannel + ", ext_info=" + extInfo + "]";
    }

}
