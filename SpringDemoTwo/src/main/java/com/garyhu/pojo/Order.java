package com.garyhu.pojo;

/**
 * @author: garyhu
 * @Since: 2017/11/15 0015.
 * @Decription:
 */
public class Order {
    private Item item;
    private String itemName;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
