package com.example.myapp1

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView

class SearchAdapter//getting the context and product list with constructor
    (//this context we will use to inflate the layout
    private val mCtx: Context, //we are storing all the products in a list
    private val searchList: List<Product>
) : RecyclerView.Adapter<SearchAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        //inflating and returning our view holder
        val inflater = LayoutInflater.from(mCtx)
        val view = inflater.inflate(R.layout.search_results, null)
        return ProductViewHolder(view)
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        //getting the product of the specified position
        val product = searchList[position]
        holder.imageView.setImageDrawable(mCtx.getDrawable(product.image))
        holder.textViewTitle.text = product.title
        holder.textViewShortDesc.text = product.shortdesc
        holder.ratingBar.numStars= product.ratingBar
        holder.imageViewHeart.setImageDrawable(mCtx.getDrawable(product.heart))
        holder.textViewNum.setText(product.num.toString())
        holder.imageViewChat.setImageDrawable(mCtx.getDrawable(product.chat))
        holder.textViewNotification.setText(product.notification.toString())

    }


    override fun getItemCount(): Int {
        return searchList.size
    }


    inner class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView
        var textViewTitle: TextView
        var textViewShortDesc: TextView
         var ratingBar : RatingBar
        var imageViewHeart: ImageView
         var textViewNum :TextView
        var imageViewChat:ImageView
        var textViewNotification:TextView
        init {
            imageView = itemView.findViewById(R.id.iV_one)
            textViewTitle = itemView.findViewById(R.id.tV_one)
            textViewShortDesc = itemView.findViewById(R.id.tV_two)
            ratingBar=itemView.findViewById(R.id.rB)
            imageViewHeart= itemView.findViewById(R.id.iV_heart)
            textViewNum=itemView.findViewById(R.id.tV_num)
            imageViewChat=itemView.findViewById(R.id.iV_chat)
            textViewNotification=itemView.findViewById(R.id.tV_notification)
        }
    }
}