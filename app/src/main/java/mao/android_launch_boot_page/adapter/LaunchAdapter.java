package mao.android_launch_boot_page.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

import mao.android_launch_boot_page.R;

/**
 * Project name(项目名称)：android_launch_boot_page
 * Package(包名): mao.android_launch_boot_page.adapter
 * Class(类名): LaunchAdapter
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/5
 * Time(创建时间)： 17:07
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class LaunchAdapter extends PagerAdapter
{

    private final Context context;

    private final List<View> viewList;

    private final int[] images = new int[]
            {
                    R.drawable.l1,
                    R.drawable.l2,
                    R.drawable.l3,
                    R.drawable.l4,
                    R.drawable.l1,
            };

    public LaunchAdapter(Context context)
    {
        this.context = context;

        viewList = new ArrayList<>(5);

        for (int i = 0; i < 5; i++)
        {
            View view = LayoutInflater.from(context).inflate(R.layout.item_launch_boot, null);
            ImageView imageView = view.findViewById(R.id.ImageView);
            imageView.setImageResource(images[i]);

            RadioGroup radioGroup = view.findViewById(R.id.RadioGroup);

            for (int j = 0; j < images.length; j++)
            {
                RadioButton radioButton = new RadioButton(context);
                radioButton.setLayoutParams(new RadioGroup.LayoutParams(
                        RadioGroup.LayoutParams.WRAP_CONTENT, RadioGroup.LayoutParams.WRAP_CONTENT));

                radioButton.setPadding(10, 10, 10, 10);
                radioGroup.addView(radioButton);
                if (j == i)
                {
                    radioButton.setChecked(true);
                }
            }

            if (i == images.length - 1)
            {
                Button button = view.findViewById(R.id.Button_start);
                button.setVisibility(View.VISIBLE);
                button.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {

                    }
                });
            }

        }

    }

    @Override
    public int getCount()
    {
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object)
    {
        return false;
    }
}
