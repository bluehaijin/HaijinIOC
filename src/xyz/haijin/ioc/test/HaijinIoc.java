package xyz.haijin.ioc.test;

import xyz.haijin.ioc.context.SpringContext;

public class HaijinIoc {
    public static void main(String[] args) throws Exception {
        String path = "xyz.haijin.ioc.test";
        SpringContext context = new SpringContext(path);
        IUserService userService = (IUserService) context.getBean("userbiz");
        System.out.println(userService.findOrder("lyl"));
    }
}
