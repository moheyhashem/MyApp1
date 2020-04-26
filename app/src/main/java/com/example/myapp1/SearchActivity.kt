package com.example.myapp1
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.search_activity.*

import java.util.ArrayList

class SearchActivity : AppCompatActivity() {

    //a list to store all the products
    private lateinit var searchList: MutableList<Product>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_activity)

        //getting the recyclerview from xml
        rV_search.setHasFixedSize(true)
        rV_search.layoutManager = LinearLayoutManager(this)

        //initializing the productlist
        searchList = ArrayList()


        //adding some items to our list
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )


        //creating recyclerview adapter
        val adapter = SearchAdapter(this, searchList)

        //setting adapter to recyclerview
        val gridLayoutManager = GridLayoutManager(this, 1)
        rV_search.layoutManager = gridLayoutManager
        rV_search.adapter = adapter
    }
}