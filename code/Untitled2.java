import java.util.*;
import java.text.*;

class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    // Other user-related methods
}

class Destination {
    String name;
    String description;

    public Destination(String name, String description) {
        this.name = name;
        this.description = description;
    }
    // Other destination-related methods
}

class Activity {
    String name;
    String description;

    public Activity(String name, String description) {
        this.name = name;
        this.description = description;
    }
    // Other activity-related methods
}

class Trip {
    User user;
    Destination destination;
    Date startDate;
    Date endDate;
    List<Activity> activities = new ArrayList<>();

    public Trip(User user, Destination destination, Date startDate, Date endDate) {
        this.user = user;
        this.destination = destination;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }
    // Other trip-related methods
}

public class CoupleTripPlannerApp {
    static List<User> users = new ArrayList<>();
    static List<Destination> destinations = new ArrayList<>();
    static List<Activity> activities = new ArrayList<>();
    static List<Trip> trips = new ArrayList<>();
    static User currentUser;

    public static void main(String[] args) {
        // Initialize sample data
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");
        users.add(user1);
        users.add(user2);

        Destination dest1 = new Destination("Paris", "City of Love");
        Destination dest2 = new Destination("Bali", "Tropical Paradise");
        destinations.add(dest1);
        destinations.add(dest2);

        Activity activity1 = new Activity("Sightseeing", "Visit famous landmarks");
        Activity activity2 = new Activity("Beach Relaxation", "Enjoy sun and sand");
        activities.add(activity1);
        activities.add(activity2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User loggedInUser = loginUser(username, password);
        if (loggedInUser != null) {
            currentUser = loggedInUser;
            System.out.println("Welcome, " + currentUser.username + "!");
            // Implement the rest of the user interaction and functionalities
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public static User loginUser(String username, String password) {
        for (User user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                return user;
            }
        }
        return null;
    }
}
