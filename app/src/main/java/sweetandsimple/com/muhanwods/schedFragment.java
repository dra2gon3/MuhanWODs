package sweetandsimple.com.muhanwods;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.Toast;

public class schedFragment extends Fragment{
    CalendarView calendar;

    public schedFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_sched, container, false);

        initializeCalender(rootView);
        return rootView;

    }
   public void initializeCalender(View rootView){
        calendar = (CalendarView)rootView.findViewById(R.id.calendar);
        calendar.setShowWeekNumber(false);
        calendar.setFirstDayOfWeek(1);

    }
}
