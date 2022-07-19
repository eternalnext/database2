package com.example.carauction.controller;

import com.example.carauction.bean.AddCar;
import com.example.carauction.bean.AddCustomer;
import com.example.carauction.bean.Bid;
import com.example.carauction.bean.CustomerName;
import com.example.carauction.result.ReturnResult;
import com.example.carauction.service.AuctionService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: pjj
 * @Date: 2021/12/15
 * @Description:拍卖汽车接口控制层文件
 */
@RestController
@CrossOrigin
public class AuctionController {
    @Autowired
    private AuctionService auctionService;

    /**
     *	获取汽车总个数
     *	@Author: pjj
     **	@Param: null
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    @GetMapping(path = "get/car/number")
    public ReturnResult getCarNumber(){
        return auctionService.getCarNumber();
    }

    /**
     *	获取客户总个数
     *	@Author: pjj
     **	@Param: null
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    @GetMapping(path = "get/customer/number")
    public ReturnResult getCustomerNumber(){
        return auctionService.getCustomerNumber();
    }

    /**
     *	获取第start辆汽车开始的limit辆汽车的信息
     *	@Author: pjj
     *	@Param: start 汽车区间开始的下标
     *  @Param: limit 汽车区间的长度
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    @GetMapping(path = "get/car/info")
    public ReturnResult getCarInfo(@RequestParam("start") Integer start, @RequestParam("limit") Integer limit){
        return auctionService.getCarInfo(start, limit);
    }

    /**
     *	获取第start个客户开始的limit个客户的信息
     *	@Author: pjj
     *	@Param: start 客户区间开始的下标
     *  @Param: limit 客户区间的长度
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    @GetMapping(path = "get/customer/info")
    public ReturnResult getCustomerInfo(@RequestParam("start") Integer start, @RequestParam("limit") Integer limit){
        return auctionService.getCustomerInfo(start, limit);
    }

    /**
     *	获取某类型汽车总个数
     *	@Author: pjj
     **	@Param: type 汽车类型
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    @GetMapping(path = "get/car/type_number")
    public ReturnResult getCarTypeNumber(@RequestParam("type") String type){
        return auctionService.getCarTypeNumber(type);
    }

    /**
     *	获取第start辆汽车开始的limit辆特定类型汽车的信息
     *	@Author: pjj
     *  @Param: type 汽车类型
     *	@Param: start 汽车区间开始的下标
     *  @Param: limit 汽车区间的长度
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    @GetMapping(path = "get/car/type_info")
    public ReturnResult getCarTypeInfo(@RequestParam("type") String type, @RequestParam("start") Integer start, @RequestParam("limit") Integer limit){
        return auctionService.getCarTypeInfo(type, start, limit);
    }

    /**
     *	获取已有投标汽车总个数
     *	@Author: pjj
     **	@Param: null
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    @GetMapping(path = "get/car/have_bid_number")
    public ReturnResult getCarBidNumber(){
        return auctionService.getCarBidNumber();
    }

    /**
     *	获取第start辆开始的limit辆已有投标汽车的最高投标信息
     *	@Author: pjj
     *	@Param: start 汽车区间开始的下标
     *  @Param: limit 汽车区间的长度
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    @GetMapping(path = "get/bids/maxBids")
    public ReturnResult getBidsMax(@RequestParam("start") Integer start, @RequestParam("limit") Integer limit){
        return auctionService.getBidsMax(start, limit);
    }

    /**
     *	获取某汽车投标客户总个数
     *	@Author: pjj
     **	@Param: carID 汽车ID
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    @GetMapping(path = "get/bids/win_and_loser_number")
    public ReturnResult getBidCustomerNumber(@RequestParam("carID") Integer carID){
        return auctionService.getBidCustomerNumber(carID);
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
    @GetMapping(path = "get/bids/win_and_loser_info")
    public ReturnResult getBidsInfo(@RequestParam("carID") Integer carID, @RequestParam("start") Integer start, @RequestParam("limit") Integer limit){
        return auctionService.getBidsInfo(carID, start, limit);
    }

    /**
     *	添加汽车
     *	@Author: pjj
     *	@Param: addCar AddCar对象
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    @PostMapping(path = "add/car")
    public ReturnResult addCar(@RequestBody AddCar addCar){
        return auctionService.addCar(addCar);
    }

    /**
     *	添加客户
     *	@Author: pjj
     *	@Param: addCustomer AddCustomer对象
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    @PostMapping(path = "add/customer")
    public ReturnResult addCustomer(@RequestBody AddCustomer addCustomer){
        return auctionService.addCustomer(addCustomer);
    }

    /**
     *	修改客户姓名
     *	@Author: pjj
     *	@Param: addCustomer AddCustomer对象
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    @PostMapping(path = "customer/change_name")
    public ReturnResult changeCustomerName(@RequestBody CustomerName customerName){
        System.out.println(customerName.getCustomerID());
        System.out.println(customerName.getName());
        return auctionService.changeCustomerName(customerName);
    }

    /**
     *	添加投标
     *	@Author: pjj
     *	@Param: Bid Bid对象
     *	@Date: 2021/12/15
     *	@return ReturnResult 响应信息
     **/
    @PostMapping(path = "add/bid")
    public ReturnResult addBid(@RequestBody Bid bid){
        return auctionService.addBid(bid);
    }
}
