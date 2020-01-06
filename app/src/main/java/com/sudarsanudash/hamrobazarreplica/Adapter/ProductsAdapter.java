package com.sudarsanudash.hamrobazarreplica.Adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sudarsanudash.hamrobazarreplica.Model.Products;
import com.sudarsanudash.hamrobazarreplica.R;

import java.util.List;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductsViewHolder>{

        Context mContext;
        List<Products> productsList;

    public ProductsAdapter(Context mContext, List<Products> productsList) {
        this.mContext = mContext;
        this.productsList = productsList;
    }

    @NonNull
    @Override
    public ProductsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.datalayout,parent,false);

        return new ProductsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsViewHolder holder, int position) {

        Products products = productsList.get(position);
        holder.ivProductImage.setImageResource(products.getImageId());
        holder.tvProductName.setText(products.getName());
        holder.tvProductPrice.setText(products.getPrice());
        holder.tvUsedUnused.setText(products.getUsed());
    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }

    public class ProductsViewHolder extends RecyclerView.ViewHolder {

        ImageView ivProductImage;
        TextView tvProductName, tvProductPrice,tvUsedUnused;
        public ProductsViewHolder(@NonNull View itemView) {
            super(itemView);
            tvProductName = itemView.findViewById(R.id.tvProductsName);
            tvProductPrice = itemView.findViewById(R.id.tvProductsPrice);
            tvUsedUnused = itemView.findViewById(R.id.tvUsedUnused);

            ivProductImage = itemView.findViewById(R.id.ivProductImage);
        }
    }
}
