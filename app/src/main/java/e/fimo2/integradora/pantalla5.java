package e.fimo2.integradora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class pantalla5 extends AppCompatActivity {
TextView tt,Nf,EF,SF,TPF,IMF,NF,RECF;
String aaa,bbb,ccc,ddd,eee,fff,ggg,hhh,tp,nim;
int EdaF,KcalF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla5);

        Bundle extras = getIntent().getExtras();
        aaa = extras.getString("d41");
        bbb = extras.getString("d42");
        ccc = extras.getString("d43");
        ddd = extras.getString("d44");
        eee = extras.getString("d45");
        fff = extras.getString("d46");
        ggg = extras.getString("d47");
        hhh = extras.getString("d48");
        tp = extras.getString("d49");
        nim = extras.getString("d40");

        tt= findViewById(R.id.t9);
        Nf = findViewById(R.id.NomF);
        EF =findViewById(R.id.EdF);
        SF =findViewById(R.id.SexF);
        TPF =findViewById(R.id.TpF);
        IMF =findViewById(R.id.IMCF);
        NF =findViewById(R.id.NCalF);
        RECF =findViewById(R.id.RecF);

        tt.setText("Su dieta contiene los siguientes productos: " + aaa);
        Nf.setText("" + ccc + " " + ddd);
        EF.setText("Edad: " + fff);
        SF.setText("Sexo: " + eee);
        TPF.setText("" + ggg);
        IMF.setText("IMC: "+ hhh);
        NF.setText("El numero de Calorias es: " + bbb + " Kcal");

        EdaF = Integer.parseInt(fff);
        KcalF = Integer.parseInt(bbb);

        if ((EdaF < 6 && KcalF < 100)|| (EdaF < 10 && EdaF >= 6 && KcalF < 140) || (EdaF < 15 && EdaF >= 10 && KcalF < 160) || (EdaF < 20 && EdaF >=15 && KcalF < 320) || (EdaF < 60 && EdaF >=20 && KcalF < 300) || (EdaF < 70 && EdaF >=60 && KcalF < 220) || (EdaF >=70 && KcalF < 180)){
            RECF.setText("Comer con más frecuencia.\n" +
                    "Escoger comidas ricas en nutrientes.\n" +
                    "Tomar batidos y licuados de frutas.\n" +
                    "Elegir productos lácteos enteros.\n" +
                    "Cocinar salsas y sopas con leche en lugar de agua.\n" +
                    "Anotar cuándo y cuánto se bebe.\n" +
                    "Permitirse caprichos.\n" +
                    "Hacer ejercicio.");
        }
        if ((EdaF < 6 && KcalF == 100) || (EdaF < 10 && EdaF >= 6 && KcalF == 140) || (EdaF < 15 && EdaF >= 10 && KcalF >= 160 && KcalF < 200) || (EdaF < 20 && EdaF >=15 && KcalF >= 320 && KcalF < 350) || (EdaF < 60 && EdaF >=20 && KcalF == 300) || (EdaF < 70 && EdaF >=60 && KcalF == 220) || (EdaF >=70 && KcalF == 180)){
            RECF.setText("Su dieta es la correcta");
        }
        if ((EdaF < 6 && KcalF > 100) || (EdaF < 10 && EdaF >= 6 && KcalF > 140) || (EdaF < 15 && EdaF >= 10 && KcalF > 200) || (EdaF < 20 && EdaF >=15 && KcalF > 350) || (EdaF < 60 && EdaF >=20 && KcalF > 300) || (EdaF < 70 && EdaF >=60 && KcalF > 220) || (EdaF >=70 && KcalF > 180)){
            RECF.setText("Para rebajar el sobrepeso seguiremos una alimentación equilibrada y un plan regular de ejercicio físico. Debemos tener presente que las dietas muy restrictivas nunca son saludables porque provocan una importante pérdida de masa magra (músculo) y favorecen los trastornos alimentarios. Por tanto, un plan alimentario ideal para actuar contra el sobrepeso siempre ha de ser normocalórico o con una mínima restricción de calorías.\n" +
                    "\n" +
                    "Las recomendaciones alimentarias son las mismas que para la población general, limitando principalmente la ingesta de grasas saturadas. Para ello, tendremos en cuenta la siguiente selección de alimentos:\n" +
                    "\n" +
                    "Lácteos. La leche y los yogures serán desnatados; los quesos, magros. Se aconsejan 2-3 raciones al día para asegurar un aporte adecuado de calcio.\n" +
                    "Carnes y pescados. Se seleccionarán cortes magros y se retirará la grasa visible antes de la cocción. En el caso de las aves, quitar toda la piel. Evitaremos alimentos ricos en grasa saturada, como los embutidos y el tocino. Se recomienda consumir pescado al menos tres veces a la semana.\n" +
                    "Huevos. Es un alimento muy completo que presenta una proteína de alto valor biológico. Se incluirá preferentemente cocido o pasados por agua y se evitará la fritura.\n" +
                    "Cereales, legumbres y tubérculos. Aportan principalmente hidratos de carbono complejos, muy útiles en el control del apetito porque aumentan la sensación de saciedad. De este grupo, se restringirá la bollería (croissants, ensaimadas, magdalenas, donuts, etcétera).\n" +
                    "Frutas y verduras. Elige frutas crudas de consistencia firme, evitando las piezas cocidas o los batidos que aportan menor saciedad. Se recomienda un alto consumo de verduras y hortalizas. Lo ideal es consumir al menos cinco raciones diarias entre frutas y verduras.\n" +
                    "Grasa y aceites. Utiliza métodos de cocción que precisen poca grasa (plancha, horno, papillote), reduciendo el uso de frituras, salsas grasas y rebozados. Se recomienda el uso del aceite de oliva virgen extra.\n" +
                    "Azúcar y derivados. Restringir los alimentos con alta concentración de azúcares: azúcar, mermelada y refrescos. En su lugar, utiliza edulcorantes y refrescos dietéticos que no aporten calorías.");
        }
    }

    public void iniF(View view) {
        Intent i = new Intent(pantalla5.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
