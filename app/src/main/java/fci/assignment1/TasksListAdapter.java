package fci.assignment1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mohamed Nabil Mohamed (Nobel) on 11/25/2017.
 * byte code SA
 * m.nabil.fci2015@gmail.com
 */

public class TasksListAdapter extends BaseAdapter {

    ArrayList ListData;
    LayoutInflater inflater;

    public TasksListAdapter(ArrayList ListData, LayoutInflater inflater) {
        this.ListData = ListData;
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return ListData.size();
    }

    @Override
    public Object getItem(int position) {
        return ListData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TaskItemData item = (TaskItemData) getItem(position);
        Holder holder;
        if (convertView == null) {
            //inflate new View
            convertView = inflater.inflate(R.layout.item_task, null);
            holder = new Holder();
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }
        holder.image = convertView.findViewById(R.id.circle);
        holder.taskname = convertView.findViewById(R.id.text);

        holder.taskname.setText(item.getTaskname());
        holder.image.setImageResource(item.ImageId);


        return convertView;
    }

    static class Holder {
        ImageView image;
        TextView taskname;

    }

}
