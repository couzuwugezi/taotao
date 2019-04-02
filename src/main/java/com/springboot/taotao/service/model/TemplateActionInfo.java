/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.springboot.taotao.service.model;

/**
 * @author Kevin
 * @version $Id: TemplateActionInfo.java, v 0.1 2018年1月18日 下午3:18:57 Kevin Exp $
 */
public class TemplateActionInfo {

    /**
     * 行动点业务CODE
     */
    private String code;

    /**
     * 行动点展示文案
     */
    private String text;

    /**
     * 行动点跳转链接
     */
    private String url;

    /**
     * Getter method for property <tt>code</tt>.
     *
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     *
     * @param code value to be assigned to property code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter method for property <tt>text</tt>.
     *
     * @return property value of text
     */
    public String getText() {
        return text;
    }

    /**
     * Setter method for property <tt>text</tt>.
     *
     * @param text value to be assigned to property text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Getter method for property <tt>url</tt>.
     *
     * @return property value of url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Setter method for property <tt>url</tt>.
     *
     * @param url value to be assigned to property url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "TemplateActionInfo [code=" + code + ", text=" + text + ", url=" + url + "]";
    }

}
