package com.example.uiuxpractical3navdrawer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class TopLevelFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onStart()
    {
        super.onStart();
        View view =getView();

        if (view != null)
        {
            TextView title = (TextView)view.findViewById(R.id.textTitle);
            TextView desc = (TextView)view.findViewById(R.id.textDesc);
            ImageView img = (ImageView)view.findViewById(R.id.imageView);

            title.setText(R.string.TopLevel1);
            desc.setText(R.string.TopLevel2);
            img.setImageResource(R.drawable.dev);
            img.setContentDescription("title");
        }
    }
}
