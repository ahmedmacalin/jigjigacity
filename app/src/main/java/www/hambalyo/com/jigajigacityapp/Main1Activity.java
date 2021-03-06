package www.hambalyo.com.jigajigacityapp;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class Main1Activity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallerey);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        ListView listview = (ListView)findViewById(R.id.listview);
        listview.setAdapter(new MyAdapter(this));

    }

    private class MyAdapter extends BaseAdapter
    {
	        private List<Item> items = new ArrayList<Item>();

	        private LayoutInflater inflater;

	        public MyAdapter(Context context)
        {
            inflater = LayoutInflater.from(context);

            items.add(new Item("Image 1", R.drawable.image1));
            items.add(new Item("Image 2", R.drawable.image2));
            items.add(new Item("Image 3", R.drawable.image3));
            items.add(new Item("Image 4", R.drawable.image4));
            items.add(new Item("Image 5", R.drawable.image5));
            items.add(new Item("Image 1", R.drawable.image6));
            items.add(new Item("Image 2", R.drawable.image7));
            items.add(new Item("Image 3", R.drawable.image8));

        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int i)
        {
            return items.get(i);
        }

        @Override
        public long getItemId(int i)
        {
            return items.get(i).drawableId;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup)
        {
            View v = view;
            ImageView picture;
            TextView name;

            if(v == null)
            {
               v = inflater.inflate(R.layout.gridview_item, viewGroup, false);
               v.setTag(R.id.picture, v.findViewById(R.id.picture));
               v.setTag(R.id.text, v.findViewById(R.id.text));
            }

            picture = (ImageView)v.getTag(R.id.picture);
            name = (TextView)v.getTag(R.id.text);

            Item item = (Item)getItem(i);

            picture.setImageResource(item.drawableId);
            name.setText(item.name);


            return v;
        }



        private class Item
        {
            final String name;
            final int drawableId;

            Item(String name, int drawableId)
            {
                this.name = name;
                this.drawableId = drawableId;
            }
        }
    }

}