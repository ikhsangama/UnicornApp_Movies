package ikhsan.unicorn_movie.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ikhsan.unicorn_movie.Holder.RecyclerHoldersTrailer;
import ikhsan.unicorn_movie.ObjectTrailer;
import ikhsan.unicorn_movie.R;
import ikhsan.unicorn_movie.R;

public class RecyclerAdapterTrailer extends RecyclerView.Adapter<RecyclerHoldersTrailer> {
    public List<ObjectTrailer.DataTrailer> itemList;
    public Context context;

    public RecyclerAdapterTrailer(Context context, List<ObjectTrailer.DataTrailer> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerHoldersTrailer onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_trailer, null);
        RecyclerHoldersTrailer rcv = new RecyclerHoldersTrailer(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerHoldersTrailer holder, int position) {
        // ObjectTrailer.DataTrailer item = itemList.get(position);
        holder.txtName.setText(itemList.get(position).name);
        holder.txtType.setText(itemList.get(position).type);
        holder.key = itemList.get(position).key;
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

}