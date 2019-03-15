package jyx.crm.mapper;

import java.util.List;
import jyx.crm.domain.Customer;
import jyx.crm.domain.CustomerExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustomerMapper {
    int countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(Integer custId);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    //通过主键查找
    Customer selectByPrimaryKey(Integer custId);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}