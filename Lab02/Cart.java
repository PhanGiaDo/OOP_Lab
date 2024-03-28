public class Cart {
    public static final int MAX_NUMBER_ODERED = 21;
    private DVD itemOrdered[] = new DVD[MAX_NUMBER_ODERED];
    private int qtyOrdered = 0;
    
    public void removeDVD(DVD disc, int i){
        itemOrdered[i] = disc;
    }

    public void addDVD(DVD disc){
        if(this.qtyOrdered < MAX_NUMBER_ODERED){
            this.qtyOrdered++;
            itemOrdered[qtyOrdered] = disc;
            System.out.println("The disc has been added");
        }
        else 
            System.out.println("The cart is full");
        if(this.qtyOrdered >= MAX_NUMBER_ODERED - 2)
            System.out.println("The cart is almost full");
    }

    public double totalCost(){
        double total = 0;
        for(int i = 1 ; i <= qtyOrdered ; i++)
            total = total + itemOrdered[i].getCost();
        return total;
    }
}