package com.example.carauction.bean;

public class CustomerName {
    private Integer customerID;      //客户编号
    private String name;         //客户最终名

    /**
     *	将CustomerName对象转字符串
     *	@Author: pjj
     *	@Param: null
     *	@Date: 2021/12/15
     *	@return String CustomerName对象转成的字符串
     **/
    public String toString() {
        return "Car{" +
                "customerID=" + customerID +
                ",name='" + name + '\'' +
                '}';
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
     *	获取客户的最终名
     *	@Author: pjj
     *	@Param: null
     *	@Date: 2021/12/15
     *	@return String 客户的最终名
     **/
    public String getName() {
        return name;
    }

    /**
     *	设置客户的最终名
     *	@Author: pjj
     *	@Param: name 客户的最终名ysql
     *	@Date: 2021/12/15
     *	@return null
     **/
    public void setName(String name) {
        this.name = name;
    }
}
