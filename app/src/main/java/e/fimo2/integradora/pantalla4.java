package e.fimo2.integradora;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;


public class pantalla4 extends AppCompatActivity {
    CheckBox vega,cere,oan,leche,legu;
Spinner spinner,veg,oani, LyDe, leg;
String p,o,i,u,y,aaa,bbb,ccc,ddd,toddd,imc,ppp,vvv;
int Kal = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla4);

        spinner = (Spinner) findViewById(R.id.tip1);
        cere = findViewById(R.id.grni);
        veg = findViewById(R.id.ve);
        vega = findViewById(R.id.veg);
        oani = findViewById(R.id.oan);
        oan = findViewById(R.id.oa);
        LyDe = findViewById(R.id.spinner3);
        leche = findViewById(R.id.ld);
        leg = findViewById(R.id.le);
        legu = findViewById(R.id.leg);

        Bundle extras = getIntent().getExtras();
        aaa = extras.getString("d21");
        bbb = extras.getString("d22");
        ccc = extras.getString("d00");
        ddd = extras.getString("d24");
        toddd = extras.getString("d25");
        imc = extras.getString("d26");
        ppp = extras.getString("d27");
        vvv = extras.getString("d28");

        String[] valoresv = {"Jitomate","Cebolla Cruda","Chile de Arbol","Zanohoria Cruda", "Calabacita Cruda", "Chayote Crudo", "Espinaca"};
        String[] valores = {"Arroz","Tortilla de Maiz","Bolillo", "Pan de Caja", "Pasta", "Cereal con Azucar", "Papa", "Pan Dulce"};
        String[] valoresOA = {"Bistec de Res","Pechuga de Pollo", "Atun en Agua","Pechuga de pavo","Falda o pierna de Cerdo","Queso"};
        String[] valoresLyD = {"Leche Entera","Leche Descremada","Leche Evaporada","Yogurt Natural"};
        String[] valoresL = {"Frijol","Garbanzo","Habas","Lentajas"};

        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores));
        spinner.setOnItemSelectedListener(new OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
                Toast.makeText(adapterView.getContext(), (String) adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                // vacio
            }
        });

        veg.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valoresv));
        veg.setOnItemSelectedListener(new OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
                Toast.makeText(adapterView.getContext(), (String) adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                // vacio
            }
        });

        LyDe.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valoresLyD));
        LyDe.setOnItemSelectedListener(new OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
                Toast.makeText(adapterView.getContext(), (String) adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                // vacio
            }
        });

        leg.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valoresL));
        leg.setOnItemSelectedListener(new OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
                Toast.makeText(adapterView.getContext(), (String) adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                // vacio
            }
        });

        oani.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valoresOA));
        oani.setOnItemSelectedListener(new OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
                Toast.makeText(adapterView.getContext(), (String) adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                // vacio
            }
        });

    }

    public void on(View view) {
        boolean marcado = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.grni:
                if (marcado) {
                    spinner.setVisibility(View.VISIBLE);
                }
                if (!cere.isChecked()){
                    spinner.setVisibility(View.INVISIBLE);
                }
                break;
        }

    }

    public void onv(View view) {
        boolean marcado = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.veg:
                if (marcado) {
                    veg.setVisibility(View.VISIBLE);
                }
                if (!vega.isChecked()){
                    veg.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    public void ono(View view) {
        boolean marcado = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.oa:
                if (marcado) {
                    oani.setVisibility(View.VISIBLE);
                }
                if (!oan.isChecked()){
                    oani.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    public void LyD(View view) {
        boolean marcado = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.ld:
                if (marcado) {
                    LyDe.setVisibility(View.VISIBLE);
                }
                if (!leche.isChecked()){
                    LyDe.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    public void leg(View view) {
        boolean marcado = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.leg:
                if (marcado) {
                    leg.setVisibility(View.VISIBLE);
                }
                if (!legu.isChecked()){
                    leg.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    public void eniv(View view) {
        p = spinner.getSelectedItem().toString();
        o = veg.getSelectedItem().toString();
        i = oani.getSelectedItem().toString();
        u = LyDe.getSelectedItem().toString();
        y = leg.getSelectedItem().toString();

        if (!cere.isChecked()){
            p="";
        }
        if (!vega.isChecked()){
            o="";
        }
        if (!oan.isChecked()){
            i="";
        }
        if (!leche.isChecked()){
            u="";
        }
        if (!legu.isChecked()){
            y="";
        }

        String men = "" + p + " " + o + " " + i + " " + u + " " + y;

        if (p=="Arroz" || p =="Tortilla de Maiz" || p =="Bolillo" || p =="Pan de Caja" || p =="Pasta" || p =="Cereal con Azucar" || p =="Papa"){
            Kal= Kal + 70;
        }
        if (p=="Pan Dulce"){
            Kal= Kal + 115;
        }
        if (o=="Jitomate" || o =="Cebolla Cruda" || o =="Chile de Arbol" || o =="Zanahoria Cruda" || o =="Calabacita Cruda" || o =="Chayote Crudo" || o =="Espinaca"){
            Kal= Kal + 25;
        }
        if (i=="Bistec de Res" || i=="Pechuga de Pollo" || i=="Atun de Agua" || i=="Pechuga de Pavo" || i=="Falda o pierna de Cerdo" || i=="Queso"){
            Kal= Kal + 40;
        }
        if (i=="Falda o pierna de Cerdo" || i=="Queso"){
            Kal= Kal + 55;
        }
        if (u=="Leche Entera" || u=="Leche Descremada" || u=="Leche Evaporada" || u=="Yogurt Natural"){
            Kal= Kal + 150;
        }
        if (y=="Frijol" || y=="Garbanzo" || y=="Habas" || y=="Lentejas"){
            Kal= Kal + 120;
        }

        String val = Integer.toString(Kal);

        Intent i = new Intent(pantalla4.this, pantalla5.class);
        i.putExtra("d41", men);
        i.putExtra("d42", val);
        i.putExtra("d43", aaa);
        i.putExtra("d44", bbb);
        i.putExtra("d45", ccc);
        i.putExtra("d46", ddd);
        i.putExtra("d47", toddd);
        i.putExtra("d48", imc);
        i.putExtra("d49", ppp);
        i.putExtra("d40", vvv);

        startActivity(i);
        finish();
    }
}