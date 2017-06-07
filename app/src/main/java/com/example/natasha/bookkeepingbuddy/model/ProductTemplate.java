package com.example.natasha.bookkeepingbuddy.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Natasha on 4/21/2017.
 */

public class ProductTemplate {
  private int id;
  private String productName;
  private double price;
  private List<ProductTemplateComponent> materialsNeeded;

  public ProductTemplate(String productName, double price, List<ProductTemplateComponent> materialsNeeded) {
    this.productName = productName;
    this.price = price;
    this.materialsNeeded = materialsNeeded;
  }

  public ProductTemplate(int id, String productName, double price, List<ProductTemplateComponent> materialsNeeded) {
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

  public int getId() { return id;}

  public void setId(int id) { this.id = id; }

  public String categoriesText() {
    String ret = "materials needed: ";
    ProductTemplateComponent curComponent;

    for (int i = 0; i < materialsNeeded.size(); i ++) {
      curComponent = materialsNeeded.get(i);

      if (i == materialsNeeded.size() - 1)
        ret += curComponent.getCategory().toString() + " (" + curComponent.getQuantityNeeded() + " " + curComponent.getCategory().getUnit() + ") ";
      else
        ret += materialsNeeded.get(i).getCategory().toString() + " (" + curComponent.getQuantityNeeded() + " " + curComponent.getCategory().getUnit() + "), ";
    }
    return ret;
  }

  public List<ProductTemplateComponent> getMaterialsNeeded() { return materialsNeeded; }

  public void addComponent(ProductTemplateComponent component) {
    materialsNeeded.add(component);
  }

  public void removeComponent(ProductTemplateComponent component) {
    materialsNeeded.remove(component);
  }
}
