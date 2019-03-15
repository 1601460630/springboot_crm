package jyx.crm.controller;

import jyx.crm.domain.Happiness;
import jyx.crm.service.HappinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class HappinessController {
    @Autowired
    private HappinessService happinessService;

    @RequestMapping("/query")
    public Happiness testQuery() {
        return happinessService.selectService("北京");
    }

    @RequestMapping("/insert")
    public Happiness testInsert() {
        happinessService.insertService();
        return happinessService.selectService("西安");
    }


}
