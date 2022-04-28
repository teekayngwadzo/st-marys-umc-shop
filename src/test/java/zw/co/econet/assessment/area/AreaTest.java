package zw.co.econet.assessment.area;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import zw.co.econet.assessment.area.service.AreaService;

import static org.junit.Assert.*;

public class AreaTest {


    @Autowired
    AreaService areaService;

    @Test
    public void findAreaAndShops() {
        Long id = 1L;
        var area = areaService.findById(id);
        assertFalse(area.isEmpty());

    }


}
