package org.zxk.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Searchlisten")
public class Searchlisten {
    @Id
    private Long id;
    private Long userid;
    private String browername;
    private String searchname;
    private String content;
    private Date searchtime;

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

    public String getBrowername() {
        return browername;
    }

    public void setBrowername(String browername) {
        this.browername = browername;
    }

    public String getSearchname() {
        return searchname;
    }

    public void setSearchname(String searchname) {
        this.searchname = searchname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSearchtime() {
        return searchtime;
    }

    public void setSearchtime(Date searchtime) {
        this.searchtime = searchtime;
    }
}
