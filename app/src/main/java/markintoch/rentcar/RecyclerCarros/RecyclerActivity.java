package markintoch.rentcar.RecyclerCarros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import markintoch.rentcar.RecyclerDetalles.DetallesActivity;
import markintoch.rentcar.Objetos.Carro;
import markintoch.rentcar.R;

public class RecyclerActivity extends AppCompatActivity {
    private List<Carro> carros;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        int pos = getIntent().getExtras().getInt("position");

        if(pos == 0){
            carros = this.getAllCarrosES();
        }else if(pos == 1){
            carros = this.getAllCarrosSN();
        }else if(pos == 2){
            carros = this.getAllCarrosAP();
        }else{
            carros = this.getAllCarrosSC();
        }

        mRecyclerView = findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);

        mAdapter = new MyAdapter(carros, R.layout.item_rv, new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Carro carros, int position) {

                Intent intent = new Intent(RecyclerActivity.this, DetallesActivity.class);
                intent.putExtra("marca", carros.getMarca());
                intent.putExtra("poster", carros.getPoster());
                intent.putExtra("puertas", carros.getPuertas());
                intent.putExtra("color", carros.getColor());
                intent.putExtra("modelo", carros.getModelo());
                intent.putExtra("ac", carros.getAc());
                intent.putExtra("transmision", carros.getTransmision());
                intent.putExtra("capacidad", carros.getCapacidad());
                intent.putExtra("descripcionAdicional", carros.getDescripcionAdicional());
                intent.putExtra("precio", carros.getPrecio());
                startActivity(intent);
            }
        });

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }

    private List<Carro> getAllCarrosES(){
        return new ArrayList<Carro>(){{
            add(new Carro("Seat Ibiza", "http://www.megautos.com/wp-content/uploads/2017/02/Seat-Ibiza-2017-adelante.jpg", "4", "arena", "2017", "ac", "manual", "5", "desc", "1000"));
            add(new Carro("Honda Civic", "https://s.aolcdn.com/commerce/autodata/images/USC60NIC041C021001.jpg",  "4", "blue", "2010", "ac", "auto", "4", "desc", "2000"));
            add(new Carro("Ford Mustang", "https://s.aolcdn.com/commerce/autodata/images/USC50FOC051B021001.jpg",  "2", "negro", "2016", "ac", "manual", "4", "desc", "3000"));
            add(new Carro("Nissan Tiida", "https://acs2.blob.core.windows.net/imgcatalogo/l/VA_d2fce277d4ea49198845e0003b0498d5.jpg",  "4", "blanco", "2016", "ac", "auto", "4", "desc", "4000"));
        }};
    }

    private List<Carro> getAllCarrosSN(){
        return new ArrayList<Carro>(){{
            add(new Carro("Nissan March", "https://www.nissan-cdn.net/content/dam/Nissan/co/vehicles/march-active/MARCH%202015%20FRENTE%20COP.PICADA%20LAYERS.jpg.ximg.l_full_m.smart.jpg",  "4", "gris", "2016", "ac", "auto", "4", "desc", "2000"));
            add(new Carro("Nissan Tiida", "https://acs2.blob.core.windows.net/imgcatalogo/l/VA_d2fce277d4ea49198845e0003b0498d5.jpg",  "4", "blanco", "2016", "ac", "auto", "4", "desc", "4000"));
            add(new Carro("Nissan Spark", "https://www.chevycarsupdates.com/wp-content/uploads/2017/10/2019-Chevrolet-Spark-Active-Release-Date.jpg",  "2", "negro", "2016", "ac", "manual", "4", "desc", "3000"));
            add(new Carro("Seat Ibiza", "http://www.megautos.com/wp-content/uploads/2017/02/Seat-Ibiza-2017-adelante.jpg", "4", "arena", "2017", "ac", "manual", "5", "desc", "1000"));
        }};
    }

    private List<Carro> getAllCarrosAP(){
        return new ArrayList<Carro>(){{
            add(new Carro("Ford Mustang", "https://s.aolcdn.com/commerce/autodata/images/USC50FOC051B021001.jpg",  "2", "negro", "2016", "ac", "manual", "4", "desc", "3000"));
            add(new Carro("Nissan March", "https://www.nissan-cdn.net/content/dam/Nissan/co/vehicles/march-active/MARCH%202015%20FRENTE%20COP.PICADA%20LAYERS.jpg.ximg.l_full_m.smart.jpg",  "4", "gris", "2016", "ac", "auto", "4", "desc", "2000"));
            add(new Carro("Honda Civic", "https://s.aolcdn.com/commerce/autodata/images/USC60NIC041C021001.jpg",  "4", "blue", "2010", "ac", "auto", "4", "desc", "2000"));
            add(new Carro("Nissan Tiida", "https://acs2.blob.core.windows.net/imgcatalogo/l/VA_d2fce277d4ea49198845e0003b0498d5.jpg",  "4", "blanco", "2016", "ac", "auto", "4", "desc", "4000"));
        }};
    }

    private List<Carro> getAllCarrosSC(){
        return new ArrayList<Carro>(){{
            add(new Carro("Nissan Sonic LT", "https://acs2.blob.core.windows.net/imgcatalogo/xl/VA_07ae4efc62c841eab82d8db56d957413.jpg", "4", "arena", "2017", "ac", "manual", "5", "desc", "1000"));
                add(new Carro("Nissan Sonic", "http://territorioinformativo.com/wp-content/uploads/2016/09/sonic_TerritorioInformativo.jpg",  "4", "blue", "2010", "ac", "auto", "4", "desc", "2000"));
            add(new Carro("Ford Mustang", "https://s.aolcdn.com/commerce/autodata/images/USC50FOC051B021001.jpg",  "2", "negro", "2016", "ac", "manual", "4", "desc", "3000"));
            add(new Carro("Nissan Tiida", "https://acs2.blob.core.windows.net/imgcatalogo/l/VA_d2fce277d4ea49198845e0003b0498d5.jpg",  "4", "blanco", "2016", "ac", "auto", "4", "desc", "4000"));
        }};
    }
}
