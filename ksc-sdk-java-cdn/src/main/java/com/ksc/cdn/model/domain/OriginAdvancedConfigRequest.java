package com.ksc.cdn.model.domain;

import com.ksc.cdn.model.valid.FieldValidate;

import java.util.List;

/**
 * Created by CrazyHorse on 9/22/16.
 */
public class OriginAdvancedConfigRequest {

    @FieldValidate
    private String DomainId;
    /**
     * 配置高级回源策略的开启或关闭 取值: on、off。
     * 注意：开启后会关闭掉基础配置中的的回源配置。默认值关闭。
     * 开启时，下述必须项为必填项；关闭时，只更改此标识，忽略后面的项目。
     */
    @FieldValidate
    private String Enable;
    /**
     * 源站类型 取值：ipaddr、 domain分别表示：IP源站、域名源站。
     */
    @FieldValidate
    private String OriginType;
    @FieldValidate
    private List<OriginAdvancedItem> OriginAdvancedItems;
    /**
     * rr: 轮询； quality: 按质量最优的topN来轮询回源
     */
    @FieldValidate
    private String OriginPolicy;
    /**
     * 该项必填。取值1-10
     */
    @FieldValidate
    private Long OriginPolicyBestCount;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }

    public String getEnable() {
        return Enable;
    }

    public void setEnable(String enable) {
        Enable = enable;
    }

    public String getOriginType() {
        return OriginType;
    }

    public void setOriginType(String originType) {
        OriginType = originType;
    }

    public List<OriginAdvancedItem> getOriginAdvancedItems() {
        return OriginAdvancedItems;
    }

    public void setOriginAdvancedItems(List<OriginAdvancedItem> originAdvancedItems) {
        OriginAdvancedItems = originAdvancedItems;
    }

    public String getOriginPolicy() {
        return OriginPolicy;
    }

    public void setOriginPolicy(String originPolicy) {
        OriginPolicy = originPolicy;
    }

    public Long getOriginPolicyBestCount() {
        return OriginPolicyBestCount;
    }

    public void setOriginPolicyBestCount(Long originPolicyBestCount) {
        OriginPolicyBestCount = originPolicyBestCount;
    }

    public class OriginAdvancedItem {
        /**
         * 源站线路，取值: default：默认源； un： 联通源; ct: 电信源; cm: 移动源。
         */
        @FieldValidate
        private String OriginLine;
        /**
         * 回源地址，可以是IP或域名；IP支持最多20个，以逗号区分，域名只能输入一个。IP与域名不能同时输入。
         */
        @FieldValidate
        private String Origin;

        public String getOriginLine() {
            return OriginLine;
        }

        public void setOriginLine(String originLine) {
            OriginLine = originLine;
        }

        public String getOrigin() {
            return Origin;
        }

        public void setOrigin(String origin) {
            Origin = origin;
        }
    }
}
