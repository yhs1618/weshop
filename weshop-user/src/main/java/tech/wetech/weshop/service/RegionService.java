package tech.wetech.weshop.service;

import tech.wetech.weshop.po.Region;

/**
 * @author cjbi@outlook.com
 */
public interface RegionService extends IService<Region> {

    String queryNameById(Short id);

}
