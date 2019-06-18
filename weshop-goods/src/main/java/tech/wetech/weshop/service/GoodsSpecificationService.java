package tech.wetech.weshop.service;

import tech.wetech.weshop.po.GoodsSpecification;

import java.util.List;

public interface GoodsSpecificationService extends IService<GoodsSpecification> {

    List<String> queryValueByGoodsIdAndIdIn(Integer goodsId, List<Integer> goodsSpecificationIds);
}
