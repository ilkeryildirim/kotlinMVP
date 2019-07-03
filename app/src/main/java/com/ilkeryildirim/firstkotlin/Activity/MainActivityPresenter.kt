package com.ilkeryildirim.firstkotlin.Activity

import com.ilkeryildirim.firstkotlin.Api.MarvelApiService
import com.ilkeryildirim.firstkotlin.Api.RetrofitClient
import com.ilkeryildirim.firstkotlin.Model.Marvel
import retrofit2.Call
import retrofit2.Response

class MainActivityPresenter : MainActivityContract.Presenter {


    var view:MainActivityContract.View
    var heroList : List<Marvel>? = null

    constructor(view: MainActivityContract.View) {
        this.view = view
    }


    override fun getMarvelResponse() {

        RetrofitClient.getClient()
            .create(MarvelApiService::class.java)
            .getHeroes()
            .enqueue(object :retrofit2.Callback<List<Marvel>>{
                override fun onFailure(call: Call<List<Marvel>>, t: Throwable) {
                }

                override fun onResponse(call: Call<List<Marvel>>, response: Response<List<Marvel>>) {
                    heroList=response.body()
                    view.initRecylerView(heroList)
                }

            })

    }

}