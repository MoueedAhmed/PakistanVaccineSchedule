package com.amoueed.pakistanvaccineschedule;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.amoueed.pakistanvaccineschedule.adapter.VaccineAdapter;
import com.amoueed.pakistanvaccineschedule.model.Vaccine;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<Vaccine> mVaccineData;
    private VaccineAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mVaccineData = new ArrayList<>();
        mAdapter = new VaccineAdapter(this, mVaccineData);
        mRecyclerView.setAdapter(mAdapter);

        initializeData();
    }

    /**
     * Initialize the sports data from resources.
     */
    private void initializeData() {
        // Get the resources from the XML file.
        String[] vaccineList = getResources().getStringArray(R.array.vaccine_names);
        TypedArray vaccinesImageResources = getResources().obtainTypedArray(R.array.vaccine_images);

        // Clear the existing data (to avoid duplication).
        mVaccineData.clear();

        // Create the ArrayList of Sports objects with titles and
        // information about each sport.
        for(int i=0;i<vaccineList.length;i++){
            mVaccineData.add(new Vaccine(vaccineList[i], "Due Date: xx:xx:xxxx","Given Date: xx:xx:xxxx",
                    "Status: Not Specified", "Reminder: Yes", vaccinesImageResources.getResourceId(i,0)));
        }

        vaccinesImageResources.recycle();

        // Notify the adapter of the change.
        mAdapter.notifyDataSetChanged();
    }
}
