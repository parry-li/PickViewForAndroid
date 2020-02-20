package com.parry.parry;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.parry.pickerview.adapter.ArrayWheelAdapter;
import com.contrarywind.listener.OnItemSelectedListener;
import com.contrarywind.view.WheelView;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class TestCircleWheelViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_circle_wheelview);

        WheelView wheelView = findViewById(R.id.wheelview);
        wheelView.setTextSize(20);
        wheelView.setLineSpacingMultiplier(2f);
        // wheelView.setDividerWidth(6);
        wheelView.setDividerType(WheelView.DividerType.CIRCLE);

        final List<String> mOptionsItems = new ArrayList<>();
        mOptionsItems.add("10");
        mOptionsItems.add("20");
        mOptionsItems.add("30");
        mOptionsItems.add("40");
        mOptionsItems.add("50");
        mOptionsItems.add("60");
        mOptionsItems.add("70");

        wheelView.setAdapter(new ArrayWheelAdapter(mOptionsItems));
        wheelView.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(int index) {
                Toast.makeText(TestCircleWheelViewActivity.this, "" + mOptionsItems.get(index), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
