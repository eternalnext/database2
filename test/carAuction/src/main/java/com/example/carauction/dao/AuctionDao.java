package com.example.carauction.dao;

import com.example.carauction.bean.*;
import com.example.carauction.result.ReturnResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @version v2.2
 * @ClassName AuctionDao
 * @Description TODO
 * @Author pjj
 * @Date 2021/12/15
 **/
@Repository
public interface AuctionDao {

    /**
     *	获取汽车总个数
     *	@Author: pjj
     **	@Param: null
     *	@Date: 2021/11/25
     *	@return Integer 汽车表总数
     **/
    public Integer getCarTotal ();

    /**
     *	获取客户总个数
     *	@Author: pjj
     **	@Param: null
     *	@Date: 2021/11/25
     *	@return Integer 客户表总数
     **/
    public Integer getCustomerTotal ();

    /**
     *	获取汽车信息
     *	@Author: pjj
     **	@Param: id 汽车ID
     *	@Date: 2021/11/25
     *	@return Car 汽车信息
     **/
    public Car getCarInfo (@Param("id") Integer id);

    /**
     *	获取客户信息
     *	@Author: pjj
     **	@Param: id 客户ID
     *	@Date: 2021/11/25
     *	@return Car 客户信息
     **/
    public Customer getCustomerInfo (@Param("id") Integer id);

    /**
     *	获取某类型汽车总个数
     *	@Author: pjj
     **	@Param: type 汽车类型
     *	@Date: 2021/12/15
     *	@return Integer 某类型汽车总个数
     **/
    public Integer getCarTypeTotal (@Param("type") String type);

    /**
     *	获取特定类型汽车信息
     *	@Author: pjj
     **	@Param: type 汽车类型
     *	@Param: start 汽车区间开始的下标
     *  @Param: limit 汽车区间的长度
     *	@Date: 2021/11/25
     *	@return List<Map<String, Object>> 汽车信息
     **/
    public List<Map<String, Object>> getCarTypeInfo (@Param("type") String type, @Param("start") Integer start, @Param("limit") Integer limit);

    /**
     *	获取已有投标汽车总个数
     *	@Author: pjj
     **	@Param: null
     *	@Date: 2021/12/15
     *	@return Integer 已有投标汽车总个数
     **/
    public Integer getCarBidTotal ();

    /**
     *	获取第start辆开始的limit辆已有投标汽车的最高投标信息
     *	@Author: pjj
     *	@Param: start 汽车区间开始的下标
     *  @Param: limit 汽车区间的长度
     *	@Date: 2021/11/25
     *	@return List<Map<String, Object>> 汽车最高投标信息
     **/
    public List<Map<String, Object>> getBidsMax (@Param("start") Integer start, @Param("limit") Integer limit);

    /**
     *	查找汽车ID
     *	@Author: pjj
     *	@Param: carID 汽车ID
     *	@Date: 2021/11/25
     *	@return Integer 汽车ID
     **/
    public Integer checkCarID(@Param("carID") Integer carID);

    /**
     *	获取某汽车投标客户总个数
     *	@Author: pjj
     **	@Param: carID 汽车ID
     *	@Date: 2021/12/15
     *	@return Integer 某汽车投标客户总个数
     **/
    public Integer getBidsTotal (@Param("carID") Integer carID);

    /**
     *	获取第start个开始的limit个对某汽车的投标信息
     *	@Author: pjj
     *	@Param: carID 汽车ID
     *	@Param: start 汽车区间开始的下标
     *  @Param: limit 汽车区间的长度
     *	@Date: 2021/11/25
     *	@return List<Map<String, Object>> 第start个开始的limit个对某汽车的投标信息
     **/
    public List<Map<String, Object>> getBidsWinAndLoser (@Param("carID") Integer carID, @Param("start") Integer start, @Param("limit") Integer limit);

    /**
     *	添加汽车
     *	@Author: pjj
     *	@Param: addCar AddCar对象
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    public Integer addCar(AddCar addCar);

    /**
     *	添加汽车
     *	@Author: pjj
     *	@Param: addCustomer AddCustomer对象
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    public Integer addCustomer(AddCustomer addCustomer);

    /**
     *	查找汽车ID
     *	@Author: pjj
     *	@Param: carID 汽车ID
     *	@Date: 2021/11/25
     *	@return Integer 汽车ID
     **/
    public Integer checkCustomerID(@Param("customerID") Integer customerID);

    /**
     *	修改客户姓名
     *	@Author: pjj
     *	@Param: addCustomer AddCustomer对象
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    public Integer changeCustomerName(CustomerName customerName);

    /**
     *	检查汽车拍卖是否结束
     *	@Author: pjj
     *	@Param: carID 汽车ID
     *	@Date: 2021/12/15
     *	@return String 是否结束
     **/
    public String checkDate(@Param("carID") Integer carID);

    /**
     *	检查投标是否超过最高
     *	@Author: pjj
     *	@Param: Bid Bid对象
     *	@Date: 2021/12/15
     *	@return String 是否结束
     **/
    public String checkBid(Bid bid);

    /**
     *	添加投标
     *	@Author: pjj
     *	@Param: Bid Bid对象
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    public Integer addBid(Bid bid);

}
