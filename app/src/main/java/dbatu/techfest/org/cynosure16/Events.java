package dbatu.techfest.org.cynosure16;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.logging.Handler;

/**
 * Created by VIPUL on 15-Jan-16.
 */
public class Events extends Fragment {

    public static RecyclerView eventDetails;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.events, container, false);
        eventDetails = (RecyclerView) v.findViewById(R.id.event_details);
        //LinearLayoutManager llm=new LinearLayoutManager(getContext());
        eventDetails.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));

        final SimpleAdapter adapter = new SimpleAdapter();
        eventDetails.setAdapter(adapter);
        eventDetails.setHasFixedSize(true);
        eventDetails.addOnItemTouchListener(new RecyclerItemClickListener(getContext(), new RecyclerItemClickListener.OnItemClickListener() {

            @Override
            public void onItemClick(View view, int position) {
                if (position == 0) {
                    Intent i = new Intent(getContext(), RoboWarsActivity.class);
                    startActivity(i);
                } else if (position == 1) {
                    Intent i = new Intent(getContext(), FramedActivity.class);
                    startActivity(i);
                } else if (position == 2) {
                    Intent i = new Intent(getContext(), XcelerateActivity.class);
                    startActivity(i);
                } else if (position == 3) {
                    Intent i = new Intent(getContext(), FrugalLabsActivity.class);
                    startActivity(i);
                } else if (position == 4) {
                    Intent i = new Intent(getContext(), MockDriveActivity.class);
                    startActivity(i);
                } else if (position == 5) {
                    Intent i = new Intent(getContext(), ISpeakActivity.class);
                    startActivity(i);
                } else if (position == 6) {
                    Intent i = new Intent(getContext(), MarketKshetraActivity.class);
                    startActivity(i);
                } else if (position == 7) {
                    Intent i = new Intent(getContext(), EstateWarsActivity.class);
                    startActivity(i);
                } else if (position == 8) {
                    Intent i = new Intent(getContext(), StructuraActivity.class);
                    startActivity(i);
                } else if (position == 9) {
                    Intent i = new Intent(getContext(), EnigmaActivity.class);
                    startActivity(i);
                } else if (position == 10) {
                    Intent i = new Intent(getContext(), ProgChampsActivity.class);
                    startActivity(i);
                } else if (position == 11) {
                    Intent i = new Intent(getContext(), DetectiveActivity.class);
                    startActivity(i);
                } else if (position == 12) {
                    Intent i = new Intent(getContext(), MicroAppActivity.class);
                    startActivity(i);
                } else if (position == 13) {
                    Intent i = new Intent(getContext(), MicroMouseActivity.class);
                    startActivity(i);
                } else if (position == 14) {
                    Intent i = new Intent(getContext(), GooglerActivity.class);
                    startActivity(i);
                } else if (position == 15) {
                    Intent i = new Intent(getContext(), MazeRunnerActivity.class);
                    startActivity(i);
                } else if (position == 16) {
                    Intent i = new Intent(getContext(), CrimeSceneActivity.class);
                    startActivity(i);
                } else if (position == 17) {
                    Intent i = new Intent(getContext(), IgniteActivity.class);
                    startActivity(i);
                } else if (position == 18) {
                    Intent i= new Intent(getContext(), ThoughtExpoActivity.class);
                    startActivity(i);
                }
            }
        }


        ));
        return v;
    }
}

