package edu.insightr.gildedrose;

import java.util.List;

public class Inventory {


    private Item[] items;
    //private List<Item> items ;

    public Inventory(Item[] items) {
        super();
        this.items = items;
    }




    // changer le constructeur pour ajouter des instances de A, B ou C
    public Inventory() {
        super();
        items = new Item[]{
                new DexterityItem("+5 Dexterity Vest", 10, 20),
                new AgedBrieItem("Aged Brie", 2, 0),
                new ElixirItem("ElixirItem of the Mongoose", 5, 7),
                new SulfurasItem("Sulfuras, Hand of Ragnaros", 0, 80),
                new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new ConjuredItem("Conjured Mana Cake", 3, 6)
        };

    }

    public void printInventory() {
        System.out.println("***************");
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("***************");
        System.out.println("\n");
    }


    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName() != "Aged Brie"
                    && items[i].getName() != "Backstage passes to a TAFKAL80ETC concert") {
                if (items[i].getQuality() > 0) {
                    if (items[i].getName() != "Sulfuras, Hand of Ragnaros") {
                        items[i].setQuality(items[i].getQuality() - 1);
                    }
                }
            } else {
                if (items[i].getQuality() < 50) {
                    items[i].setQuality(items[i].getQuality() + 1);

                    if (items[i].getName() == "Backstage passes to a TAFKAL80ETC concert") {
                        if (items[i].getSellIn() < 11) {
                            if (items[i].getQuality() < 50) {
                                items[i].setQuality(items[i].getQuality() + 1);
                            }
                        }

                        if (items[i].getSellIn() < 6) {
                            if (items[i].getQuality() < 50) {
                                items[i].setQuality(items[i].getQuality() + 1);
                            }
                        }
                    }
                }
            }

            if (items[i].getName() != "Sulfuras, Hand of Ragnaros") {
                items[i].setSellIn(items[i].getSellIn() - 1);
            }

            if (items[i].getSellIn() < 0) {
                if (items[i].getName() != "Aged Brie") {
                    if (items[i].getName() != "Backstage passes to a TAFKAL80ETC concert") {
                        if (items[i].getQuality() > 0) {
                            if (items[i].getName() != "Sulfuras, Hand of Ragnaros") {
                                items[i].setQuality(items[i].getQuality() - 1);
                            }
                        }
                    } else {
                        items[i].setQuality(items[i].getQuality() - items[i].getQuality());
                    }
                } else {
                    if (items[i].getQuality() < 50) {
                        items[i].setQuality(items[i].getQuality() + 1);
                    }
                }
            }
        }
    }



    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        /*
        for (int i = 0; i < 10; i++) {
            inventory.updateQuality();
            inventory.printInventory();
        }*/
            inventory.updateInventory();
            inventory.printInventory();

    }

    // changer updateInventory pour créer une instance de update visitor qui sera utilisé pour visiter chaque item de la liste
    public void updateInventory() {
        UpdateVisitor visitor = new UpdateVisitor();
        Item[] items = this.items;
        items[0] = new DexterityItem("+5 Dexterity Vest", 10, 20);
        for( int i=0 ; i < items.length ; i++ ){
            items[i].accept( visitor);
        }

    }

    public Item[] getItems() {
        return items;
    }
}
