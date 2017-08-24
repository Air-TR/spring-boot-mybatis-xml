package com.tr.sbmx.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author taorun
 * 2017/8/8 下午2:36
 */

@Entity
public class City {

    @Id
    private Integer id;

    private String location;

    private Integer ip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getIp() {
        return ip;
    }

    public void setIp(Integer ip) {
        this.ip = ip;
    }

}
