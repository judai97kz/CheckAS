package com.judai.test_app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AuAdapter extends BaseAdapter {
    private Context context;
    private List<Aus> aUsList;
    private int layout;
    private Aus aus;

    public AuAdapter(Context context, List<Aus> aUsList, int layout) {
        this.context = context;
        this.aUsList = aUsList;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
        TextView txname = (TextView) view.findViewById(R.id.name);
        TextView txclass = (TextView) view.findViewById(R.id.Class);
        TextView txele = (TextView) view.findViewById(R.id.Ele);
        TextView txele1= (TextView) view.findViewById(R.id.Ele1);
        TextView txst = (TextView) view.findViewById(R.id.star);
        ImageView imgau = (ImageView) view.findViewById(R.id.img);

        Aus aUs = aUsList.get(i);
        txname.setText(aUs.get_name());
        txclass.setText(aUs.get_class());
        txele.setText(aUs.get_ele1());
        String cele = aUs.get_ele2();
        if(cele.equals("")==true)
        {
            txele1.setText(aUs.get_ele2());
        }
        else
        {
            String c = "/  ";
            cele = c.concat(aUs.get_ele2());
            txele1.setText(cele);
        }
        txst.setText(aUs.get_star());
        imgau.setImageBitmap(aUs.get_img());
        return view;
    }
}
