package com.gema.uts_2301093003.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gema.uts_2301093003.DetailOrder
import com.gema.uts_2301093003.model.ModelListOrder
import com.gema.uts_2301093003.R



class OrderAdapter (
    val itemListMakanan: List<ModelListOrder>
): RecyclerView.Adapter<OrderAdapter.MyviewHolder>() {
    class MyviewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var txtNamaMakanan : TextView = itemView.findViewById(R.id.txtNamaMakanan)
        var imgMakanan : ImageView = itemView.findViewById(R.id.imgMakanan)
        var txtTanggal : TextView = itemView.findViewById(R.id.txtTanggal)
        var txtHarga : TextView = itemView.findViewById(R.id.txtHarga)
        var txtItem : TextView = itemView.findViewById(R.id.txtJumlahItem)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_order,parent,false)
        return MyviewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemListMakanan.size
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        val currentItem = itemListMakanan[position]
        holder.txtNamaMakanan.setText(currentItem.Nama)
        holder.imgMakanan.setImageResource(currentItem.image)
        holder.txtTanggal.setText(currentItem.Tanggal)
        holder.txtItem.setText(currentItem.Item)
        holder.txtHarga.setText(currentItem.Harga)


        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, DetailOrder::class.java).apply {
                // Mengirim data melalui intent
                putExtra("namaMakanan", currentItem.Nama)
                putExtra("photoMakanan", currentItem.image)
            }
            context.startActivity(intent)
        }
    }
}