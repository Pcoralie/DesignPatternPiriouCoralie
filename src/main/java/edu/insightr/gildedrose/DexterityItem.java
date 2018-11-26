package edu.insightr.gildedrose;

public class DexterityItem extends Item{

    public DexterityItem(){
        super();
    }

    public DexterityItem(String name, int sellIn, int quality){
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
