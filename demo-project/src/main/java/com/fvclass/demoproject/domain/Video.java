package com.fvclass.demoproject.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Video implements Serializable {
    private int id;

    private int price;

    private String title;

    private String summary;

    private String coverImg;

    private Date createTime;

    private List<Chapter> chapterList;

    public void setChapterList(List<Chapter> chapterList) {
        this.chapterList = chapterList;
    }

    public List<Chapter> getChapterList() {
        return chapterList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public  Video(){};
    public  Video(int id ,String title){
        this.id = id;
        this.title = title;
        this.createTime = new Date();
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", price=" + price +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", coverImg='" + coverImg + '\'' +
                ", createTime=" + createTime +
                ", chapterList=" + chapterList +
                '}';
    }
}
