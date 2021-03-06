package com.chs.activity.repository;

import com.chs.activity.base.response.EasyPage;
import com.chs.activity.modal.entity.ProductEntity;

import java.util.List;

/**
 * @author : HongSheng.Chen
 * @date : 2021/2/18 14:34
 */
public interface IProductRepository {


    EasyPage<ProductEntity> page(Integer pageNum, Integer pageSize, String name);

    List<ProductEntity> findAll();

    ProductEntity findById(String id);

    ProductEntity save(ProductEntity entity);

    void deleteById(String id);

}
