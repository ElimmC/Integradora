package e.fimo2.integradora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText n,a,e;
    private RadioButton h,m,mm,sede;
    private Button s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n = findViewById(R.id.Nom);
        a = findViewById(R.id.Ape);
        e = findViewById(R.id.ed);
        h = findViewById(R.id.hom);
        m = findViewById(R.id.muj);
        s = findViewById(R.id.sig);
        mm = findViewById(R.id.mixt);
        sede = findViewById(R.id.sedent);

        s.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(h.isChecked()){
            if (mm.isChecked()){
                String no,ap,se,ed, mixi,tod;
                int ed2;
                mixi = mm.getText().toString();
                tod="Usted es una persona: " + mixi;
                no = n.getText().toString();
                ap = a.getText().toString();
                se = h.getText().toString();
                ed = e.getText().toString();
                Intent i = new Intent(MainActivity.this, pantalla2.class);
                i.putExtra("d1", no);
                i.putExtra("d2", ap);
                i.putExtra("d3", se);
                i.putExtra("d4", ed);
                i.putExtra("d5", tod);
                startActivity(i);
                finish();
            }
            if (sede.isChecked()){
                String no,ap,se,ed,tod,sedi,pp;
                int ed2;
                sedi = sede.getText().toString();
                tod="Usted es una persona: " + sedi;
                no = n.getText().toString();
                ap = a.getText().toString();
                se = h.getText().toString();
                ed = e.getText().toString();
                pp="0";
                Intent i = new Intent(MainActivity.this, pantalla3.class);
                i.putExtra("d13", no);
                i.putExtra("d23", ap);
                i.putExtra("d33", se);
                i.putExtra("d43", ed);
                i.putExtra("d11", tod);
                i.putExtra("d53", pp);
                startActivity(i);
                finish();
            }
        }
        else
            if(m.isChecked()){
                if (mm.isChecked()){
                    String no,ap,se,ed, mixi,tod;
                    int ed2;
                    mixi = mm.getText().toString();
                    tod="Usted es una persona: " + mixi;
                    no = n.getText().toString();
                    ap = a.getText().toString();
                    se = m.getText().toString();
                    ed = e.getText().toString();
                    Intent i = new Intent(MainActivity.this, pantalla2.class);
                    i.putExtra("d1", no);
                    i.putExtra("d2", ap);
                    i.putExtra("d3", se);
                    i.putExtra("d4", ed);
                    i.putExtra("d5", tod);
                    startActivity(i);
                    finish();
                }
                if (sede.isChecked()){
                    String no,ap,se,ed,tod,sedi;
                    int ed2;
                    sedi = sede.getText().toString();
                    tod="Usted es una persona: " + sedi;
                    no = n.getText().toString();
                    ap = a.getText().toString();
                    se = m.getText().toString();
                    ed = e.getText().toString();
                    Intent i = new Intent(MainActivity.this, pantalla3.class);
                    i.putExtra("d13", no);
                    i.putExtra("d23", ap);
                    i.putExtra("d33", se);
                    i.putExtra("d43", ed);
                    i.putExtra("d11", tod);
                    startActivity(i);
                    finish();
                }
            }
    }
}
