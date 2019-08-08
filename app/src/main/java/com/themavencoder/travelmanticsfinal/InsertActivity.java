package com.themavencoder.travelmanticsfinal;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.themavencoder.travelmanticsfinal.R;
import com.themavencoder.travelmanticsfinal.TravelDeals;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class InsertActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference mDatabaseReference;
    private EditText mTitle, mDescription, mPrice;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FirebaseUtil.openFbReference("traveldeals");
        mFirebaseDatabase = FirebaseUtil.mFirebaseDatabase;
        mDatabaseReference = FirebaseUtil.mDatabaseReference;
        mDescription = findViewById(R.id.edit_description);
        mPrice = findViewById(R.id.edit_price);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.save_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.save_menu:
                saveDeal();
                Toast.makeText(this, "Deal saved", Toast.LENGTH_SHORT).show();
                clean();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    public void saveDeal() {
        String title = mTitle.getText().toString();
        String description = mDescription.getText().toString();
        String price = mPrice.getText().toString();
        TravelDeals deals = new TravelDeals(title, description, price);
        mDatabaseReference.push().setValue(deals);

    }
    public void clean() {
        mTitle.setText(" ");
        mPrice.setText(" ");
        mDescription.setText(" ");
    }
}
