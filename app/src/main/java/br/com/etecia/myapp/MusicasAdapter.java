package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MusicasAdapter extends RecyclerView.Adapter<MusicasAdapter.MusicViewHolder> {

    private List<Musicas> musicList;

    public MusicasAdapter(Context applicationContext, List<Musicas> listaMusicas) {
        this.musicList = listaMusicas;
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_principal_layout, parent, false);
        return new MusicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {
        Musicas music = musicList.get(position);
        holder.bind(music);
    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }

    static class MusicViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewMusicaBanner;
        private TextView textViewMusicaNome;
        private TextView textViewMusicaArtista;

        MusicViewHolder(View itemView) {
            super(itemView);
            imageViewMusicaBanner = itemView.findViewById(R.id.idImgMusica);
            textViewMusicaNome = itemView.findViewById(R.id.txtNomeMusica);
            textViewMusicaArtista = itemView.findViewById(R.id.txtNomeMusica);
        }

        void bind(Musicas music) {
            imageViewMusicaBanner.setImageResource(music.getImagem());
            textViewMusicaNome.setText(music.getNomeMusica());
            textViewMusicaArtista.setText(music.getArtista());
        }
    }
}