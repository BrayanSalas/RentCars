package markintoch.rentcar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class DetallesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        String marca = getIntent().getExtras().getString("marca");
        int poster = getIntent().getExtras().getInt("poster");
        String puertas = getIntent().getExtras().getString("puertas");
        String color = getIntent().getExtras().getString("color");
        String modelo = getIntent().getExtras().getString("modelo");
        String ac = getIntent().getExtras().getString("ac");
        String transmision = getIntent().getExtras().getString("transmision");
        String capacidad = getIntent().getExtras().getString("capacidad");
        String descripcionAdicional = getIntent().getExtras().getString("descripcionAdicional");
        String precio = getIntent().getExtras().getString("precio");
    }
}
