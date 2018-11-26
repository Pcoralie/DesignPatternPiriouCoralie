package edu.insightr.gildedrose;

public class ConjuredItem extends Item {

    public ConjuredItem(){
        super();
    }

    public ConjuredItem(String name, int sellIn, int quality){
        super();
        this.setName(name);
        this.setSellIn(sellIn);
        this.setQuality(quality);
    }

    @Override
    public void accept( IVisitor v ){
        v.visit( this);
    }

}
