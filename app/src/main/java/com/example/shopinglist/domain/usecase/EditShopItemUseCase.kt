package com.example.shopinglist.domain.usecase

import com.example.shopinglist.domain.ShopItem
import com.example.shopinglist.domain.repository.ShopItemRepository

class EditShopItemUseCase(private val shopItemRepository: ShopItemRepository) {

    fun editShopItem(shopItem: ShopItem){
        shopItemRepository.editShopItem(shopItem = shopItem)
    }
}