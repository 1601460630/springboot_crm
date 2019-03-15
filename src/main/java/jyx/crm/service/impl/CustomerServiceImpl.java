package jyx.crm.service.impl;


import jyx.crm.domain.Customer;
import jyx.crm.domain.CustomerExample;
import jyx.crm.mapper.CustomerMapper;
import jyx.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override//增
    public boolean insertCustomer(Customer customer) {

        int num = customerMapper.insert(customer);

        if (num == 1)
            return true;
        else
            return false;
    }

    @Override//删
    public boolean deleteCustomer(int id) {

        int num = customerMapper.deleteByPrimaryKey(id);

        if (num == 1)
            return true;
        else
            return false;
    }

    @Override//改
    public boolean updateCustomer(Customer cust) {

        int num = customerMapper.updateByPrimaryKey(cust);

        if (num == 1)
            return true;
        else
            return false;
    }

    @Override//查，通过主键查找
    public Customer getCustomerById(Integer id) {
        return customerMapper.selectByPrimaryKey(id);
    }

    @Override//查，通过姓名查找
    public List<Customer> getCustomerByName(String name)  {

        CustomerExample example = new CustomerExample();

        CustomerExample.Criteria criteria = example.createCriteria();

        criteria.andCustNameLike("%"+name+"%");

        return customerMapper.selectByExample(example);
    }

    @Override
    public List<Customer> listCustomer() {
        return null;
    }

    /*public List<Customer> findAll() {

        return customerMapper.findAll();
    }*/




}
