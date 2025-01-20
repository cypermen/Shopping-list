package com.example.shopinglist.domain.usecase

import com.example.shopinglist.domain.ShopItem
import com.example.shopinglist.domain.repository.ShopItemRepository

class DeleteShopItemUseCase(private val shopItemRepository: ShopItemRepository) {
    fun deleteShopItem(shopItem: ShopItem){
        shopItemRepository.deleteShopItem(shopItem = shopItem)
    }
}