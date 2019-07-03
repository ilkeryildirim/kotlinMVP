package com.ilkeryildirim.firstkotlin.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.ilkeryildirim.firstkotlin.Adapter.RecyclerViewAdapter
import com.ilkeryildirim.firstkotlin.Model.Marvel
import com.ilkeryildirim.firstkotlin.R
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity(),MainActivityContract.View  {

    private var mainActivityPresenter: MainActivityPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initVariables()
        initViews()

    }

    override fun initVariables() {
        mainActivityPresenter = MainActivityPresenter(this)
        mainActivityPresenter!!.getMarvelResponse()
    }

    override fun initViews() {

        recyclerView.layoutManager= LinearLayoutManager(this)

    }
    override fun initRecylerView(heroList: List<Marvel>?) {
        recyclerView.adapter=RecyclerViewAdapter(heroList!!)
    }

}


