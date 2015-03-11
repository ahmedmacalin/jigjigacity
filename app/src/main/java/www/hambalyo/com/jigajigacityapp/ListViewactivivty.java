package www.hambalyo.com.jigajigacityapp;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewactivivty extends Activity {

private ListView list;
private TextView text;
private String[] osNames;

private ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
/*     mw=new midwifes();*/

        list = (ListView) findViewById(R.id.list);
        text = (TextView) findViewById(R.id.text_1);



      osNames = new String[]{"Jigiga Airport(JIJ)\n"+"00251524587\n"+"www.jigjigaairport.com", "Bole International Airport"+"00251548525\n"+"www.boleairport.com", "Arba Mintch Airport", "Asosa Airport", "Axum Airport", "Bahar Dar Airport","Beica Airport","Dembi Dollo Airport, Dembidolo Airport","Combolcha Airport","Aba Tenna Dejazmach Yilma International Airport","Gambella Airport","Gode Iddidole Airport","Azezo Airport, Gonder Airport","Gore Airport","Inda Selassie Airport","Aba Segud Airport","Jinka Airport"};

       adapter  = new  ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.text_1,osNames);

        ColorDrawable red1 = new ColorDrawable(this.getResources().getColor(R.color.red1));
        list.setDivider(red1);
        list.setDividerHeight(5);

        list.setAdapter(adapter);
        list.setOnItemClickListener(new OnItemClickListener() {


            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Toast.makeText(getApplicationContext(),
                        osNames[position],
                        Toast.LENGTH_LONG).show();
            }



        });
    }

}