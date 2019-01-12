package com.youzhong.entity;

public class Require {
    private Long id;

    private String name;

    private Long proid;

    private Long modelid;

    private Long planid;

    private Long fromid;

    private String examuser;

    private Long rLevel;

    private String content;

    private String senduser;
    
    private Product product;
    
    private Promodel promodel;
    
    private Plan plan;
    
    private From from;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getProid() {
        return proid;
    }

    public void setProid(Long proid) {
        this.proid = proid;
    }

    public Long getModelid() {
        return modelid;
    }

    public void setModelid(Long modelid) {
        this.modelid = modelid;
    }

    public Long getPlanid() {
        return planid;
    }

    public void setPlanid(Long planid) {
        this.planid = planid;
    }

    public Long getFromid() {
        return fromid;
    }

    public void setFromid(Long fromid) {
        this.fromid = fromid;
    }

    public String getExamuser() {
        return examuser;
    }

    public void setExamuser(String examuser) {
        this.examuser = examuser == null ? null : examuser.trim();
    }

    public Long getrLevel() {
        return rLevel;
    }

    public void setrLevel(Long rLevel) {
        this.rLevel = rLevel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getSenduser() {
        return senduser;
    }

    public void setSenduser(String senduser) {
        this.senduser = senduser == null ? null : senduser.trim();
    }

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Promodel getPromodel() {
		return promodel;
	}

	public void setPromodel(Promodel promodel) {
		this.promodel = promodel;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public From getFrom() {
		return from;
	}

	public void setFrom(From from) {
		this.from = from;
	}
    
    
}