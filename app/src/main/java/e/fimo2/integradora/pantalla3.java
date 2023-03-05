package e.fimo2.integradora;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

public class pantalla3 extends AppCompatActivity implements View.OnClickListener{

    EditText ePeso,eAltura,imc;
    Button calcular,dieta;
    ImageView img;
    Drawable peso;
    String aa,bb,cc,dd,todd,pp,im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);

        calcular=findViewById(R.id.Calcular);
        ePeso =findViewById(R.id.pesoBtn);
        eAltura =findViewById(R.id.alturaBtn);
        imc =findViewById(R.id.resultado);
        img=findViewById(R.id.Imagen);
        dieta = findViewById(R.id.diet);

        Bundle extras = getIntent().getExtras();
        aa = extras.getString("d13");
        bb = extras.getString("d23");
        cc = extras.getString("d33");
        dd = extras.getString("d43");
        todd = extras.getString("d11");
        pp = extras.getString("d53");
        calcular.setOnClickListener(this);
        dieta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(pantalla3.this, pantalla4.class);
                String img = imc.getText().toString();
                i.putExtra("d21", aa);
                i.putExtra("d22", bb);
                i.putExtra("d00", cc);
                i.putExtra("d24", dd);
                i.putExtra("d25", todd);
                i.putExtra("d26", img);
                i.putExtra("d27", pp);
                i.putExtra("d28", im);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onClick(View v) {
        Double ppeso,aaltura,iimc;
        ppeso=Double.parseDouble(ePeso.getText().toString());
        aaltura=Double.parseDouble(eAltura.getText().toString());
        iimc=(ppeso)/(Math.pow(aaltura,2));


        if((iimc<=17)){
            int imageResource=getResources().getIdentifier("@drawable/uno",null,getPackageName());
            peso=ContextCompat.getDrawable(getApplicationContext(),imageResource);
            im="1";
            imc.setText("Bajo de Peso "+iimc);
        }
        if((iimc>=18.5)){
            int imageResource=getResources().getIdentifier("@drawable/dos",null,getPackageName());
            peso=ContextCompat.getDrawable(getApplicationContext(),imageResource);
            im="2";
            imc.setText("Peso ideal "+iimc);
        }
        if((iimc>=25)){
            int imageResource=getResources().getIdentifier("@drawable/hh",null,getPackageName());
            peso=ContextCompat.getDrawable(getApplicationContext(),imageResource);
            im="3";
            imc.setText("Sobrepeso "+iimc);
        }
        if((iimc>=30)){
            int imageResource=getResources().getIdentifier("@drawable/tres",null,getPackageName());
            peso=ContextCompat.getDrawable(getApplicationContext(),imageResource);
            im="3";
            imc.setText("Obesidad tipo I "+iimc);
        }
        if((iimc>=35)){
            int imageResource=getResources().getIdentifier("@drawable/cuatro",null,getPackageName());
            peso=ContextCompat.getDrawable(getApplicationContext(),imageResource);
            im="3";
            imc.setText("Obesidad tipo II "+iimc);
        }
        if(iimc>=40){
            int imageResource=getResources().getIdentifier("@drawable/cinco",null,getPackageName());
            peso=ContextCompat.getDrawable(getApplicationContext(),imageResource);
            im="3";
            imc.setText("Obesidad Morbida"+iimc);
        }

        img.setImageDrawable(peso);
        dieta.setVisibility(View.VISIBLE);
    }
}
