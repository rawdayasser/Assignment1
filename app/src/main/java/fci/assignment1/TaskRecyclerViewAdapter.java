package fci.assignment1;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mohamed Nabil Mohamed (Nobel) on 11/25/2017.
 * byte code SA
 * m.nabil.fci2015@gmail.com
 */

public class TaskRecyclerViewAdapter extends RecyclerView.Adapter<TaskRecyclerViewAdapter.ViewHolder> {

    public ArrayList items;

    public TaskRecyclerViewAdapter(ArrayList items) {

        this.items = items;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item_task, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        CardView cardView = holder.cardView;
        TaskItemData item = (TaskItemData) items.get(position);
        ImageView circle = cardView.findViewById(R.id.circle);
        TextView taskname = cardView.findViewById(R.id.text);

        taskname.setText(item.getTaskname());
        circle.setImageResource(item.getImageId());


    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
        }
    }