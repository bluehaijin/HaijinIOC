package xyz.haijin.ioc.test;

import xyz.haijin.ioc.annoation.IocResource;
import xyz.haijin.ioc.annoation.IocService;

/**
 * @Description
 */
@IocService(name = "userbiz")
public class UserService implements IUserService {

    @IocResource
    private IOrderService orderService;
    public String findOrder(String username) {
        return orderService.findOrder(username);
    }
}
