package org.zxk.domain.model;

public class ControlKey {
    private Integer id;
    private Integer userid;
    private String appname;
    private String startstop;
    private String volumeadd;
    private String volumereduce;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getStartstop() {
        return startstop;
    }

    public void setStartstop(String startstop) {
        this.startstop = startstop;
    }

    public String getVolumeadd() {
        return volumeadd;
    }

    public void setVolumeadd(String volumeadd) {
        this.volumeadd = volumeadd;
    }

    public String getVolumereduce() {
        return volumereduce;
    }

    public void setVolumereduce(String volumereduce) {
        this.volumereduce = volumereduce;
    }
}
