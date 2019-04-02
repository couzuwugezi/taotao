/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.springboot.taotao.service.model;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author Kevin
 * @version $Id: TemplateCardLevelConf.java, v 0.1 2018年1月18日 下午3:20:16 Kevin Exp $
 */
public class TemplateCardLevelConf {

    /**
     * 会员级别 该级别和开卡接口中的level要一致
     */
    @JSONField(name = "level")
    private String level;

    /**
     * 会员级别显示名称
     */
    @JSONField(name = "level_show_name")
    private String levelShowName;

    /**
     * 会员级别对应icond对应的id
     */
    @JSONField(name = "level_icon")
    private String levelIcon;

    /**
     * 会员级别描述
     */
    @JSONField(name = "level_desc")
    private String levelDesc;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevelShowName() {
        return levelShowName;
    }

    public void setLevelShowName(String levelShowName) {
        this.levelShowName = levelShowName;
    }

    public String getLevelIcon() {
        return levelIcon;
    }

    public void setLevelIcon(String levelIcon) {
        this.levelIcon = levelIcon;
    }

    public String getLevelDesc() {
        return levelDesc;
    }

    public void setLevelDesc(String levelDesc) {
        this.levelDesc = levelDesc;
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "TemplateCardLevelConf [level=" + level + ", level_show_name=" + levelShowName
                + ", level_icon=" + levelIcon + ", level_desc=" + levelDesc + "]";
    }

}
