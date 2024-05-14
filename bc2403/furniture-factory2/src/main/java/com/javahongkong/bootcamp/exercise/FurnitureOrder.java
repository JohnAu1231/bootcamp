package com.javahongkong.bootcamp.exercise;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
       this.ordersOfFurnitures =  new HashMap<Furniture, Integer>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        this.ordersOfFurnitures.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        HashMap<Furniture, Integer> map = new HashMap<Furniture, Integer>();
        // for (Furniture f : ordersOfFurnitures.keySet()) {
        //     map.put(f, null);
        // }
        map = this.ordersOfFurnitures;
       return map;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        int cost = 0;
        for (Furniture f: ordersOfFurnitures.keySet()) {
            cost += getTypeCost(f);
        }
        return cost;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        if (this.ordersOfFurnitures.get(type) == null)
            return 0;
        return this.ordersOfFurnitures.get(type);
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        return this.getTypeCount(type) * type.cost();
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        int sum = 0;
        for (int i: this.ordersOfFurnitures.values()) {
            sum += i;
        }
        return sum;
    }
}