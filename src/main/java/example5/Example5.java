package example5;

import java.util.Optional;
import java.util.function.Function;

public class Example5 {
    public static void main(String[] args) {
        City city = new City("Kyiv");
        Address address = new Address(city);
//        Address address = null;
        User user = new User(address);

        String name = null;
        if (user != null) {
            Address address1 = user.getAddress();
            if (address1 != null) {
                City city1 = address1.getCity();
                if (city1 != null) {
                    name = city1.getName();
                }
            }
        }


        System.out.println(name);


//        Function<User, Address> userAddressFunction = (User u) -> u.getAddress();
        Function<User, Address> userAddressFunction = User::getAddress;
        String cityName = Optional.ofNullable(user)
                .map(userAddressFunction) // user into address
                .map(a -> a.getCity())
                .map(c -> c.getName())
                .orElse(null);

        System.out.println(cityName);
    }
}

class User {
    private Address address;

    User(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}

class Address {
    private City city;

    public Address(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }
}

class City {
    private String name;

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
