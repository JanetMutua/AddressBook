package com.example.addressbook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AddressBookAdapter: RecyclerView.Adapter<AddressBookAdapter.AddressBookViewHolder>(){

    //implementing the data source for the address book
    private val images = intArrayOf( R.drawable.face1,
    R.drawable.face2, R.drawable.face3, R.drawable.face4, R.drawable.face5, R.drawable.face6, R.drawable.face7, R.drawable.face8)
    private val names = arrayOf("Loise Kirapa",
        "Arnold Mutua", "George Lewis", "Arya Chebet",
        "Mwanasiti Salim", "Brian Chege", "Jose Almasi",
        "Peris Wambua")
    private val emails = arrayOf("loisekirapa@company.com",
        "arnoldmutua@company.com", "georgelewis@company.com", "aryachebet@company.com",
        "mwanasitisalim@company.com", "brianchege@company.com", "josealmasi@company.com",
        "periswambua@company.com")
    private val numbers = arrayOf("0234567129",
        "0198472815", "0912619318", "1057359275",
        "0318464752", "0218572942", "0567261931",
        "0629164201")

    class AddressBookViewHolder(view: View): RecyclerView.ViewHolder(view){
        var itemImage = view.findViewById<ImageView>(R.id.itemImage)
        var itemName = view.findViewById<TextView>(R.id.itemName)
        var itemEmail = view.findViewById<TextView>(R.id.itemEmail)
        var itemNumber = view.findViewById<TextView>(R.id.itemNumber)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddressBookViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.card_layout, parent, false)
        return AddressBookViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return names.size
    }

    override fun onBindViewHolder(holder: AddressBookViewHolder, position: Int) {
        holder.itemImage.setImageResource(images[position])
        holder.itemName.text = names[position]
        holder.itemEmail.text = emails[position]
        holder.itemNumber.text = numbers[position]
    }
}