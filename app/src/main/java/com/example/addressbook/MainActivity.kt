package com.example.addressbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.addressbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var recyclerView = binding.recyclerView
        var layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AddressBookAdapter()
        recyclerView.layoutManager = layoutManager
    }
}