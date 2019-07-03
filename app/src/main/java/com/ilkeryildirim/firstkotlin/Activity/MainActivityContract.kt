package com.ilkeryildirim.firstkotlin.Activity

import com.ilkeryildirim.firstkotlin.IBase
import com.ilkeryildirim.firstkotlin.Model.Marvel

interface MainActivityContract {

    interface View : IBase {
        fun initRecylerView(heroList : List<Marvel>?)
    }

    interface Presenter{
        fun getMarvelResponse()
    }
}