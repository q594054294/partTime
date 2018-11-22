package com.example.wechat.domain.manual;

import com.example.wechat.domain.Commodity;
import com.example.wechat.domain.CommodityClass;
import com.example.wechat.domain.CommodityDetail;
import com.example.wechat.domain.Store;

import java.io.Serializable;
import java.util.List;

public class StoreDTO implements Serializable {

    private Store store;

    private List<Commodity> commodity;

    private List<CommodityClass> commodityClasses;

    private List<CommodityDetail> commodityDetails;

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public List<Commodity> getCommodity() {
        return commodity;
    }

    public void setCommodity(List<Commodity> commodity) {
        this.commodity = commodity;
    }

    public List<CommodityClass> getCommodityClasses() {
        return commodityClasses;
    }

    public void setCommodityClasses(List<CommodityClass> commodityClasses) {
        this.commodityClasses = commodityClasses;
    }

    public List<CommodityDetail> getCommodityDetails() {
        return commodityDetails;
    }

    public void setCommodityDetails(List<CommodityDetail> commodityDetails) {
        this.commodityDetails = commodityDetails;
    }

    @Override
    public String toString() {
        return "StoreDTO{" +
                "store=" + store +
                ", commodity=" + commodity +
                ", commodityClasses=" + commodityClasses +
                ", commodityDetails=" + commodityDetails +
                '}';
    }
}
