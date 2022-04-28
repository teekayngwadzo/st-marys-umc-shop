package zw.co.econet.assessment.area;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zw.co.econet.assessment.area.service.AreaService;
import zw.co.econet.assessment.common.BusinessRuntimeException;
import zw.co.econet.assessment.shop.Shop;
import zw.co.econet.assessment.shop.service.ShopService;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaTest {


    @Autowired
    AreaService areaService;

    @Autowired
    ShopService shopService;

    @Test
    public void findAreaAndShops() {
        Long id = 1L;
        var area = areaService.findById(id);
        assertFalse(area.isEmpty());
    }

    @Test
    public void saveShop() {
        Area area = areaService.findById(1L).get();
        Shop shop = new Shop();
        shop.setName("EconetShop");
        shop.setArea(area);
        var shopToSave = shopService.save(shop);
        assertNotNull(shopToSave);

    }

    @Test
    public void saveShopNameExist() {
        Area area = areaService.findById(1L).get();
        Shop shop = new Shop();
        shop.setName("EconetShop");
        shop.setArea(area);
        List<String> shops = shopService.findAll().stream().map(Shop::getName).collect(Collectors.toList());

        var exists = shops.contains(shop.getName());

        if (exists) {
            throw new BusinessRuntimeException("Name Already Exists");
        } else {
            var shopToSave = shopService.save(shop);
            assertNotNull(shopToSave);
        }
    }

}
