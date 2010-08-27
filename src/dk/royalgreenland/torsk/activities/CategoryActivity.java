package dk.royalgreenland.torsk.activities;

import dk.royalgreenland.torsk.R;
import dk.royalgreenland.torsk.adapters.CategoryArrayAdapter;
import dk.royalgreenland.torsk.model.Category;
import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListAdapter;

public class CategoryActivity extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        ListAdapter adapter = new CategoryArrayAdapter(this, CATEGORIES);
        setListAdapter(adapter);
    }
    
    
    private static final Category[] CATEGORIES = { new Category("Fisk", "Lækre retter med fisk!"), new Category("Kød", "Lækre retter med kød!") };
}