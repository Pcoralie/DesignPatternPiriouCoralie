package edu.insightr.gildedrose;

public class AgedBrieItem extends Item{
    public AgedBrieItem(){
        super();
    }

    public AgedBrieItem(String name, int sellIn, int quality){
        super();
        this.setName(name);
        this.setSellIn(sellIn);
        this.setQuality(quality);
    }

    @Override
    public void accept( IVisitor v ){
        v.visit(this);
    }

}
