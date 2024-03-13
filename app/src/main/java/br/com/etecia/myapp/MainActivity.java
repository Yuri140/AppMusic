package br.com.etecia.myapp;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewMusicas;
    List<Musicas> lstMusicas;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        lstMusicas = new ArrayList<>();

        lstMusicas.add(new Musicas(R.drawable.gunsnroses, "Vou esuprar vc", 03012024, "Mc Estrupro"));
//        lstMusicas.add(new Musicas(R.drawable.gunsnroses, "Ficção Científica", " Madhu é abduzida por uma nave intergaláctica";
//        lstMusicas.add(new Musicas("O sol é para todos","Ficção","2024",R.drawable.gunsnroses));
//        lstMusicas.add(new Musicas("Eu e Esse Meu Coração", "Auto ajuda", "Eu e Esse Meu Coração", R.drawable.coracao));
//        lstMusicas.add(new Musicas("Dieta", "Alimentação", "Este não é mais um livro de dieta: O novo e libertador estilo de vida alimentar para saúde e boa", R.drawable.dieta));
//        lstMusicas.add(new Musicas("O dilema", "Auto ajuda", "O dilema do porco espinho", R.drawable.dilema));
//        lstMusicas.add(new Musicas("Como fazer Amigos", "Auto ajuda", "Como fazer amigos", R.drawable.amigos));
//        lstMusicas.add(new Musicas("The Vegitarian ", "Romance", "The Vegitarian Life", R.drawable.thevigitarian));
//        lstMusicas.add(new Musicas("The Wild Robot", "Categoria do livro", "Descrição do livro", R.drawable.thewildrobot));
//        lstMusicas.add(new Musicas("The Martian", "Categoria do livro", "Descrição do livro", R.drawable.themartian));
//        lstMusicas.add(new Musicas("Privacy", "Categoria do livro", "Descrição do livro", R.drawable.privacy));
//        lstMusicas.add(new Musicas("Maria Semples", "Categoria do livro", "Descrição do livro", R.drawable.mariasemples));
//        lstMusicas.add(new Musicas("Hedied With", "Categoria do livro", "Descrição do livro", R.drawable.hediedwith));
//        lstMusicas.add(new Musicas("O dilema", "Auto ajuda", "O dilema do porco espinho", R.drawable.dilema));
//        lstMusicas.add(new Musicas("Iracema", "Clássico", "Uma das histórias de amor mais aclamadas da literatura brasileira", R.drawable.a_realidade));
//        lstMusicas.add(new Musicas("O Homem Que Sabia Javanês", "Clássico", "Uma chamada que muitos deixariam passar, Castelo enxergou uma oportunidade única.", R.drawable.ohomequesabia));
//        lstMusicas.add(new Musicas("Como fazer Amigos", "Auto ajuda", "Como fazer amigos", R.drawable.amigos));
//        lstMusicas.add(new Musicas("The Vegitarian ", "Romance", "The Vegitarian Life", R.drawable.thevigitarian));
//        lstMusicas.add(new Musicas("The Wild Robot", "Categoria do livro", "Descrição do livro", R.drawable.thewildrobot));
//        lstMusicas.add(new Musicas("The Martian", "Categoria do livro", "Descrição do livro", R.drawable.themartian));
//        lstMusicas.add(new Musicas("Privacy", "Categoria do livro", "Descrição do livro", R.drawable.privacy));
//        lstMusicas.add(new Musicas("Maria Semples", "Categoria do livro", "Descrição do livro", R.drawable.mariasemples));
//        lstMusicas.add(new Musicas("Hedied With", "Categoria do livro", "Descrição do livro", R.drawable.hediedwith));
//        lstMusicas.add(new Musicas("O poder do agora", "Auto Ajuda", "Um guia para a iluminação espiritual ", R.drawable.poder_agora));
//        lstMusicas.add(new Musicas("Pai rico, pai pobre para jovens", "Administração e Negócios", "o que a escola não ensina sobre dinheiro", "",));





        recyclerViewMusicas = findViewById(R.id.idRecyclerMusicas);

        recyclerViewMusicas.setLayoutManager(new GridLayoutManager(getApplicationContext(),3));

        MusicasAdapter adapter = new MusicasAdapter(getApplicationContext(),lstMusicas);

        recyclerViewMusicas.setAdapter(adapter);





    }
}