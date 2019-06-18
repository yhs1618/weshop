package tech.wetech.weshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.mapper.RegionMapper;
import tech.wetech.weshop.po.Region;
import tech.wetech.weshop.service.BaseService;
import tech.wetech.weshop.service.RegionService;

/**
 * @author cjbi@outlook.com
 */
@RestController
public class RegionServiceImpl extends BaseService<Region> implements RegionService {

    @Autowired
    private RegionMapper regionMapper;

    @Override
    public String queryNameById(Short id) {
        return regionMapper.selectNameById(id);
    }
}
