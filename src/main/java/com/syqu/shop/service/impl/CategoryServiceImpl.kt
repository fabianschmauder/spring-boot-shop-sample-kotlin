package com.syqu.shop.service.impl

import com.syqu.shop.domain.Category
import com.syqu.shop.repository.CategoryRepository
import com.syqu.shop.service.CategoryService
import org.springframework.stereotype.Service

@Service
class CategoryServiceImpl(private val categoryRepository: CategoryRepository) : CategoryService {
    override fun save(category: Category) {
        categoryRepository.save(category)
    }

    override fun findAll(): List<Category> {
        return categoryRepository.findAll()
    }
}
