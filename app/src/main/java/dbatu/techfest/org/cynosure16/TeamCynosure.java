package dbatu.techfest.org.cynosure16;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VIPUL on 26-Jan-16.
 */
public class TeamCynosure extends RecyclerView.Adapter<TeamCynosure.MyHolder> {

    private List<Content> contents;

    TeamCynosure() {
        contents = new ArrayList<>();
        contents.add(new Content("Robowars"));
        contents.add(new Content("X'celerate Reloaded"));
        contents.add(new Content("I-Speak Paper Presentation"));
        contents.add(new Content("Frugal World"));
        contents.add(new Content("Mock Recruitment Drive"));
        contents.add(new Content("#Framed"));
        contents.add(new Content("Marketkshetra"));
        contents.add(new Content("Estate Wars"));
        contents.add(new Content("Structura"));
        contents.add(new Content("Enigma"));
        contents.add(new Content("Prog.Champs"));
        contents.add(new Content("D-Tech-Tive"));
        contents.add(new Content("Micro-App"));
        contents.add(new Content("Micromouse"));
        contents.add(new Content("Googler"));
        contents.add(new Content("Maze Runner"));
        contents.add(new Content("Crime Scene Investigation"));
        contents.add(new Content("Ignite"));
        contents.add(new Content("Thought Expo"));
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
        //holder.image.setImageResource(rowData.image);
        holder.itemView.setTag(rowData);


    }

    @Override
    public int getItemCount() {
        return contents.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        private TextView textView;
        //private ImageView image;

        public MyHolder(final View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.text);
            //image= (ImageView) itemView.findViewById(R.id.image);
            /*itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemView.getContext().startActivity(new Intent(v.getContext(),Main2Activity.class));
                }
            });*/

        }
    }
}
