package com.example.myapp1
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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


        supportActionBar?.elevation = 0.0f
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp)
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
                "Some description about the recipe"

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "Some description about the recipe"

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "Some description about the recipe"

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "Some description about the recipe"

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "Some description about the recipe"

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "Some description about the recipe"

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "Some description about the recipe"

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "Some description about the recipe"

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "Some description about the recipe"

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "Some description about the recipe"

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "Some description about the recipe"

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "Some description about the recipe"

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "Some description about the recipe"

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "Some description about the recipe"

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "Some description about the recipe"

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "Some description about the recipe"

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "Some description about the recipe"

            )
        )
        searchList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "Some description about the recipe"

            )
        )


        //creating recyclerview adapter
        val adapter = SearchAdapter(this, searchList)

        //setting adapter to recyclerview
        val gridLayoutManager = GridLayoutManager(this, 1)
        rV_search.layoutManager = gridLayoutManager
        rV_search.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
            }
            R.id.add -> {
            }
            R.id.view_all -> {
            }
        }
        return super.onOptionsItemSelected(item)
    }
}