package com.example.realmrecyclerview;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import io.realm.RealmResults;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private RealmResults<MyPerson> mPersonRealmResults;
    private Context mContext;
    RelativeLayout relativeLayout;

    public MyAdapter(RealmResults<MyPerson> persons, Context context){
        mPersonRealmResults = persons;
        mContext = context;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycler_view__item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        MyPerson person = mPersonRealmResults.get(position);
        if(position%4==0) relativeLayout.setBackgroundColor(Color.BLUE);
        else if(position%4==1) relativeLayout.setBackgroundColor(Color.GREEN);
        else if(position%4==2) relativeLayout.setBackgroundColor(Color.YELLOW);
        else relativeLayout.setBackgroundColor(Color.RED);
        holder.name.setText(person.getName());
        holder.dept.setText("Dept: "+person.getDept());
        holder.roll.setText("Roll: "+person.getRoll());
        holder.gender.setText(person.getGender());
        holder.phone.setText("+91 "+person.getPhone());
    }

    @Override
    public int getItemCount() {
        return mPersonRealmResults.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private TextView dept;
        private TextView phone;
        private TextView roll;
        private TextView gender;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            relativeLayout=itemView.findViewById(R.id.category_image);
            name = itemView.findViewById(R.id.name_tv);
            dept = itemView.findViewById(R.id.dept_tv);
            phone = itemView.findViewById(R.id.phone_tv);
            roll = itemView.findViewById(R.id.roll_tv);
            gender=itemView.findViewById(R.id.gender_tv);
        }
    }
}