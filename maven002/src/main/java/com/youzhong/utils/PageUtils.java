package com.youzhong.utils;

import java.util.HashMap;
import java.util.Map;

public class PageUtils {

            private Integer page;
            private Integer rows;
            private Integer start;
            private Integer end;

            private Map<String,Object> params=new HashMap<String, Object>();

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

  public PageUtils(Integer page, Integer rows) {
        this.page = page;
        this.rows = rows;
        this.start = (this.page-1)*this.rows;
        this.end = this.page*this.rows;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    public PageUtils() {
    }
}
