package org.zxk.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Phonelist")
public class Phonelist {
    @Id
    private Long id;
    private Long userid;
    private String phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Long isdefault) {
        this.isdefault = isdefault;
    }
}
