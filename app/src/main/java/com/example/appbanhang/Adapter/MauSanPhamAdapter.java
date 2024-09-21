package com.example.appbanhang.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.appbanhang.Model.MauSanPham;
import com.example.appbanhang.R;

import java.util.List;

public class MauSanPhamAdapter extends RecyclerView.Adapter<MauSanPhamAdapter.MyViewHolder> {
    Context context;
    List<MauSanPham> array;

    public MauSanPhamAdapter(Context context, List<MauSanPham> array) {
        this.context = context;
        this.array = array;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mau_sp, parent, false);
        return new MyViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        MauSanPham mauSanPham = array.get(position);
        holder.txtten.setText(mauSanPham.getTensp());
        holder.txtgia.setText(mauSanPham.getGiasp());
        Glide.with(context).load(mauSanPham.getHinhanh()).into(holder.imghinhanh);

    }

    @Override
    public int getItemCount() {
        return array.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView txtgia, txtten;
        ImageView imghinhanh;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtgia = itemView.findViewById(R.id.itemsp_gia);
            txtten = itemView.findViewById(R.id.itemsp_ten);
            imghinhanh = itemView.findViewById(R.id.itemsp_image);
        }
    }
}
