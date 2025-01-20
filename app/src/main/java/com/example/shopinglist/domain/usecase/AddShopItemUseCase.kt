package com.example.shopinglist.domain.usecase

import com.example.shopinglist.domain.ShopItem
import com.example.shopinglist.domain.repository.ShopItemRepository

class AddShopItemUseCase(private val shopItemRepository: ShopItemRepository) {
    fun addShopItemUseCase(shopItem:ShopItem){
        shopItemRepository.addShopItemUseCase(shopItem = shopItem)
    }

}