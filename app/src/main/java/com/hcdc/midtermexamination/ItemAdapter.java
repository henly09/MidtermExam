package com.hcdc.midtermexamination;

// Author: John Henly A. Montera
// HolyCross of Davao College
// BSIT-3rd-Year-Student
// MIDTERM EXAM

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemView> {

    String names[];
    String jobposition[];
    int imageid[];
    String age[];
    String address[];
    String phoneno[];
    Context ItemContext;

    public ItemAdapter(Context ItemContext, String names[],String jobposition[],int imageid[],String age[],String address[],String phoneno[]){
       this.ItemContext = ItemContext;
       this.names = names;
       this.jobposition = jobposition;
       this.imageid = imageid;
       this.age = age;
       this.address = address;
       this.phoneno = phoneno;
    }

    @NonNull
    @Override
    public ItemView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ItemContext);
        View view = inflater.inflate(R.layout.items, parent, false);
        return new ItemView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemView holder, int position) {
        holder.nameview.setText(names[position]);
        holder.jobpositionview.setText(jobposition[position]);
        holder.imageview.setBackgroundResource(imageid[position]);
        holder.button.setOnClickListener(view -> {
            Intent intent = new Intent(ItemContext, secpage.class);
            intent.putExtra("name", holder.nameview.getText().toString());
            intent.putExtra("jobposition", holder.jobpositionview.getText().toString());
            intent.putExtra("age", age[position]);
            intent.putExtra("address", address[position]);
            intent.putExtra("phoneno", phoneno[position]);
            intent.putExtra("image", imageid[position]);
            ItemContext.startActivity(intent);
            Toast.makeText(ItemContext, holder.nameview.getText().toString(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public class ItemView extends RecyclerView.ViewHolder{

        TextView nameview,jobpositionview;
        View imageview;
        Button button;


        public ItemView(@NonNull View itemView) {
            super(itemView);
            nameview = itemView.findViewById(R.id.name);
            jobpositionview = itemView.findViewById(R.id.position);
            imageview = itemView.findViewById(R.id.imageview);
            button = itemView.findViewById(R.id.define);
        }
    }
}
