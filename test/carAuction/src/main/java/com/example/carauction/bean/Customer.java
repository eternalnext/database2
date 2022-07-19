package com.example.carauction.bean;

/**
 * @Author: pjj
 * @Classname: Customer
 * @Date: 2021/12/15
 * @Description:客户信息文件
 */
public class Customer {
    private Integer customerID;      //客户编号
    private String lastName;         //客户最终名
    private String firstName;        //客户初始名
    private String address;          //地址
    private String city;             //城市
    private String state;            //洲
    private Integer zip;             //邮政编号
    private String telephone;        //电话
    private String emailAddess;      //邮箱

    /**
     *	将Customer对象转字符串
     *	@Author: pjj
     *	@Param: null
     *	@Date: 2021/12/15
     *	@return String Customer对象转成的字符串
     **/
    public String toString() {
        return "Car{" +
                "customerID=" + customerID +
                ",lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", telephone='" + telephone + '\'' +
                ", emailAddess='" + emailAddess + '\'' +
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
    public String getLastName() {
        return lastName;
    }

    /**
     *	设置客户的最终名
     *	@Author: pjj
     *	@Param: lastName 客户的最终名ysql
     *	@Date: 2021/12/15
     *	@return null
     **/
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *	获取客户的初始名
     *	@Author: pjj
     *	@Param: null
     *	@Date: 2021/12/15
     *	@return String 客户的初始名
     **/
    public String getFirstName() {
        return firstName;
    }

    /**
     *	设置客户的初始名
     *	@Author: pjj
     *	@Param: firstName 客户的初始名
     *	@Date: 2021/12/15
     *	@return null
     **/
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *	获取客户的地址
     *	@Author: pjj
     *	@Param: null
     *	@Date: 2021/12/15
     *	@return String 客户的地址
     **/
    public String getAddress() {
        return address;
    }

    /**
     *	设置客户的地址
     *	@Author: pjj
     *	@Param: address 客户的地址
     *	@Date: 2021/12/15
     *	@return null
     **/
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *	获取客户的城市
     *	@Author: pjj
     *	@Param: null
     *	@Date: 2021/12/15
     *	@return String 客户的城市
     **/
    public String getCity() {
        return city;
    }

    /**
     *	设置客户的城市
     *	@Author: pjj
     *	@Param: city 客户的城市
     *	@Date: 2021/12/15
     *	@return null
     **/
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *	获取客户的洲
     *	@Author: pjj
     *	@Param: null
     *	@Date: 2021/12/15
     *	@return String 客户的洲
     **/
    public String getState() {
        return state;
    }

    /**
     *	设置客户的洲
     *	@Author: pjj
     *	@Param: state 客户的洲
     *	@Date: 2021/12/15
     *	@return null
     **/
    public void setState(String state) {
        this.state = state;
    }

    /**
     *	获取客户的邮政编码
     *	@Author: pjj
     *	@Param: null
     *	@Date: 2021/12/15
     *	@return Integer 客户的邮政编码
     **/
    public Integer getZip() {
        return zip;
    }

    /**
     *	设置客户的邮政编码
     *	@Author: pjj
     *	@Param: zip 客户的邮政编码
     *	@Date: 2021/12/15
     *	@return null
     **/
    public void setZip(Integer zip) {
        this.zip = zip;
    }

    /**
     *	获取客户的电话
     *	@Author: pjj
     *	@Param: null
     *	@Date: 2021/12/15
     *	@return String 客户的电话
     **/
    public String getTelephone() {
        return telephone;
    }

    /**
     *	设置客户的电话
     *	@Author: pjj
     *	@Param: telephone 客户的电话
     *	@Date: 2021/12/15
     *	@return null
     **/
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     *	获取客户的邮箱
     *	@Author: pjj
     *	@Param: null
     *	@Date: 2021/12/15
     *	@return String 客户的邮箱
     **/
    public String getEmailAddess() {
        return emailAddess;
    }

    /**
     *	设置客户的邮箱
     *	@Author: pjj
     *	@Param: emailAddess 客户的邮箱
     *	@Date: 2021/12/15
     *	@return null
     **/
    public void setEmailAddess(String emailAddess) {
        this.emailAddess = emailAddess;
    }
}
