import java.time.LocalDate;

public class FitnessTracker {
    private String activity;
    private int minutes;
    private LocalDate date;

    // Default constructor
    public FitnessTracker() {
        this.activity = "Running";
        this.minutes = 0;
        this.date = LocalDate.of(LocalDate.now().getYear(), 1, 1);
    }

    // Overloaded constructor
    public FitnessTracker(String activity, int minutes, LocalDate date) {
        this.activity = activity;
        this.minutes = minutes;
        this.date = date;
    }

    // Getter for activity
    public String getActivity() {
        return activity;
    }

    // Getter for minutes
    public int getMinutes() {
        return minutes;
    }

    // Getter for date
    public LocalDate getDate() {
        return date;
    }
}

