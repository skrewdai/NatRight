package com.seventeen.natright;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class sec_Adapter extends RecyclerView.Adapter<sec_Adapter.MyViewHolder> {
    private final recyclerViewInterface RecyclerViewInterface;
    Context context;
    ArrayList<section_model> sectionModels;

    public sec_Adapter(Context context,
                       ArrayList<section_model> sectionModels,
                       recyclerViewInterface RecyclerViewInterface) {
        this.context = context;
        this.sectionModels = sectionModels;
        this.RecyclerViewInterface = RecyclerViewInterface;
    }

    @NonNull
    @Override
    public sec_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recyclerview_layout, parent, false);
        return new sec_Adapter.MyViewHolder(view, RecyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull sec_Adapter.MyViewHolder holder, int position) {
        holder.textView.setText(sectionModels.get(position).getSection_name());
        holder.imageView.setImageResource(sectionModels.get(position).getSection_image());
    }

    @Override
    public int getItemCount() {
        return sectionModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public MyViewHolder(@NonNull View itemView, recyclerViewInterface RecyclerViewInterface) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView2);
            textView = itemView.findViewById(R.id.textView2);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (RecyclerViewInterface != null) {
                        int pos = getAdapterPosition();
                        if (pos != RecyclerView.NO_POSITION) {
                            RecyclerViewInterface.onItemClick(pos);
                        }
                    }
                }
            });
        }
    }
}
