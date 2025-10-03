package id.ac.unp.ft.informatika.baseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

class ItemAdapter extends BaseAdapter {

    private Context context;
    private List<Item> items;

    public ItemAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_row_layout, parent, false);
        }

        TextView textName = convertView.findViewById(R.id.textName);
        TextView textDescription = convertView.findViewById(R.id.textDescription);

        Item item = (Item) getItem(position);

        // Pastikan method di Item sesuai: getName() atau getTitle()
        textName.setText(item.getName());
        textDescription.setText(item.getDescription());

        return convertView;
    }
}
