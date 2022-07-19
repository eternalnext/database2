package com.example.carauction.bean;

/**
 * @Author: pjj
 * @Classname: Car
 * @Date: 2021/12/15
 * @Description:汽车信息文件
 */
public class Car {
    private Integer carID;           //汽车编号
    private String location;         //车库
    private Integer year;            //年份
    private String type;             //类型
    private Integer mileage;         //里程
    private String vin;              //发动机号
    private Integer up;              //上架/下架
    private String up_date;          //第一个投标时间


    /**
     *	将Car对象转字符串
     *	@Author: pjj
     *	@Param: null
     *	@Date: 2021/12/15
     *	@return String Car对象转成的字符串
     **/
    public String toString() {
        return "Car{" +
                "carID=" + carID +
                ",location='" + location + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                ", mileage=" + mileage +
                ", vin='" + vin + '\'' +
                ", up=" + up +
                ", up_date='" + up_date + '\'' +
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
     *	获取汽车的车库
     *	@Author: pjj
     *	@Param: null
     *	@Date: 2021/12/15
     *	@return String 汽车的车库
     **/
    public String getLocation() {
        return location;
    }

    /**
     *	设置汽车的车库
     *	@Author: pjj
     *	@Param: location 汽车的车库
     *	@Date: 2021/12/15
     *	@return null
     **/
    public void setlocation(String location) {
        this.location = location;
    }

    /**
     *	获取汽车的年份
     *	@Author: pjj
     *	@Param: null
     *	@Date: 2021/12/15
     *	@return Integer 汽车的年份
     **/
    public Integer getYear() {
        return year;
    }

    /**
     *	设置汽车的年份
     *	@Author: pjj
     *	@Param: year 汽车的年份
     *	@Date: 2021/12/15
     *	@return null
     **/
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     *	获取汽车的类型
     *	@Author: pjj
     *	@Param: null
     *	@Date: 2021/12/15
     *	@return String 汽车的类型
     **/
    public String getType() {
        return type;
    }

    /**
     *	设置汽车的类型
     *	@Author: pjj
     *	@Param: type 汽车的类型
     *	@Date: 2021/12/15
     *	@return null
     **/
    public void setType (String type) {
        this.type = type;
    }

    /**
     *	获取汽车的里程
     *	@Author: pjj
     *	@Param: null
     *	@Date: 2021/12/15
     *	@return Integer 汽车的里程
     **/
    public Integer getMileage() {
        return mileage;
    }

    /**
     *	设置汽车的里程
     *	@Author: pjj
     *	@Param: mileage 汽车的里程
     *	@Date: 2021/12/15
     *	@return null
     **/
    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    /**
     *	获取汽车的发动机号
     *	@Author: pjj
     *	@Param: null
     *	@Date: 2021/12/15
     *	@return String 汽车的发动机号
     **/
    public String getVin() {
        return vin;
    }

    /**
     *	设置汽车的发动机号
     *	@Author: pjj
     *	@Param: vin 汽车的发动机号
     *	@Date: 2021/12/15
     *	@return null
     **/
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     *	获取汽车的上架状态
     *	@Author: pjj
     *	@Param: null
     *	@Date: 2021/12/15
     *	@return Integer 汽车的上架状态
     **/
    public Integer getUp() {
        return up;
    }

    /**
     *	设置汽车的上架状态
     *	@Author: pjj
     *	@Param: up 汽车的上架状态
     *	@Date: 2021/12/15
     *	@return null
     **/
    public void setUp(Integer up) {
        this.up = up;
    }

    /**
     *	获取汽车的第一个投标时间
     *	@Author: pjj
     *	@Param: null
     *	@Date: 2021/12/15
     *	@return String 汽车的第一个投标时间
     **/
    public String getUp_date() {
        return up_date;
    }

    /**
     *	设置汽车的第一个投标时间
     *	@Author: pjj
     *	@Param: up_date 汽车的第一个投标时间
     *	@Date: 2021/12/15
     *	@return null
     **/
    public void setUp_date(String up_date) {
        this.up_date = up_date;
    }
}
