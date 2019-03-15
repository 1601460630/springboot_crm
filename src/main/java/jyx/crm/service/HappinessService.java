package jyx.crm.service;


import jyx.crm.dao.HappinessDao;
import jyx.crm.domain.Happiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;

@Service
public class HappinessService {

    @Autowired
    private HappinessDao happinessDao;

    public Happiness selectService(String city){
        return happinessDao.findHappinessByCity(city);
    }

    @Transactional
    public void insertService(){
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("city", "西安");
        map.put("num", 9421);

        happinessDao.insertHappiness(map);
        int a = 1 / 0; //模拟故障
        happinessDao.insertHappiness(map);
    }


}
