package e.fimo2.integradora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

public class pantalla2 extends AppCompatActivity{

    private CheckBox q,w,e,r;
    private Button en,pat;
    private RelativeLayout in;
    String tod,a,b,c,d,p;
    int t =0;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        q = findViewById(R.id.of);
        w = findViewById(R.id.esc);
        e = findViewById(R.id.ca);
        r = findViewById(R.id.dep);
        en = findViewById(R.id.env2);



        Bundle extras = getIntent().getExtras();
        a = extras.getString("d1");
        b = extras.getString("d2");
        c = extras.getString("d3");
        d = extras.getString("d4");
    }

    public void ennnn(View view) {
            if (q.isChecked() && w.isChecked() && e.isChecked() && r.isChecked()){
                String off = q.getText().toString();
                String escu = w.getText().toString();
                String cas = e.getText().toString();
                String depo = r.getText().toString();

                t=1;
                p= Integer.toString(t);

                tod ="Usted es una persona: Mixta " + "y se dedica a: " + off + ", " + escu + ", " + cas + " y " + depo;

                Intent i = new Intent(pantalla2.this, pantalla3.class);
                i.putExtra("d13", a);
                i.putExtra("d23", b);
                i.putExtra("d33", c);
                i.putExtra("d43", d);
                i.putExtra("d11", tod);
                i.putExtra("d53", p);

                startActivity(i);
                finish();
            }
            if (q.isChecked() && w.isChecked() && e.isChecked()){
                String off = q.getText().toString();
                String escu = w.getText().toString();
                String cas = e.getText().toString();
                t=1;
                p= Integer.toString(t);
                tod ="Usted es una persona: Mixta " + "y se dedica a: " + off + ", " + escu + " y " + cas;

                Intent i = new Intent(pantalla2.this, pantalla3.class);
                i.putExtra("d13", a);
                i.putExtra("d23", b);
                i.putExtra("d33", c);
                i.putExtra("d43", d);
                i.putExtra("d11", tod);
                i.putExtra("d53", p);

                startActivity(i);
                finish();
            }
            if (q.isChecked() && w.isChecked()){
                String off = q.getText().toString();
                String escu = w.getText().toString();
                t=1;
                tod ="Usted es una persona: Mixta" + "y se dedica a: " + off + " y " + escu;

                Intent i = new Intent(pantalla2.this, pantalla3.class);
                i.putExtra("d13", a);
                i.putExtra("d23", b);
                i.putExtra("d33", c);
                i.putExtra("d43", d);
                i.putExtra("d11", tod);
                i.putExtra("d53", t);
                startActivity(i);
                finish();
            }
            if (q.isChecked()){
                String off = q.getText().toString();
                t=1;
                p= Integer.toString(t);
                tod ="Usted es una persona: Mixta " + "y se dedica a: " + off;

                Intent i = new Intent(pantalla2.this, pantalla3.class);
                i.putExtra("d13", a);
                i.putExtra("d23", b);
                i.putExtra("d33", c);
                i.putExtra("d43", d);
                i.putExtra("d11", tod);
                i.putExtra("d53", p);
                startActivity(i);
                finish();
            }
            if (w.isChecked() && e.isChecked() && r.isChecked()){
                String escu = w.getText().toString();
                String cas = e.getText().toString();
                String depo = r.getText().toString();
                t=2;
                tod ="Usted es una persona: Mixta " + "y se dedica a: " + escu + ", " + cas + " y " + depo;

                Intent i = new Intent(pantalla2.this, pantalla3.class);
                i.putExtra("d13", a);
                i.putExtra("d23", b);
                i.putExtra("d33", c);
                i.putExtra("d43", d);
                i.putExtra("d11", tod);
                i.putExtra("d53", t);
                startActivity(i);
                finish();
            }
            if (w.isChecked() && e.isChecked()){
                String escu = w.getText().toString();
                String cas = e.getText().toString();

                tod ="Usted es una persona: Mixta " + "y se dedica a: " + escu + ", " + cas;
                t=2;
                Intent i = new Intent(pantalla2.this, pantalla3.class);
                i.putExtra("d13", a);
                i.putExtra("d23", b);
                i.putExtra("d33", c);
                i.putExtra("d43", d);
                i.putExtra("d11", tod);
                i.putExtra("d53", t);
                startActivity(i);
                finish();
            }
            if (w.isChecked()) {
                String escu = w.getText().toString();
                t=2;
                p= Integer.toString(t);
                tod ="Usted es una persona: Mixta " + "y se dedica a: " + escu;

                Intent i = new Intent(pantalla2.this, pantalla3.class);
                i.putExtra("d13", a);
                i.putExtra("d23", b);
                i.putExtra("d33", c);
                i.putExtra("d43", d);
                i.putExtra("d11", tod);
                i.putExtra("d53", p);
                startActivity(i);
                finish();
            }
            if (e.isChecked() && r.isChecked()){
                String depo = r.getText().toString();
                String cas = e.getText().toString();
                t=3;
                tod ="Usted es una persona: Mixta " + "y se dedica a: " + cas + " y " + depo;

                Intent i = new Intent(pantalla2.this, pantalla3.class);
                i.putExtra("d13", a);
                i.putExtra("d23", b);
                i.putExtra("d33", c);
                i.putExtra("d43", d);
                i.putExtra("d11", tod);
                i.putExtra("d53", t);
                startActivity(i);
                finish();
            }
            if (e.isChecked()){
                String cas = e.getText().toString();
                t=3;
                p= Integer.toString(t);
                tod ="Usted es una persona: Mixta " + "y se dedica a: " + cas;

                Intent i = new Intent(pantalla2.this, pantalla3.class);
                i.putExtra("d13", a);
                i.putExtra("d23", b);
                i.putExtra("d33", c);
                i.putExtra("d43", d);
                i.putExtra("d11", tod);
                i.putExtra("d53", p);
                startActivity(i);
                finish();
            }
            if (r.isChecked()){
                String depo = r.getText().toString();
                t=4;
                p= Integer.toString(t);
                tod ="Usted es una persona: Mixta " + "y se dedica a: " + depo;

                Intent i = new Intent(pantalla2.this, pantalla3.class);
                i.putExtra("d13", a);
                i.putExtra("d23", b);
                i.putExtra("d33", c);
                i.putExtra("d43", d);
                i.putExtra("d11", tod);
                i.putExtra("d53", p);
                startActivity(i);
                finish();
            }
        }
}
