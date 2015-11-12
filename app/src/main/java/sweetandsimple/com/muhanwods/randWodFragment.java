package sweetandsimple.com.muhanwods;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class randWodFragment extends Fragment {
    private long workoutId;

    public randWodFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_rand_wod, container, false);
        this.setWorkout(0);

        return rootView;
    }
    @Override
    public void onStart(){
        super.onStart();
        View view = getView();
        if (view != null){
            TextView title = (TextView)view.findViewById(R.id.textTitle);
            Workout workout = Workout.workouts[(int)workoutId];
            title.setText(workout.getName());
            TextView description = (TextView)view.findViewById(R.id.textDescription);
            description.setText(workout.getDescription());
        }
    }
    public void setWorkout(long id){
        this.workoutId = id;
    }


}
