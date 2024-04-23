package com.syqu.shop.service

import com.syqu.shop.domain.Category

interface CategoryService {
    fun save(category: Category)
    fun findAll(): List<Category>
}
