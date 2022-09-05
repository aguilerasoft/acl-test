package com.acl.test.application.port.input;

import com.acl.test.domain.Brand;

import java.util.List;

public interface BrandCommand {
    List<Brand> getAllBrands();
    Brand getBrand(Integer id);
    void saveBrand(Brand brand);
    void updateBrand(Integer id, Brand brand);
    void deleteBrand(Integer id);
}

