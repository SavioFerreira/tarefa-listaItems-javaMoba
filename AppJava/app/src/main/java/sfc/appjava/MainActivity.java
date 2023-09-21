package sfc.appjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Monkey D. Luffy", "preço: 3.0000.00", R.drawable.luffy50px));
        items.add(new Item("Roronoa D. Zoro", "preço: 1.5000.00", R.drawable.zoro50px));
        items.add(new Item("Uzumaki Narutinho", "preço: 500.00", R.drawable.naruto50px));
        items.add(new Item("Son Goku", "1000.00", R.drawable.goku50px));

        items.add(new Item("Monkey D. Luffy", "preço: 3.0000.00", R.drawable.luffy50px));
        items.add(new Item("Roronoa D. Zoro", "preço: 1.5000.00", R.drawable.zoro50px));
        items.add(new Item("Uzumaki Narutinho", "preço: 500.00", R.drawable.naruto50px));
        items.add(new Item("Son Goku", "1000.00", R.drawable.goku50px));

        items.add(new Item("Monkey D. Luffy", "preço: 3.0000.00", R.drawable.luffy50px));
        items.add(new Item("Roronoa D. Zoro", "preço: 1.5000.00", R.drawable.zoro50px));
        items.add(new Item("Uzumaki Narutinho", "preço: 500.00", R.drawable.naruto50px));
        items.add(new Item("Son Goku", "preço: 1000.00", R.drawable.goku50px));

        items.add(new Item("Monkey D. Luffy", "preço: 3.0000.00", R.drawable.luffy50px));
        items.add(new Item("Roronoa D. Zoro", "preço: 1.5000.00", R.drawable.zoro50px));
        items.add(new Item("Uzumaki Narutinho", "preço: 500.00", R.drawable.naruto50px));
        items.add(new Item("Son Goku", "preço: 1000.00", R.drawable.goku50px));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}