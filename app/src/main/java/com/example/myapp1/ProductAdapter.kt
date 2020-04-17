package com.example.myapp1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter//getting the context and product list with constructor
    (//this context we will use to inflate the layout
    private val mCtx: Context, //we are storing all the products in a list
    private val productList: List<Product>
) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        //inflating and returning our view holder
        val inflater = LayoutInflater.from(mCtx)
        val view = inflater.inflate(R.layout.layout_products, null)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        //getting the product of the specified position
        val product = productList[position]
        holder.imageView.setImageDrawable(mCtx.resources.getDrawable(product.image))
        holder.textViewTitle.text = product.title
        holder.textViewShortDesc.text = product.shortdesc


    }


    override fun getItemCount(): Int {
        return productList.size
    }


    inner class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView
        var textViewTitle: TextView
        var textViewShortDesc: TextView


        init {
            imageView = itemView.findViewById(R.id.iV_one)
            textViewTitle = itemView.findViewById(R.id.tV_three)
            textViewShortDesc = itemView.findViewById(R.id.tV_four)

            imageView = itemView.findViewById(R.id.iV_two)
            textViewTitle = itemView.findViewById(R.id.tV_one)
            textViewShortDesc = itemView.findViewById(R.id.tV_two)

        }
    }
}