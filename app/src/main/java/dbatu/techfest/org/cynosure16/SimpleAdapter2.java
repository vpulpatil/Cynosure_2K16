package dbatu.techfest.org.cynosure16;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VIPUL on 26-Jan-16.
 */
public class SimpleAdapter2 extends RecyclerView.Adapter<SimpleAdapter2.MyHolder> {

    private List<Content> contents;

    SimpleAdapter2() {
        contents = new ArrayList<>();
        contents.add(new Content("Android Workshop"));
        contents.add(new Content("Chemical Workshop"));
        contents.add(new Content("Robowars Workshop"));
        contents.add(new Content("Wall-following Robotics Workshop"));
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyHolder holder, final int position) {

        /*holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Clicked "+position,Toast.LENGTH_SHORT).show();
            }
        });*/

        final Content rowData = contents.get(position);
        holder.textView.setText(rowData.name);
        holder.itemView.setTag(rowData);


    }

    @Override
    public int getItemCount() {
        return contents.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        private TextView textView;


        public MyHolder(final View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.text);
            /*itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemView.getContext().startActivity(new Intent(v.getContext(),Main2Activity.class));
                }
            });*/

        }
    }
}
