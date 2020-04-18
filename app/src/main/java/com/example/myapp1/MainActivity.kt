package com.example.myapp1
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    //a list to store all the products
    private lateinit var productList: MutableList<Product>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //getting the recyclerview from xml
        recyclerview.setHasFixedSize(true)
        recyclerview.layoutManager = LinearLayoutManager(this)

        //initializing the productlist
        productList = ArrayList()


        //adding some items to our list
        productList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        productList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        productList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        productList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        productList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        productList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        productList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        productList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        productList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        productList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        productList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        productList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        productList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        productList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        productList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        productList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        productList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )
        productList.add(
            Product(
                R.drawable.food_3,
                "Recipe Name",
                "some description about the.."

            )
        )


        //creating recyclerview adapter
        val adapter = ProductAdapter(this, productList)

        //setting adapter to recyclerview
        val gridLayoutManager = GridLayoutManager(this, 2)
        recyclerview.layoutManager = gridLayoutManager
        recyclerview.adapter = adapter
    }
}