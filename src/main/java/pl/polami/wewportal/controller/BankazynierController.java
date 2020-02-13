package pl.polami.wewportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.polami.wewportal.dao.GoodsDao;
import pl.polami.wewportal.domain.Goods;

@RestController
public class BankazynierController {
    @Autowired
    GoodsDao goodsDao;
    @GetMapping("/bankazynier")
    public Goods goods(@RequestParam(value = "skrot", defaultValue = "8739-36") String skrot) {
        Goods goods = goodsDao.findGoodsBySkrot(skrot);
        return goods;
    }

}
