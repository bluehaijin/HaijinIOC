package xyz.haijin.ioc.test;

import xyz.haijin.ioc.annoation.IocService;

@IocService
public class OrderService implements IOrderService {
    public String findOrder(String username) {
        return "用户"+username+"的订单编号是:1001";
    }
}