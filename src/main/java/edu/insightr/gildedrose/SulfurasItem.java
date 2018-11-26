package edu.insightr.gildedrose;

public class SulfurasItem extends Item {

    public SulfurasItem(){
        super();
    }

    public SulfurasItem(String name, int sellIn, int quality){
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
