package kr.co.fastcampus.eatgo.domain;

import java.sql.PreparedStatement;
import java.util.List;

public interface RestaurantRepository {
    List<Restaurant> findAll();

    Restaurant findById(Long id);

    Restaurant save(Restaurant restaurant);
}
