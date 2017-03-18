package com.mobilerepair.app.customlistview42;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Santoshraddi on 21-02-2017.
 */
public class CustomListViewAdapter extends ArrayAdapter<RowItems> {


    Context context;

    public CustomListViewAdapter(Context context, int resourceId,
                                 List<RowItems> items) {
        super(context, resourceId, items);
        this.context = context;
    }


    /*private view holder class*/
    private class ViewHolder {

        TextView txtName;
        TextView txtPhone;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        RowItems rowItem = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.txtName = (TextView) convertView.findViewById(R.id.name);
            holder.txtPhone = (TextView) convertView.findViewById(R.id.phone);

            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        holder.txtPhone.setText(rowItem.getPhone());
        holder.txtName.setText(rowItem.getName());

        return convertView;
    }
}
