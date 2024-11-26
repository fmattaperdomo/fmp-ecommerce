package com.fmattaperdomo.fmp_ecommerce.service;

import com.fmattaperdomo.fmp_ecommerce.model.Category;
import java.util.List;


public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);
}
