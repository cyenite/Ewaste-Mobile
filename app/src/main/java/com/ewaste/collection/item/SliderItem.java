package com.ewaste.collection.item;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.ewaste.collection.R;
import com.ewaste.collection.activity.RentCarActivity;
import com.ewaste.collection.activity.RideCarActivity;
import com.ewaste.collection.activity.SendActivity;
import com.ewaste.collection.constants.Constants;
import com.ewaste.collection.models.PromoModel;
import com.squareup.picasso.Picasso;

import java.util.List;


public class SliderItem extends PagerAdapter {

    private List<PromoModel> models;
    private LayoutInflater layoutInflater;
    private Context context;

    public SliderItem(List<PromoModel> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_slider, container, false);

        ImageView imageView;
        RelativeLayout slider;

        imageView = view.findViewById(R.id.image);
        slider = view.findViewById(R.id.slider);

        final PromoModel propertyModels = models.get(position);
        Picasso.with(context)
                .load(Constants.IMAGESSLIDER + propertyModels.getFoto())
                .placeholder(R.drawable.image_placeholder)
                .into(imageView);

        if (propertyModels.getTypepromosi().equals("link")) {

            slider.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String url = (propertyModels.getLinkpromosi());
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    context.startActivity(i);

                }
            });

        } else {
            if (propertyModels.getFiturpromosi() == 1 || propertyModels.getFiturpromosi() == 2) {
                slider.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(context, RideCarActivity.class);
                        i.putExtra("FiturKey", propertyModels.getFiturpromosi());
                        i.putExtra("icon", propertyModels.getIcon());
                        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        context.startActivity(i);
                    }
                });
            } else if (propertyModels.getFiturpromosi() == 5) {
                slider.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(context, SendActivity.class);
                        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        i.putExtra("FiturKey", propertyModels.getFiturpromosi());
                        i.putExtra("icon", propertyModels.getIcon());
                        context.startActivity(i);

                    }
                });
            } else if (propertyModels.getFiturpromosi() == 6) {
                slider.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(context, RentCarActivity.class);
                        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        i.putExtra("FiturKey", propertyModels.getFiturpromosi());
                        i.putExtra("icon", propertyModels.getIcon());
                        context.startActivity(i);

                    }
                });
            }
        }


        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}

