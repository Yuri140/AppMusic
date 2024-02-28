package br.com.etecia.myapp;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MusicasAdapter extends RecyclerView.Adapter<MusicasAdapter.ViewHolder> {

    private Context context;
    private List<Musicas> listaMusicas;

    public MusicasAdapter(Context context, List<Musicas> listaMusicas) {
        this.context = context;
        this.listaMusicas = listaMusicas;
    }

    @NonNull
    @Override
    public MusicasAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }
}

