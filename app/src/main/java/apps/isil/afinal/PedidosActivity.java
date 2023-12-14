package apps.isil.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class PedidosActivity extends AppCompatActivity {

    TextView txtPlato, txtCantidad, txtTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos);

        txtPlato = findViewById(R.id.txtOrdenPlato);
        txtCantidad = findViewById(R.id.txtOrdenCantidad);
        txtTotal = findViewById(R.id.txtOrdenTotal);

        String nombre = getIntent().getStringExtra("nombre");
        String precio = getIntent().getStringExtra("precio");
        Integer cantidad = getIntent().getIntExtra("cantidad", 0);
        Double total = getIntent().getDoubleExtra("total", 0.0);

        txtPlato.setText(nombre);
        txtCantidad.setText(String.valueOf(cantidad));
        txtTotal.setText(String.valueOf(total));
    }
}