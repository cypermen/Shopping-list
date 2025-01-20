package com.example.shopinglist.domain.repository

import com.example.shopinglist.domain.ShopItem

interface  ShopItemRepository {

    fun addShopItemUseCase(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopList():List<ShopItem>

    fun getShopItem(shopItemId:Int):ShopItem
}