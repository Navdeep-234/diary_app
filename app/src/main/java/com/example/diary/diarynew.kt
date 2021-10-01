package com.example.diary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.recycler_diary_item.*

class diarynew : AppCompatActivity() {

    private var diaryList:ArrayList<diary> = ArrayList()
    private lateinit var LinearLayoutManager : LinearLayoutManager
    private lateinit var adapter: DiaryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diarynew)

    diaryList.add(diary("2018","first diary","my first diary"))
    diaryList.add(diary("2017","second diary","my second diary"))

        LinearLayoutManager = LinearLayoutManager(this)
        recycler_date_view.layoutManager=LinearLayoutManager

        adapter=DiaryAdapter(diaryList)
        recycler_date_view.adapter = adapter
    }

}