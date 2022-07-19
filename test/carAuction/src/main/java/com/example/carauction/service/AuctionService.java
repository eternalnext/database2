package com.example.carauction.service;

import com.example.carauction.bean.*;
import com.example.carauction.dao.AuctionDao;
import com.example.carauction.result.ResultCodeEnum;
import com.example.carauction.result.ReturnResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * @Author: pjj
 * @Classname: AuctionService
 * @Date: 2021/12/15
 * @Description:拍卖汽车服务层
 */
@Service
public class AuctionService {

    @Autowired
    AuctionDao auctionDao;

    /**
     *	获取汽车总个数
     *	@Author: pjj
     **	@Param: null
     *	@Date: 2021/11/25
     *	@return ReturnResult 响应信息
     **/
    public ReturnResult getCarNumber(){
        ReturnResult returnResult = ReturnResult.getState(ResultCodeEnum.GET_CAR_NUMBER_SUCCESS);
        // 获取汽车表总数
        Integer total = auctionDao.getCarTotal();
        if(total < 0){
            returnResult = ReturnResult.getState(ResultCodeEnum.GET_CAR_NUMBER_ERROR);
        }else {
            // 返回汽车总数
            returnResult.data("totalNum", total);
        }
        return returnResult;
    }

    /**
     *	获取客户总个数
     *	@Author: pjj
     **	@Param: null
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    public ReturnResult getCustomerNumber(){
        ReturnResult returnResult = ReturnResult.getState(ResultCodeEnum.GET_CUSTOMER_NUMBER_SUCCESS);
        // 获取客户表总数
        Integer total = auctionDao.getCustomerTotal();
        if(total < 0){
            returnResult = ReturnResult.getState(ResultCodeEnum.GET_CUSTOMER_NUMBER_ERROR);
        }else {
            // 返回汽车总数
            returnResult.data("totalNum", total);
        }
        return returnResult;
    }

    /**
     *	获取第start两汽车开始的limit两汽车的信息
     *	@Author: pjj
     *	@Param: start 汽车区间开始的下标
     *  @Param: limit 汽车区间的长度
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    public ReturnResult getCarInfo(Integer start, Integer limit){
        ReturnResult returnResult = ReturnResult.getState(ResultCodeEnum.GET_CAR_INFO_SUCCESS);
        // 获取汽车总数
        Integer id_max = auctionDao.getCarTotal();
        // 如果开始下标就大于总数则返回INDEX_TOO_LARGE
        if(start > id_max){
            returnResult = ReturnResult.getState(ResultCodeEnum.GET_CAR_INFO_INDEX_TOO_LARGE);
        }else {
            // 如果请求的汽车下标区域部分超过了总数则返回LIMIT_TOO_LONG
            if (start + limit - 1 > id_max){
                returnResult = ReturnResult.getState(ResultCodeEnum.GET_CAR_INFO_LIMIT_TOO_LONG);
                // 能获取的汽车信息的数量
                int len = id_max - start + 1;
                // 返回汽车数量number存到data中给客户端
                returnResult.data("number", len);
                // 将每一部要返回的汽车的信息存到data中给客户端
                Car[] cars = new Car[len];
                for(int i = 0;i < len;i++){
                    Integer id = start + i;
                    // 获取汽车下标为id的信息
                    cars[i] = auctionDao.getCarInfo(id);
                }
                returnResult.data("cars", cars);
            }
            // 否则返回SUCCESS
            else{
                // 返回汽车数量number给客户端
                returnResult.data("number", limit);
                // 将每一部要返回的汽车的信息存到data中
                Car[] cars = new Car[limit];
                for(int i = 0;i < limit;i++){
                    Integer id = start + i;
                    // 获取汽车下标为id的信息
                    cars[i] = auctionDao.getCarInfo(id);
                }
                returnResult.data("cars", cars);
            }
        }
        return returnResult;
    }

    /**
     *	获取第start个客户开始的limit个客户的信息
     *	@Author: pjj
     *	@Param: start 客户区间开始的下标
     *  @Param: limit 客户区间的长度
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    public ReturnResult getCustomerInfo(Integer start, Integer limit){
        ReturnResult returnResult = ReturnResult.getState(ResultCodeEnum.GET_CUSTOMER_INFO_SUCCESS);
        // 获取客户总数
        Integer id_max = auctionDao.getCustomerTotal();
        // 如果开始下标就大于总数则返回INDEX_TOO_LARGE
        if(start > id_max){
            returnResult = ReturnResult.getState(ResultCodeEnum.GET_CUSTOMER_INFO_INDEX_TOO_LARGE);
        }else {
            // 如果请求的客户下标区域部分超过了总数则返回LIMIT_TOO_LONG
            if (start + limit - 1 > id_max){
                returnResult = ReturnResult.getState(ResultCodeEnum.GET_CUSTOMER_INFO_LIMIT_TOO_LONG);
                // 能获取的客户信息的数量
                int len = id_max - start + 1;
                // 返回客户数量number存到data中给客户端
                returnResult.data("number", len);
                // 将每一部要返回的客户的信息存到data中给客户端
                Customer[] customers = new Customer[len];
                for(int i = 0;i < len;i++){
                    Integer id = start + i;
                    // 获取客户下标为id的信息
                    customers[i] = auctionDao.getCustomerInfo(id);
                }
                returnResult.data("cars", customers);
            }
            // 否则返回SUCCESS
            else{
                // 返回客户数量number给客户端
                returnResult.data("number", limit);
                // 将每一部要返回的客户的信息存到data中
                Customer[] customers = new Customer[limit];
                for(int i = 0;i < limit;i++){
                    Integer id = start + i;
                    // 获取客户下标为id的信息
                    customers[i] = auctionDao.getCustomerInfo(id);
                }
                returnResult.data("customers", customers);
            }
        }
        return returnResult;
    }

    /**
     *	获取某类型汽车总个数
     *	@Author: pjj
     **	@Param: type 汽车类型
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    public ReturnResult getCarTypeNumber(String type){
        ReturnResult returnResult = ReturnResult.getState(ResultCodeEnum.GET_CAR_NUMBER_SUCCESS);
        // 获取汽车表总数
        Integer total = auctionDao.getCarTypeTotal(type);
        if(total < 0){
            returnResult = ReturnResult.getState(ResultCodeEnum.GET_CAR_NUMBER_ERROR);
        }else {
            // 返回汽车总数
            returnResult.data("totalNum", total);
        }
        return returnResult;
    }

    /**
     *	获取类型是type第start辆开始的limit辆汽车的简略信息
     *	@Author: pjj
     *	@Param: type 汽车的类型
     *	@Param: start 汽车区间开始的下标
     *  @Param: limit 汽车区间的长度
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    public ReturnResult getCarTypeInfo(String type,Integer start, Integer limit){
        ReturnResult returnResult = ReturnResult.getState(ResultCodeEnum.GET_CAR_TYPE_INFO_SUCCESS);
        Integer total = auctionDao.getCarTypeTotal(type);
        // 判断数据库中是否有该汽车类型
        if(total == 0){
            returnResult = ReturnResult.getState(ResultCodeEnum.GET_CAR_TYPE_INFO_ERROR);
        }else{
            // 如果开始下标就大于总数则返回INDEX_TOO_LARGE
            if(start > total){
                returnResult = ReturnResult.getState(ResultCodeEnum.GET_CAR_TYPE_INFO_INDEX_TOO_LARGE);
            }else {
                // 如果请求的汽车下标区域部分超过了总数则返回LIMIT_TOO_LONG
                if (start + limit - 1 > total){
                    returnResult = ReturnResult.getState(ResultCodeEnum.GET_CAR_TYPE_INFO_LIMIT_TOO_LONG);
                    // 能获取的汽车信息的数量
                    int len = total - start + 1;
                    // 返回汽车数量number存到data中给客户端
                    returnResult.data("number", len);
                    // 将每一辆要返回的汽车的信息存到data中给客户端
                    returnResult.data("cars", auctionDao.getCarTypeInfo(type, start - 1, len));
                }
                // 否则返回SUCCESS
                else{
                    // 返回电影数量number存到data中给客户端
                    returnResult.data("number", limit);
                    // 将每一辆要返回的汽车的信息存到data中给客户端
                    returnResult.data("cars", auctionDao.getCarTypeInfo(type, start - 1, limit));
                }
            }
        }
        return returnResult;
    }

    /**
     *	获取已有投标汽车总个数
     *	@Author: pjj
     **	@Param: null
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    public ReturnResult getCarBidNumber(){
        ReturnResult returnResult = ReturnResult.getState(ResultCodeEnum.GET_CAR_BID_NUMBER_SUCCESS);
        // 获取汽车表已有投标汽车总数
        Integer total = auctionDao.getCarBidTotal();
        if(total < 0){
            returnResult = ReturnResult.getState(ResultCodeEnum.GET_CAR_BID_NUMBER_ERROR);
        }else {
            // 返回已有投标汽车总数
            returnResult.data("totalNum", total);
        }
        return returnResult;
    }

    /**
     *	获取第start辆开始的limit辆已有投标汽车的最高投标信息
     *	@Author: pjj
     *	@Param: start 汽车区间开始的下标
     *  @Param: limit 汽车区间的长度
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    public ReturnResult getBidsMax(Integer start, Integer limit){
        ReturnResult returnResult = ReturnResult.getState(ResultCodeEnum.GET_CAR_BID_INFO_SUCCESS);
        // 获取汽车总数
        Integer id_max = auctionDao.getCarBidTotal();
        // 如果开始下标就大于总数则返回INDEX_TOO_LARGE
        if(start > id_max){
            returnResult = ReturnResult.getState(ResultCodeEnum.GET_CAR_BID_INFO_INDEX_TOO_LARGE);
        }else {
            // 如果请求的下标区域部分超过了总数则返回LIMIT_TOO_LONG
            if (start + limit - 1 > id_max){
                returnResult = ReturnResult.getState(ResultCodeEnum.GET_CAR_BID_INFO_LIMIT_TOO_LONG);
                // 能获取的信息的数量
                int len = id_max - start + 1;
                // 返回数量number存到data中给客户端
                returnResult.data("number", len);
                // 将每一个的信息存到data中给客户端
                returnResult.data("bids", auctionDao.getBidsMax(start - 1, len));
            }
            // 否则返回SUCCESS
            else{
                // 返回数量number给客户端
                returnResult.data("number", limit);
                // 将每一个的信息存到data中给客户端
                returnResult.data("bids", auctionDao.getBidsMax(start - 1, limit));
            }
        }
        return returnResult;
    }

    /**
     *	获取某汽车投标客户总个数
     *	@Author: pjj
     **	@Param: carID 汽车ID
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    public ReturnResult getBidCustomerNumber(Integer carID){
        ReturnResult returnResult = ReturnResult.getState(ResultCodeEnum.GET_BID_CUSTOMER_NUMBER_SUCCESS);

        if(auctionDao.checkCarID(carID) == null){
            returnResult = ReturnResult.getState(ResultCodeEnum.GET_BID_CUSTOMER_NUMBER_ERROR);
        }else {
            // 获取汽车的投标总数
            Integer total = auctionDao.getBidsTotal(carID);
            // 返回已有投标汽车总数
            returnResult.data("totalNum", total);
        }
        return returnResult;
    }

    /**
     *	获取第start个开始的limit个对某汽车的投标信息
     *	@Author: pjj
     *	@Param: carID 汽车ID
     *	@Param: start 投标区间开始的下标
     *  @Param: limit 投标区间的长度
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    public ReturnResult getBidsInfo(Integer carID, Integer start, Integer limit){
        ReturnResult returnResult = ReturnResult.getState(ResultCodeEnum.GET_BID_INFO_SUCCESS);
        if(auctionDao.checkCarID(carID) == null){
            returnResult = ReturnResult.getState(ResultCodeEnum.GET_BID_INFO_ERROR);
        }else {
            // 获取汽车的投标总数
            Integer id_max = auctionDao.getBidsTotal(carID);
            // 如果开始下标就大于总数则返回INDEX_TOO_LARGE
            if (start > id_max) {
                returnResult = ReturnResult.getState(ResultCodeEnum.GET_BID_INFO_INDEX_TOO_LARGE);
            } else {
                // 如果请求的下标区域部分超过了总数则返回LIMIT_TOO_LONG
                if (start + limit - 1 > id_max) {
                    returnResult = ReturnResult.getState(ResultCodeEnum.GET_BID_INFO_LIMIT_TOO_LONG);
                    // 能获取的信息的数量
                    int len = id_max - start + 1;
                    // 返回数量number存到data中给客户端
                    returnResult.data("number", len);
                    // 将每一个的信息存到data中给客户端
                    returnResult.data("bids", auctionDao.getBidsWinAndLoser(carID,start - 1, len));
                }
                // 否则返回SUCCESS
                else {
                    // 返回数量number给客户端
                    returnResult.data("number", limit);
                    // 将每一个的信息存到data中给客户端
                    returnResult.data("bids", auctionDao.getBidsWinAndLoser(carID,start - 1, limit));
                }
            }
        }
        return returnResult;
    }

    /**
     *	添加汽车
     *	@Author: pjj
     *	@Param: addCar AddCar对象
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    public ReturnResult addCar(AddCar addCar){
        ReturnResult returnResult = ReturnResult.getState(ResultCodeEnum.ADD_CAR_SUCCESS);
        Integer total = auctionDao.getCarTotal();
        auctionDao.addCar(addCar);
        Integer total1 = auctionDao.getCarTotal();
        if(total1 > total){
        }else{
            returnResult = ReturnResult.getState(ResultCodeEnum.ADD_CAR_ERROR);
        }
        return returnResult;
    }

    /**
     *	添加汽车
     *	@Author: pjj
     *	@Param: addCustomer AddCustomer对象
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    public ReturnResult addCustomer(AddCustomer addCustomer){
        ReturnResult returnResult = ReturnResult.getState(ResultCodeEnum.ADD_CUSTOMER_SUCCESS);
        Integer total = auctionDao.getCustomerTotal();
        auctionDao.addCustomer(addCustomer);
        Integer total1 = auctionDao.getCustomerTotal();
        if(total1 > total){
        }else{
            returnResult = ReturnResult.getState(ResultCodeEnum.ADD_CUSTOMER_ERROR);
        }
        return returnResult;
    }

    /**
     *	修改客户姓名
     *	@Author: pjj
     *	@Param: addCustomer AddCustomer对象
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    public ReturnResult changeCustomerName(@RequestBody CustomerName customerName){
        ReturnResult returnResult = ReturnResult.getState(ResultCodeEnum.CHANGE_CUSTOMER_NAME_SUCCESS);
        if(auctionDao.checkCustomerID(customerName.getCustomerID()) == null){
            returnResult = ReturnResult.getState(ResultCodeEnum.CHANGE_CUSTOMER_NAME_ERROR);
        }else{
            auctionDao.changeCustomerName(customerName);
        }
        return returnResult;
    }

    /**
     *	添加投标
     *	@Author: pjj
     *	@Param: Bid Bid对象
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    public ReturnResult addBid(Bid bid){
        ReturnResult returnResult = ReturnResult.getState(ResultCodeEnum.ADD_BID_SUCCESS);
        if(auctionDao.checkCustomerID(bid.getCustomerID()) == null) {
            returnResult = ReturnResult.getState(ResultCodeEnum.ADD_BID_CUSTOMER_ISNULL);
        }else {
            if (auctionDao.checkCarID(bid.getCarID()) == null) {
                returnResult = ReturnResult.getState(ResultCodeEnum.ADD_BID_CAR_ISNULL);
            } else {
                System.out.println(auctionDao.checkDate(bid.getCarID()) + bid.getCarID());
                if(auctionDao.checkDate(bid.getCarID()).equals("expire")){
                    returnResult = ReturnResult.getState(ResultCodeEnum.ADD_BID_CAR_OUTDATE);
                }else {
                    if(auctionDao.checkBid(bid).equals("infeasible")){
                        returnResult = ReturnResult.getState(ResultCodeEnum.ADD_BID_CAR_TOO_SMALL);
                    }
                    auctionDao.addBid(bid);
                }
            }
        }
        return returnResult;
    }
}
