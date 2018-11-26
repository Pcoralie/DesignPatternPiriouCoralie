package edu.insightr.gildedrose;

public class BackstageItem  extends Item{
    public BackstageItem(){
        super();
    }

    public BackstageItem(String name, int sellIn, int quality){
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
