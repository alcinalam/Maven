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
        this.ordersOfFurnitures = new HashMap<Furniture,Integer>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        this.ordersOfFurnitures.put(type,furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return this.ordersOfFurnitures;
            
    }
        
    public float getTotalOrderCost() {
        // float orderCost = 0;
        // for (Furniture furniture : this.ordersOfFurnitures.keySet()){
        //     orderCost += this.ordersOfFurnitures.get(furniture) * furniture.cost();
        // }
        
        // return orderCost;

        double totalOrderCost = getOrderedFurniture().entrySet().stream()//
        .mapToDouble(entry -> entry.getValue() * entry.getKey().cost())//
        .sum();
        return (float) totalOrderCost;

    
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        int typeCount = getOrderedFurniture().entrySet().stream()//
        .filter(entry -> entry.getKey().equals(type))
        .mapToInt(entry -> entry.getValue())//
        .sum();
        return typeCount;
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        float unitPrice = 0;
        for (Furniture f : Furniture.values()){
            if (type.name()== f.name()){
                unitPrice = f.cost();
            }
        }
        if (getTypeCount(type) < 0) {
            return 0.0f;            
        }
        return getTypeCount(type) * unitPrice;
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        
        return getOrderedFurniture().entrySet().stream()//
            .mapToInt(entry -> entry.getValue())//
            .sum();
    }
}