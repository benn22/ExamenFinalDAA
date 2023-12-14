package apps.isil.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lsvComidas;
    ListAdapter listAdapter;
    ArrayList<ListComida> dataArrayList = new ArrayList<>();
    ListComida listComida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lsvComidas = findViewById(R.id.lsvComidas);

        int[] imageList = {R.drawable.ajigallina, R.drawable.anticuchos, R.drawable.caucau, R.drawable.causa, R.drawable.ceviche, R.drawable.lomo, R.drawable.ocopa, R.drawable.seco};
        String[] nombreList = {"Aji de Gallina", "Anticuchos", "Cau Cau", "Causa", "Ceviche", "Lomo Saltado", "Ocopa", "Seco con Frejoles"};
        String[] precioList = {"10.00", "20.00", "30.00", "40.00", "50.00", "60.00", "70.00", "80.00"};

        for (int i = 0; i < imageList.length; i++){
            listComida = new ListComida(nombreList[i], precioList[i], imageList[i]);
            dataArrayList.add(listComida);
        }
        listAdapter = new ListAdapter(MainActivity.this, dataArrayList);
        lsvComidas.setAdapter(listAdapter);
        lsvComidas.setClickable(true);

        lsvComidas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Nombre: " + nombreList[i] + "\n" + "Precio: " + precioList[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}