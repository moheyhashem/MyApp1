package com.example.myapp1
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

import java.util.ArrayList

class SearchActivity : AppCompatActivity() {

    //a list to store all the products
    private lateinit var searchList: MutableList<Product>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_activity)

        //getting the recyclerview from xml
        recyclerview.setHasFixedSize(true)
        recyclerview.layoutManager = LinearLayoutManager(this)

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
        val gridLayoutManager = GridLayoutManager(this, 2)
        recyclerview.layoutManager = gridLayoutManager
        recyclerview.adapter = adapter
    }
}