package com.umang.extendedautocompleteview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AppCompatActivity;
import dev.assemblage.extendedautocomplete.ExtendedAutoCompleteTextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ArrayList<String> stringArrayList = new ArrayList<>();
    stringArrayList.add("Apple");
    stringArrayList.add("Banana");
    stringArrayList.add("Cherry");
    stringArrayList.add("Dates");
    stringArrayList.add("Elderberry");
    stringArrayList.add("Fig");
    stringArrayList.add("Grapefruit");

    ExtendedAutoCompleteTextView extendedAutoCompleteTextView =
        (ExtendedAutoCompleteTextView) findViewById(R.id.auto_text_view);
    ArrayAdapter<String> adapter =
        new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, stringArrayList);
    extendedAutoCompleteTextView.setAdapter(adapter);
  }
}
