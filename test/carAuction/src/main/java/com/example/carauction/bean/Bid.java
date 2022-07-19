package com.example.carauction.bean;

public class Bid {
    private Integer carID;           //汽车编号
    private Integer customerID;      //客户编号
    private float bid;               //标价

    /**
     *	将Bid对象转字符串
     *	@Author: pjj
     *	@Param: null
     *	@Date: 2021/12/15
     *	@return String Bid对象转成的字符串
     **/
    public String toString() {
        return "Car{" +
                "carID=" + carID +
                ",customerID='" + customerID +
                ", bid=" + bid +
                '}';
    }

    /**
     *	获取汽车的ID
     *	@Author: pjj
     *	@Param: null
     *	@Date: 2021/12/15
     *	@return Integer 汽车的ID
     **/
    public Integer getCarID() {
        return carID;
    }

    /**
     *	设置汽车的ID
     *	@Author: pjj
     *	@Param: id 汽车的ID
     *	@Date: 2021/12/15
     *	@return null
     **/
    public void setCarID(Integer carID) {
        this.carID = carID;
    }

    /**
     *	获取客户的ID
     *	@Author: pjj
     *	@Param: null
     *	@Date: 2021/12/15
     *	@return Integer 客户的ID
     **/
    public Integer getCustomerID() {
        return customerID;
    }

    /**
     *	设置客户的ID
     *	@Author: pjj
     *	@Param: id 客户的ID
     *	@Date: 2021/12/15
     *	@return null
     **/
    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    /**
     *	获取投标价格
     *	@Author: pjj
     *	@Param: null
     *	@Date: 2021/12/15
     *	@return float 投标价格
     **/
    public float getBid() {
        return bid;
    }

    /**
     *	设置投标价格
     *	@Author: pjj
     *	@Param: bid 投标价格
     *	@Date: 2021/12/15
     *	@return null
     **/
    public void setBid(float bid) {
        this.bid = bid;
    }
}
