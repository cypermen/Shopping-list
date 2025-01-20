package com.example.shopinglist.domain.usecase

import com.example.shopinglist.domain.ShopItem
import com.example.shopinglist.domain.repository.ShopItemRepository

class GetShopItemListUseCase(private val shopItemRepository: ShopItemRepository) {
    fun getShopList():List<ShopItem>{
        return shopItemRepository.getShopList()
    }
}