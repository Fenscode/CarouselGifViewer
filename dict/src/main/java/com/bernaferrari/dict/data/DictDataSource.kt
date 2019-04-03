package com.bernaferrari.dict.data

import com.airbnb.mvrx.MvRxState
import io.reactivex.Observable

data class GifItem(val gifId: String, val title: String) : MvRxState

interface DictDataSource {

    fun getItems(): Observable<List<GifItem>>

}
