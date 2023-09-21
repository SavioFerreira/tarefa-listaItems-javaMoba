package sfc.appjava;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imagemView;
    TextView nomeView, precoView;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imagemView = itemView.findViewById(R.id.imageview);
        nomeView = itemView.findViewById(R.id.name);
        precoView = itemView.findViewById(R.id.preco);
    }
}
