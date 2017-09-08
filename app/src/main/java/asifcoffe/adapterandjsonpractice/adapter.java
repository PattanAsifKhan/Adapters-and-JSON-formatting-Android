package asifcoffe.adapterandjsonpractice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hp on 7/14/2017.
 */

public class adapter extends ArrayAdapter<item> {

    public adapter(@NonNull Context context, @NonNull ArrayList<item> objects) {
        super(context, 0, objects);

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view=convertView;
        if(view==null){
            view= (LayoutInflater.from(getContext())).inflate(R.layout.itemview,null);
        }
        item item= getItem(position);
        ImageView imageView=(ImageView) view.findViewById(R.id.image);
        TextView textView=(TextView) view.findViewById(R.id.text);
        TextView textView1=(TextView) view.findViewById(R.id.text1);
        imageView.setImageResource(item.getImage());
        textView.setText(item.getS1());
        textView1.setText(item.getS2());
        return view;
    }


}
