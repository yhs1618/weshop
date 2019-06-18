package tech.wetech.weshop.service;

import tech.wetech.weshop.dto.GoodsCategoryDTO;
import tech.wetech.weshop.dto.GoodsDetailDTO;
import tech.wetech.weshop.dto.GoodsListDTO;
import tech.wetech.weshop.dto.GoodsResultDTO;
import tech.wetech.weshop.po.Goods;
import tech.wetech.weshop.query.GoodsSearchQuery;

import java.util.List;

/**
 * @author cjbi@outlook.com
 */
public interface GoodsService extends IService<Goods> {

    List<Goods> queryListByCategoryIdIn(List<Integer> categoryIdList);

    GoodsResultDTO queryList(GoodsSearchQuery goodsSearchQuery);

    GoodsDetailDTO queryGoodsDetail(Integer goodsId);

    List<GoodsListDTO> queryRelatedGoods(Integer goodsId);

    GoodsCategoryDTO queryGoodsCategory(Integer categoryId);
}
