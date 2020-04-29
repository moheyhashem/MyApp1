package com.example.myapp1
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.search_activity.*

import java.util.ArrayList
import android.widget.AdapterView
import android.widget.Toast
import android.widget.ArrayAdapter
import android.widget.Spinner



 class SearchActivity : AppCompatActivity() {


     internal lateinit var spinner: Spinner

             //a list to store all the products
             private lateinit var searchList: MutableList<Product>

             override fun onCreate(savedInstanceState: Bundle?) {
                 super.onCreate(savedInstanceState)
                 setContentView(R.layout.search_activity)
                 spinner = findViewById(R.id.spinner)
                 val pizza = ArrayList<String>()
                 pizza.add(0, "Sort by")
                 pizza.add("Supereme")
                 pizza.add("Classic Pepperoni")
                 pizza.add("Deluxe Cheese")
                 pizza.add("Very Veggie")
                 pizza.add("Oriental Chicken")
                 pizza.add("Hot Stuff")
                 pizza.add("Al Polo")
                 pizza.add("Bbq Chicken")
                 pizza.add("Lebanese")
                 val arrayAdapter =
                     ArrayAdapter(this, android.R.layout.simple_list_item_1, pizza)
                 arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                 spinner.adapter = arrayAdapter
                 spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                     override fun onItemSelected(
                         parent: AdapterView<*>,
                         view: View,
                         position: Int,
                         id: Long
                     ) {
                         if (parent.getItemAtPosition(position) == "Choose Pizza type from lis") {
                         } else {
                             val item = parent.getItemAtPosition(position).toString()
                             Toast.makeText(parent.context, "Selected: $item", Toast.LENGTH_SHORT)
                                 .show()
                         }
                     }

                     override fun onNothingSelected(parent: AdapterView<*>) {}

                 }
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
                         "Some description about the recipe",
                         ratingBar = 5,
                         heart = R.drawable.favorite_red,
                         num = 75,
                         chat = R.drawable.ic_chat,
                         notification = 120


                     )
                 )
                 searchList.add(
                     Product(
                         R.drawable.food_3,
                         "Recipe Name",
                         "Some description about the recipe",
                         ratingBar = 5,
                         heart = R.drawable.favorite_red,
                         num = 75,
                         chat = R.drawable.ic_chat,
                         notification = 120
                     )
                 )
                 searchList.add(
                     Product(
                         R.drawable.food_3,
                         "Recipe Name",
                         "Some description about the recipe",
                         ratingBar = 5,
                         heart = R.drawable.favorite_red,
                         num = 75,
                         chat = R.drawable.ic_chat,
                         notification = 120
                     )
                 )
                 searchList.add(
                     Product(
                         R.drawable.food_3,
                         "Recipe Name",
                         "Some description about the recipe",
                         ratingBar = 5,
                         heart = R.drawable.favorite_red,
                         num = 75,
                         chat = R.drawable.ic_chat,
                         notification = 120
                     )
                 )
                 searchList.add(
                     Product(
                         R.drawable.food_3,
                         "Recipe Name",
                         "Some description about the recipe",
                         ratingBar = 5,
                         heart = R.drawable.favorite_red,
                         num = 75,
                         chat = R.drawable.ic_chat,
                         notification = 120
                     )
                 )
                 searchList.add(
                     Product(
                         R.drawable.food_3,
                         "Recipe Name",
                         "Some description about the recipe",
                         ratingBar = 5,
                         heart = R.drawable.favorite_red,
                         num = 75,
                         chat = R.drawable.ic_chat,
                         notification = 120
                     )
                 )
                 searchList.add(
                     Product(
                         R.drawable.food_3,
                         "Recipe Name",
                         "Some description about the recipe",
                         ratingBar = 5,
                         heart = R.drawable.favorite_red,
                         num = 75,
                         chat = R.drawable.ic_chat,
                         notification = 120
                     )
                 )
                 searchList.add(
                     Product(
                         R.drawable.food_3,
                         "Recipe Name",
                         "Some description about the recipe",
                         ratingBar = 5,
                         heart = R.drawable.favorite_red,
                         num = 75,
                         chat = R.drawable.ic_chat,
                         notification = 120
                     )
                 )
                 searchList.add(
                     Product(
                         R.drawable.food_3,
                         "Recipe Name",
                         "Some description about the recipe",
                         ratingBar = 5,
                         heart = R.drawable.favorite_red,
                         num = 75,
                         chat = R.drawable.ic_chat,
                         notification = 120
                     )
                 )
                 searchList.add(
                     Product(
                         R.drawable.food_3,
                         "Recipe Name",
                         "Some description about the recipe",
                         ratingBar = 5,
                         heart = R.drawable.favorite_red,
                         num = 75,
                         chat = R.drawable.ic_chat,
                         notification = 120
                     )
                 )
                 searchList.add(
                     Product(
                         R.drawable.food_3,
                         "Recipe Name",
                         "Some description about the recipe",
                         ratingBar = 5,
                         heart = R.drawable.favorite_red,
                         num = 75,
                         chat = R.drawable.ic_chat,
                         notification = 120
                     )
                 )
                 searchList.add(
                     Product(
                         R.drawable.food_3,
                         "Recipe Name",
                         "Some description about the recipe",
                         ratingBar = 5,
                         heart = R.drawable.favorite_red,
                         num = 75,
                         chat = R.drawable.ic_chat,
                         notification = 120
                     )
                 )
                 searchList.add(
                     Product(
                         R.drawable.food_3,
                         "Recipe Name",
                         "Some description about the recipe",
                         ratingBar = 5,
                         heart = R.drawable.favorite_red,
                         num = 75,
                         chat = R.drawable.ic_chat,
                         notification = 120

                     )
                 )
                 searchList.add(
                     Product(
                         R.drawable.food_3,
                         "Recipe Name",
                         "Some description about the recipe",
                         ratingBar = 5,
                         heart = R.drawable.favorite_red,
                         num = 75,
                         chat = R.drawable.ic_chat,
                         notification = 120
                     )
                 )
                 searchList.add(
                     Product(
                         R.drawable.food_3,
                         "Recipe Name",
                         "Some description about the recipe",
                         ratingBar = 5,
                         heart = R.drawable.favorite_red,
                         num = 75,
                         chat = R.drawable.ic_chat,
                         notification = 120
                     )
                 )
                 searchList.add(
                     Product(
                         R.drawable.food_3,
                         "Recipe Name",
                         "Some description about the recipe",
                         ratingBar = 5,
                         heart = R.drawable.favorite_red,
                         num = 75,
                         chat = R.drawable.ic_chat,
                         notification = 120
                     )
                 )
                 searchList.add(
                     Product(
                         R.drawable.food_3,
                         "Recipe Name",
                         "Some description about the recipe",
                         ratingBar = 5,
                         heart = R.drawable.favorite_red,
                         num = 75,
                         chat = R.drawable.ic_chat,
                         notification = 120
                     )
                 )
                 searchList.add(
                     Product(
                         R.drawable.food_3,
                         "Recipe Name",
                         "Some description about the recipe",
                         ratingBar = 5,
                         heart = R.drawable.favorite_red,
                         num = 75,
                         chat = R.drawable.ic_chat,
                         notification = 120
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


