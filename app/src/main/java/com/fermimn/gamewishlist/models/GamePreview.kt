package com.fermimn.gamewishlist.models

open class GamePreview (val id: Int) {

    var title: String? = null
    var platform: String? = null
    var publisher: String? = null
    var cover: String? = null
    private val prices: Price = Price()      // a game can exist without a price

    var newPrice: Float?
        get() = prices.new
        set(value) { prices.new = value }

    var usedPrice: Float?
        get() = prices.used
        set(value) { prices.used = value }

    var digitalPrice: Float?
        get() = prices.digital
        set(value) { prices.digital = value }

    var preorderPrice: Float?
        get() = prices.preorder
        set(value) { prices.preorder = value }

    val oldNewPrices: ArrayList<Float>
        get() = prices.oldNew

    val oldUsedPrices: ArrayList<Float>
        get() = prices.oldUsed

    val oldDigitalPrices: ArrayList<Float>
        get() = prices.oldDigital

    val oldPreorderPrices: ArrayList<Float>
        get() = prices.oldPreorder

    var newAvailable: Boolean
        get() = prices.newAvailable
        set(value) { prices.newAvailable = value }

    var usedAvailable: Boolean
        get() = prices.usedAvailable
        set(value) { prices.usedAvailable = value }

    var digitalAvailable: Boolean
        get() = prices.digitalAvailable
        set(value) { prices.digitalAvailable = value }

    var preorderAvailable: Boolean
        get() = prices.preorderAvailable
        set(value) { prices.preorderAvailable = value }

    fun addOldNewPrice(price: Float?) {
        price?.let {
            prices.addOldNew(it)
        }
    }

    fun addOldUsedPrice(price: Float?) {
        price?.let {
            prices.addOldUsed(it)
        }
    }

    fun addOldDigitalPrice(price: Float?) {
        price?.let {
            prices.addOldDigital(it)
        }
    }

    fun addOldPreorderPrice(price: Float?) {
        price?.let {
            prices.addOldPreorder(it)
        }
    }

    fun addOldNewPrices(prices: ArrayList<Float>?) {
        prices?.let {
            this.prices.addOldNew(it)
        }
    }

    fun addOldUsedPrices(prices: ArrayList<Float>?) {
        prices?.let {
            this.prices.addOldUsed(it)
        }
    }

    fun addOldDigitalPrices(prices: ArrayList<Float>?) {
        prices?.let {
            this.prices.addOldDigital(it)
        }
    }

    fun addOldPreorderPrices(prices: ArrayList<Float>?) {
        prices?.let {
            this.prices.addOldPreorder(it)
        }
    }

    final override fun equals(other: Any?): Boolean {
        if (this === other)
            return true

        if (other !is GamePreview)
            return false

        if (id != other.id)
            return false

        return true
    }

    final override fun hashCode(): Int = id

}