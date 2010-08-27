package dk.royalgreenland.torsk.adapters;

import java.util.List;

import dk.royalgreenland.torsk.R;
import dk.royalgreenland.torsk.model.Category;
import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

public class CategoryArrayAdapter implements ListAdapter {

	private Category[] categories;
	private Context context;
	
	public CategoryArrayAdapter(Context context, Category[] categories) {
		this.categories = categories;
		this.context = context;
	}
	
	public CategoryArrayAdapter(Context context, List<Category> categories) {
		this(context, (Category[])categories.toArray());
	}
	
	@Override
	public int getCount() {
		return categories.length;
	}

	@Override
	public Object getItem(int position) {
		return categories[position];
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public int getItemViewType(int position) {
		// TODO Auto-generated method stub
		return R.layout.category_item;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = LayoutInflater.from(this.context).inflate(R.layout.category_item, parent);
		((TextView)view.findViewById(R.id.category_heading)).setText(categories[position].getName());
		((TextView)view.findViewById(R.id.category_description)).setText(categories[position].getDescription());
		return view;
	}

	@Override
	public int getViewTypeCount() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean hasStableIds() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return categories.length == 0;
	}

	@Override
	public void registerDataSetObserver(DataSetObserver observer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void unregisterDataSetObserver(DataSetObserver observer) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean areAllItemsEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled(int position) {
		// TODO Auto-generated method stub
		return false;
	}



}
