package com.example.natasha.bookkeepingbuddy.model;

import java.util.ArrayList;

/**
 * Created by Natasha on 4/21/2017.
 */

public class ProductTemplate {
  private String productName;
  private double price;
  private ArrayList<ProductTemplateComponent> materialsNeeded;

  public ProductTemplate(String productName, double price, ArrayList<ProductTemplateComponent> materialsNeeded) {
    this.productName = productName;
    this.price = price;
    this.materialsNeeded = materialsNeeded;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public ArrayList<ProductTemplateComponent> getMaterialsNeeded() { return materialsNeeded; }

  public void addComponent(ProductTemplateComponent component) {
    materialsNeeded.add(component);
  }

  public void removeComponent(ProductTemplateComponent component) {
    materialsNeeded.remove(component);
  }
}
