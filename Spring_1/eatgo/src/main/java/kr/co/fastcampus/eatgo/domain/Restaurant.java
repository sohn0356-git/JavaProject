package kr.co.fastcampus.eatgo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {

    @Setter
    private String name;
    private String address;

    @Id
    @Setter
    @GeneratedValue
    private Long id;

    @Transient
    private List<MenuItem> menuItems;

    public String getInformation() {
        return name + " in " +address;
    }


    public void addMenuItem(MenuItem menuItem) {

        menuItems.add(menuItem);
    }

    public void setMenuItem(List<MenuItem> menuItems) {
        this.menuItems = new ArrayList<>(menuItems);
    }

    public void updateInformation(String name, String address) {
        this.name  = name;
        this.address = address;
    }
}
