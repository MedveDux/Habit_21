package com.mima.habit21;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SlideAdapter extends PagerAdapter {
    LayoutInflater inflater;
    Context context;

    public int[] img = {
            R.drawable.ic_baseline_calendar_month_300,
            R.drawable.ic_baseline_smoking_rooms_300,
            R.drawable.ic_baseline_accessibility_new_300
    };
    public String[] titles = {
            "Формирование привычеки",
            "Победи вредные привычки",
            "Поставь себе цель и иди к ней"
    };
    public String[] descs = {
            "       В психологии давно установлен факт,что 21 дня достаточно, чтобы привить новые привычки (избавиться от старых) и таким образом улучшить качество жизни",
            "       Вы можете изменить плохую привычку, заменив ее хорошей привычкой. Это приложение позволяет вам сделать это с помощью 21-дневного испытания",
            "       Создай в приложении цель (привычку которую хотите изменить) и отмечайте её успешное ежедневное выполнение"
    };

    public  SlideAdapter(Context context){
        this.context = context;

    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (RelativeLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide, container, false);
        RelativeLayout layoutslide = view.findViewById(R.id.slide_activity);
        ImageView image_slide = (ImageView)  view.findViewById(R.id.slideimage);
        TextView title_slide = (TextView) view.findViewById(R.id.title);
        TextView descs_slide = (TextView) view.findViewById(R.id.descs);
        Button btn = (Button) view.findViewById(R.id.button);
        image_slide.setImageResource(img[position]);

        title_slide.setText(titles[position]);
        descs_slide.setText(descs[position]);
        if (position == titles.length - 1) {
            animationButton(btn);
        }
        container.addView(view);
        return view;
    }
    private void animationButton(Button btn) {
        btn.setVisibility(View.VISIBLE);
        btn.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View view) {
                                       Intent readMore = new Intent(view.getContext(), RegistrationActivity_Name.class);
                                       view.getContext().startActivity(readMore);
                                   }
                               }
        );
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }

}
