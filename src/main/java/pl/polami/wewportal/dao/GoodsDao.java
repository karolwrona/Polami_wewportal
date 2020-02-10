package pl.polami.wewportal.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.polami.wewportal.domain.Goods;

import java.util.List;

@Repository
public interface GoodsDao extends JpaRepository<Goods, String>  {
    @Override
    List<Goods> findAll();
    Goods findGoodsBySkrot(String skrot);
}
