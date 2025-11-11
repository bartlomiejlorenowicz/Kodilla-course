package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperatures() {
        Map<String, Double> resultMap = temperatures.getTemperatures();
        double sum = 0.0;
        for (Map.Entry<String, Double> temperature : resultMap.entrySet()) {
            sum += temperature.getValue();
        }
        return sum / resultMap.size();
    }

    public double calculateMedianTemperatures() {
        Map<String, Double> resultMap = temperatures.getTemperatures();
        List<Double> sorted = new ArrayList<>();

        for (Map.Entry<String, Double> temperature : resultMap.entrySet()) {
            sorted.add(temperature.getValue());
        }

        Collections.sort(sorted);

        if (sorted.size() % 2 == 1) {
            return sorted.get(sorted.size() / 2);
        } else {
            int middle = sorted.size() / 2;
            return (sorted.get(middle - 1) + sorted.get(middle)) / 2.0;
        }
    }
}
