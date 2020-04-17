package com.example.myapp1
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    //a list to store all the products
    internal lateinit var productList: MutableList<Product>

    //the recyclerview
    internal lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //getting the recyclerview from xml
        recyclerView = findViewById(R.id.recyclerview) as RecyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        //initializing the productlist
        productList = ArrayList()


        //adding some items to our list
        productList.add(
            Product(
                R.drawable.ic_sun,
                "Recipe Name",
                "some description about the.."

            )
        )
        productList.add(
            Product(
                R.drawable.ic_sun,
                "Recipe Name",
                "some description about the.."

            )
        )
        productList.add(
            Product(
                R.drawable.ic_sun,
                "Recipe Name",
                "some description about the.."

            )
        )
        productList.add(
            Product(
                R.drawable.ic_sun,
                "Recipe Name",
                "some description about the.."

            )
        )
        productList.add(
            Product(
                R.drawable.ic_sun,
                "Recipe Name",
                "some description about the.."

            )
        )
        productList.add(
            Product(
                R.drawable.ic_sun,
                "Recipe Name",
                "some description about the.."

            )
        )


        //creating recyclerview adapter
        val adapter = ProductAdapter(this, productList)

        //setting adapter to recyclerview
        recyclerView.adapter = adapter
    }
}