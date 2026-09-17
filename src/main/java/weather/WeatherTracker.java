package weather;

public class WeatherTracker {
    private final Notifier rainNotifier;
    private final Notifier sunNotifier;
    String currentConditions;

    public WeatherTracker() {
        // rain -> Phone, sum -> Email
        this(new Phone(), new Email());
    }

    public WeatherTracker(Notifier rainNotifier, Notifier sunNotifier) {
        this.rainNotifier = rainNotifier;
        this.sunNotifier = sunNotifier;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = rainNotifier.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = sunNotifier.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
