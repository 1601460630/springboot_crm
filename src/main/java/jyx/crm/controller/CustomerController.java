package jyx.crm.controller;

import jyx.crm.domain.Customer;
import jyx.crm.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    public CustomerServiceImpl customerService;

    // 添加客户
    @RequestMapping("/insert")
    public ModelAndView insertCustomer(Customer customer) {
        //这里的flag可能要删掉
        boolean flag = false;
        //设定向前端传送的数据和指定页面 ModelAndView 是Spring MVC中的一种方法
        ModelAndView modelAndView = new ModelAndView();
        // 1.调用Service执行查找逻辑
        flag = customerService.insertCustomer(customer);
        // 2.视情况指定页面，其实在实际上线之后不应该有error这个选项
        if (flag == true)
            modelAndView.setViewName("/customer/success");
        else
            modelAndView.setViewName("/customer/error");

        return modelAndView;

    }

    // 删除客户
    @RequestMapping("/delete")
    public ModelAndView delete(Integer id) {  //不知道为什么，这里一定要用Interger类型才可以
        boolean flag = false;

        ModelAndView modelAndView = new ModelAndView();

        // 1.调用Service执行查找逻辑
        flag = customerService.deleteCustomer(id);
        // 2.视情况返回对应参数，其实在实际上线之后不应该有error这个选项
        if (flag == true)
            modelAndView.setViewName("/customer/success");
        else
            modelAndView.setViewName("/customer/error");

        return modelAndView;

    }

    // 修改客户，中文通过
    @RequestMapping("/update")
    public String update(Customer cust) {

        //测试用
        int id = 10;
        cust = customerService.getCustomerById(id);
        cust.setCustName("啦啦啦");

        boolean flag = false;
        // 1.调用Service执行查找逻辑
        flag = customerService.updateCustomer(cust);
        // 2.视情况返回对应参数，其实在实际上线之后不应该有error这个选项
        if (flag == true)
            return "成功了";
        else
            return "tmd,失败了";

    }



    /*
    这里只是前期测试用的，成功之后便没用了
    @RequestMapping("/findAll")
    public List<Customer> findAll() {

        return customerService.findAll();
    }
    */

    //通过主键编号查找
    @RequestMapping("/findById")
    public Customer getCustomerById(int id) {

        return customerService.getCustomerById(id);
    }

    //通过姓名查找，模糊查找
    @RequestMapping("/findByName")
    public String getCustomerByName() {

        String name = "江";

        return customerService.getCustomerByName(name).toString();
    }


}
