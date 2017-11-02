package org.zxk.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Conkey")
public class Conkey {
    @Id
    private Long id;
    private String appname;
    private String startstop;
    private String volumeadd;
    private String volumereduce;
    private Long isdefault;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Long isdefault) {
        this.isdefault = isdefault;
    }
}
