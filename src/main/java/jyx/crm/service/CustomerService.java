package jyx.crm.service;

import jyx.crm.domain.Customer;

import java.io.UnsupportedEncodingException;
import java.util.List;

public interface CustomerService {

    //增加客户
    boolean insertCustomer(Customer cust);
    //删除客户
    boolean deleteCustomer(int id);
    //修改客户信息
    boolean updateCustomer(Customer cust);
    //通过姓名查找客户
    Customer getCustomerById(Integer id);
    //通过姓名查找客户
    List<Customer> getCustomerByName(String name) throws UnsupportedEncodingException;
    //查找所有客户
    List<Customer> listCustomer();
}
