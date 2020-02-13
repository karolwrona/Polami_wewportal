package pl.polami.wewportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.polami.wewportal.dao.GoodsDao;
import pl.polami.wewportal.domain.Goods;

@Controller
public class TestController {
    @Autowired
    GoodsDao goodsDao;

    @GetMapping("/test/{skrot}")
    public String test(@PathVariable String skrot, Model model) {
        Goods goods = goodsDao.findGoodsBySkrot(skrot);
        model.addAttribute("goods", goods);
        return "test";
    }
}
