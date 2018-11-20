package com.example.gemy.test.studentList;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gemy.test.POJO.DataItem;
import com.example.gemy.test.POJO.Studentlist;
import com.example.gemy.test.R;
import com.example.gemy.test.studentProfile.StudentProfile;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {
private Context context;
private Studentlist studentlist;
private List<DataItem> dataItems;
    public   StudentAdapter (List<DataItem> dataItems,Studentlist studentlist) {
        this.dataItems = dataItems ;
        this.studentlist = studentlist ;

    }
    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        this.context=viewGroup.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.student_itemview,viewGroup,false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder studentViewHolder, int i) {
        studentViewHolder.studentname.setText("name"+studentlist.getName());
        studentViewHolder.studentid.setText("id");
        studentViewHolder.cardView.setOnClickListener(view -> {
            onItemClicked("id");
        });
    }

    private void onItemClicked(String id) {
        Intent intent = new Intent(context,StudentProfile.class);
        intent.putExtra("student id",10);
        context.startActivity(intent);

    }

    @Override
    public int getItemCount() {
        return dataItems.size();
    }
}

class StudentViewHolder extends RecyclerView.ViewHolder {
    TextView studentname = itemView.findViewById(R.id.student_name);
    TextView studentid = itemView.findViewById(R.id.student_id);
    CardView cardView = itemView.findViewById(R.id.item_view);
    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}