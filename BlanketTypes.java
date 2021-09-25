public class BlanketTypes implements BlanketTypesInterface {
     
    private Blankets []types = new Blankets[5];
    private int index;
     
    @Override
	public void addBlanket(String name,double price){
        int i = index++;
        types[i] = new Blankets(i,name,price);
    }
     
    @Override
	public Blankets[] getBlankets(){
        return types;
    }
}