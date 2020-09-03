package com.ewaste.collection.item;

import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ewaste.collection.R;
import com.ewaste.collection.activity.AllMerchantActivity;
import com.ewaste.collection.activity.RentCarActivity;
import com.ewaste.collection.activity.RideCarActivity;
import com.ewaste.collection.activity.SendActivity;
import com.ewaste.collection.constants.Constants;
import com.ewaste.collection.models.FiturModel;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by otacodes on 3/24/2019.
 */

public class FiturItem extends RecyclerView.Adapter<FiturItem.ItemRowHolder> {

    private List<FiturModel> dataList;
    private Context mContext;
    private int rowLayout;

    public FiturItem(Context context, List<FiturModel> dataList, int rowLayout) {
        this.dataList = dataList;
        this.mContext = context;
        this.rowLayout = rowLayout;
    }

    @NonNull
    @Override
    public ItemRowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new ItemRowHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ItemRowHolder holder, final int position) {
        final FiturModel singleItem = dataList.get(position);
        holder.text.setText(singleItem.getFitur());
        if (!singleItem.getIcon().isEmpty()) {
            Picasso.with(mContext)
                    .load(Constants.IMAGESFITUR + singleItem.getIcon())
                    .resize(100, 100)
                    .into(holder.images);
        }

        if (singleItem.getHome().equals("0")) {
            holder.background.setImageDrawable(mContext.getResources().getDrawable(R.drawable.button_round_2));
        }

        if (singleItem.getIdFitur() == 1 || singleItem.getIdFitur() == 2) {
            holder.background.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(mContext, RideCarActivity.class);
                    i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    i.putExtra("FiturKey", singleItem.getIdFitur());
                    i.putExtra("icon", singleItem.getIcon());
                    mContext.startActivity(i);

                }
            });
        } /*else if (singleItem.getIdFitur() == 5) {
            holder.background.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(mContext, SendActivity.class);
                    i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    i.putExtra("FiturKey", singleItem.getIdFitur());
                    i.putExtra("icon", singleItem.getIcon());
                    mContext.startActivity(i);

                }
            });
        } else if (singleItem.getIdFitur() == 6) {
            holder.background.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(mContext, RentCarActivity.class);
                    i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    i.putExtra("FiturKey", singleItem.getIdFitur());
                    i.putExtra("icon", singleItem.getIcon());
                    mContext.startActivity(i);

                }
            });
        } else if (singleItem.getIdFitur() == 10 || singleItem.getIdFitur() == 11 || singleItem.getIdFitur() == 12 || singleItem.getIdFitur() == 13) {
            holder.background.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(mContext, AllMerchantActivity.class);
                    i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    i.putExtra("FiturKey", singleItem.getIdFitur());
                    mContext.startActivity(i);

                }
            });
        }*/
    }

    @Override
    public int getItemCount() {
        return (null != dataList ? dataList.size() : 0);
    }

    class ItemRowHolder extends RecyclerView.ViewHolder {
        TextView text;
        ImageView images, background;

        ItemRowHolder(View itemView) {
            super(itemView);
            background = itemView.findViewById(R.id.background);
            images = itemView.findViewById(R.id.image);
            text = itemView.findViewById(R.id.text);
        }
    }
}
