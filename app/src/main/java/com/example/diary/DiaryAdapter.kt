package com.example.diary

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DiaryAdapter(public var diaryList: MutableList<diary>): RecyclerView.Adapter<DiaryAdapter.DiaryViewHolder>{

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): DiaryAdapter.DiaryViewHolder {

        val context=viewGroup.context
        val inflater=LayoutInflater.from(context)
        val shouldAttachToParentImmediately=false

        val view=inflater.inflate(R.layout.recycler_diary_item,viewGroup,shouldAttachToParentImmediately)

        return DiaryViewHolder(view)
    }


    override fun getItemCount(): Int {
        return diaryList.size
    }
    override fun onBindViewHolder(holder: DiaryAdapter.DiaryViewHolder, position: Int) {

        val item=diaryList[position]
        holder.binddiary(item)
    }

    class DiaryViewHolder(v:View): RecyclerView.ViewHolder(v),View.OnClickListener{

        public lateinit var view:View
        public lateinit var diary: Diary
        public var date:TextView
        public var title:TextView

        override fun onClick(v: View?) {
        }
        init {
            view=v

            date=view.findViewById(R.id.recycler_date_view)
            title=view.findViewById(R.id.recycler_title_view)

            v.setOnClickListener(this)
        }

        fun binddiary(diary: Diary){

            this.dairy=diary

            date.text=diary.date
            title.text=diary.title
        }
    }
}
