package com.itheima.domain;

import java.io.Serializable;
import java.util.Date;

/*
 * @Author:  Yajun_Xu
 * @Create: 2018/11/27 12:57
 **/
public class Items implements Serializable {
    private Integer id;
    private String name;
    private Integer price;
    private Integer pic;
    private Date createtime;
    private String detail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPic() {
        return pic;
    }

    public void setPic(Integer pic) {
        this.pic = pic;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", pic=" + pic +
                ", createtime=" + createtime +
                ", detail='" + detail + '\'' +
                '}';
    }

    public Items() {
        super ();
        System.out.println ("1213");
    }
}
