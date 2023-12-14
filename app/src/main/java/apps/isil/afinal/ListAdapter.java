package apps.isil.afinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<ListComida> {
    public ListAdapter(@NonNull Context context, ArrayList<ListComida> dataArrayList) {
        super(context, R.layout.list_item, dataArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        ListComida listComida = getItem(position);

        if (view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ImageView listImage = view.findViewById(R.id.imgComida);
        TextView listName = view.findViewById(R.id.txtNombreComida);
        TextView listPrecio = view.findViewById(R.id.txtPrecio);

        listImage.setImageResource(listComida.image);
        listName.setText(listComida.nombre);
        listPrecio.setText("S/ " + listComida.precio);

        return view;
    }
}
