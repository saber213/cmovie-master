package com.jxau.wmy.service.impl;

import com.jxau.wmy.mapper.CategoryMapper;
import com.jxau.wmy.pojo.Category;
import com.jxau.wmy.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getAll() {
        return categoryMapper.getAll();
    }

    @Override
    public Category getById(Integer id) {
        return categoryMapper.getById(id);
    }

    @Override
    public int addCategory(Category category) {
        return categoryMapper.addCategory(category);
    }

    @Override
    public Category getByName(String name) {
        return categoryMapper.getByName(name);
    }

    @Override
    public int updateCategory(Category category) {
        return categoryMapper.updateCategory(category);
    }

    @Override
    public int deleteCategory(Integer id) {
        return categoryMapper.deleteCategory(id);
    }
}
