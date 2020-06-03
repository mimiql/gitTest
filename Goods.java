public class Goods {
    private Integer id;

    private String goodsId;

    private String categoryId;

    private String goodsName;

    private String unit;

    private String keyword;

    private String description;

    private Double costPrice;

    private Double salePrice;

    private Double marketPrice;

    private Double stock;

    private Double lowStock;

    private Integer publish;

    private String picture;

    private String putTime;

    private Integer type;

    public Integer getId() {
        return this.id;
    }

    public String getGoodsId() {
        return this.goodsId;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public String getGoodsName() {
        return this.goodsName;
    }

    public String getUnit() {
        return this.unit;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public String getDescription() {
        return this.description;
    }

    public Double getCostPrice() {
        return this.costPrice;
    }

    public Double getSalePrice() {
        return this.salePrice;
    }

    public Double getMarketPrice() {
        return this.marketPrice;
    }

    public Double getStock() {
        return this.stock;
    }

    public Double getLowStock() {
        return this.lowStock;
    }

    public Integer getPublish() {
        return this.publish;
    }

    public String getPicture() {
        return this.picture;
    }

    public String getPutTime() {
        return this.putTime;
    }

    public Integer getType() {
        return this.type;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }

    public void setLowStock(Double lowStock) {
        this.lowStock = lowStock;
    }

    public void setPublish(Integer publish) {
        this.publish = publish;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setPutTime(String putTime) {
        this.putTime = putTime;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}