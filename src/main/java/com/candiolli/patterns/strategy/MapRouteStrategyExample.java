package com.candiolli.patterns.strategy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MapRouteStrategyExample {

    /**
     * I want to create an application to calculare the route to reach a certain location
     *
     * Types: car, bike, bus
     */

    interface Transportation {
        Float calculateRoute();
    }

    class Car implements Transportation {

        @Override
        public Float calculateRoute() {
            return 0f;
        }
    }

    class Bike implements Transportation {

        @Override
        public Float calculateRoute() {
            return 0f;
        }
    }

    class Bus implements Transportation {

        @Override
        public Float calculateRoute() {
            return 0f;
        }
    }

    class RouteApi {
        private Transportation transportation;

        public RouteApi(Transportation transportation) {
            this.transportation = transportation;
        }

        public Float calculateRoute() {
            return transportation.calculateRoute();
        }
    }

    public void test() {

        ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();


        Car car = new Car();

        RouteApi routeApi = new RouteApi(car);

        Float v = routeApi.calculateRoute();
    }

    public static void main(String[] args) {
        new MapRouteStrategyExample().test();
    }
}
