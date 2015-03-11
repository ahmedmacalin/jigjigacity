package www.hambalyo.com.jigajigacityapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Hotels_Names extends Activity {

    private ListView list;
    private TextView text;
    private String[] hotelnames;

    private ArrayAdapter<String> adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels__names);



        list = (ListView) findViewById(R.id.hotellist);
        text = (TextView) findViewById(R.id.hoteltext_1);


        hotelnames = new String[]{"Hamaza Hotel jigjiga city\n"+"TEL: 00251524587\n"+"www.hamazahotel.com", "Bole hotel jigjiga city"+"TEL: 00251548525\n"+"www.boleairport.com", "Arba Mintch Airport", "Asosa Airport", "Axum Airport", "Bahar Dar Airport","Beica Airport","Dembi Dollo Airport, Dembidolo Airport","Combolcha Airport","Aba Tenna Dejazmach Yilma International Airport","Gambella Airport","Gode Iddidole Airport","Azezo Airport, Gonder Airport","Gore Airport","Inda Selassie Airport","Aba Segud Airport","Jinka Airport"};

        adapter  = new  ArrayAdapter<String>(this, R.layout.activity_hotels__names, R.id.hoteltext_1,hotelnames);

        list.setAdapter(adapter);
        list.setOnItemClickListener(new OnItemClickListener() {


            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Toast.makeText(getApplicationContext(),
                        hotelnames[position],
                        Toast.LENGTH_LONG).show();
            }



        });
    }
}