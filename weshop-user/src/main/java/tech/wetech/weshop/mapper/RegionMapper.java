package tech.wetech.weshop.mapper;

import tech.wetech.weshop.po.Region;
import tech.wetech.weshop.utils.MyMapper;

public interface RegionMapper extends MyMapper<Region> {

    String selectNameById(Short id);
}