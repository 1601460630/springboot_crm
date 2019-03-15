package jyx.crm.dao;

import jyx.crm.domain.Happiness;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface HappinessDao {

    Happiness findHappinessByCity(String city);

    int insertHappiness(HashMap<String, Object> map);

}
