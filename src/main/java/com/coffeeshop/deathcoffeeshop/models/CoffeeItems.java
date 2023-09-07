package com.coffeeshop.deathcoffeeshop.models;


import jakarta.persistence.*;


@Entity
@Table(name = "coffee_items")
public class CoffeeItems {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name ="name")
    private String name;


    @Column(name ="roast")
    private String roast;

    @Column(name ="price")
    private String price;

    @Column(name ="size")
    private String size;

    public CoffeeItems(Long id, String name, String roast, String price, String size) {
        this.id = id;
        this.name = name;
        this.roast = roast;
        this.price = price;
        this.size = size;
    }

    public CoffeeItems() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoast() {
        return roast;
    }

    public void setRoast(String roast) {
        this.roast = roast;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "CoffeeItems{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roast='" + roast + '\'' +
                ", price='" + price + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

