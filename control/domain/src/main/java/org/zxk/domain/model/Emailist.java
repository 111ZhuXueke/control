package org.zxk.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Emailist")
public class Emailist {
    @Id
    private Long id;
    private Long userid;
    private String address;
    private Long isdefault;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Long isdefault) {
        this.isdefault = isdefault;
    }
}
