package dbatu.techfest.org.cynosure16;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by VIPUL on 15-Jan-16.
 */
public class Workshops extends Fragment {

    public static RecyclerView workshopDetails;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.workshops, container, false);
        workshopDetails = (RecyclerView) v.findViewById(R.id.workshop_details);
        //LinearLayoutManager llm=new LinearLayoutManager(getContext());
        workshopDetails.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));

        final SimpleAdapter2 adapter = new SimpleAdapter2();
        workshopDetails.setAdapter(adapter);
        workshopDetails.setHasFixedSize(true);
        workshopDetails.addOnItemTouchListener(new RecyclerItemClickListener(getContext(), new RecyclerItemClickListener.OnItemClickListener() {

            @Override
            public void onItemClick(View view, int position) {
                if (position == 0) {
                    Intent i = new Intent(getContext(), AndroidWorkshopActivity.class);
                    startActivity(i);
                } else if (position == 1) {
                    Intent i = new Intent(getContext(), ChemWorkshopActivity.class);
                    startActivity(i);
                } else if (position == 2) {
                    Intent i = new Intent(getContext(), RoboWorkshopActivity.class);
                    startActivity(i);
                } else if (position == 3) {
                    Intent i = new Intent(getContext(), WallWorkshopActivity.class);
                    startActivity(i);
                }
            }
        }


        ));
        return v;
    }
}

