package com.example.shopinglist.domain.usecase

import com.example.shopinglist.domain.ShopItem
import com.example.shopinglist.domain.repository.ShopItemRepository

class GetShopItemUseCase(private val shopItemRepository: ShopItemRepository) {

    fun getShopItem(shopItemId:Int):ShopItem{
        return shopItemRepository.getShopItem(shopItemId = shopItemId)
    }
}